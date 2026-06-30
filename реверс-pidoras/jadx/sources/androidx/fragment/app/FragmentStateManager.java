package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {
    private static final String TAG = "FragmentManager";
    private static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final String TARGET_STATE_TAG = "android:target_state";
    private static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final String VIEW_STATE_TAG = "android:view_state";
    private final FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final Fragment mFragment;
    private int mFragmentManagerState = -1;

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, Fragment fragment) {
        this.mDispatcher = dispatcher;
        this.mFragment = fragment;
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, ClassLoader classLoader, FragmentFactory fragmentFactory, FragmentState fs) {
        this.mDispatcher = dispatcher;
        this.mFragment = fragmentFactory.instantiate(classLoader, fs.mClassName);
        if (fs.mArguments != null) {
            fs.mArguments.setClassLoader(classLoader);
        }
        this.mFragment.setArguments(fs.mArguments);
        this.mFragment.mWho = fs.mWho;
        this.mFragment.mFromLayout = fs.mFromLayout;
        this.mFragment.mRestored = true;
        this.mFragment.mFragmentId = fs.mFragmentId;
        this.mFragment.mContainerId = fs.mContainerId;
        this.mFragment.mTag = fs.mTag;
        this.mFragment.mRetainInstance = fs.mRetainInstance;
        this.mFragment.mRemoving = fs.mRemoving;
        this.mFragment.mDetached = fs.mDetached;
        this.mFragment.mHidden = fs.mHidden;
        this.mFragment.mMaxState = Lifecycle.State.values()[fs.mMaxLifecycleState];
        if (fs.mSavedFragmentState != null) {
            this.mFragment.mSavedFragmentState = fs.mSavedFragmentState;
        } else {
            this.mFragment.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(TAG, "Instantiated fragment " + this.mFragment);
        }
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, Fragment retainedFragment, FragmentState fs) {
        this.mDispatcher = dispatcher;
        this.mFragment = retainedFragment;
        this.mFragment.mSavedViewState = null;
        this.mFragment.mBackStackNesting = 0;
        this.mFragment.mInLayout = false;
        this.mFragment.mAdded = false;
        this.mFragment.mTargetWho = this.mFragment.mTarget != null ? this.mFragment.mTarget.mWho : null;
        this.mFragment.mTarget = null;
        if (fs.mSavedFragmentState != null) {
            this.mFragment.mSavedFragmentState = fs.mSavedFragmentState;
        } else {
            this.mFragment.mSavedFragmentState = new Bundle();
        }
    }

    Fragment getFragment() {
        return this.mFragment;
    }

    void setFragmentManagerState(int state) {
        this.mFragmentManagerState = state;
    }

    int computeMaxState() {
        int maxState = this.mFragmentManagerState;
        if (this.mFragment.mFromLayout) {
            if (this.mFragment.mInLayout) {
                maxState = Math.max(this.mFragmentManagerState, 1);
            } else if (this.mFragmentManagerState < 2) {
                maxState = Math.min(maxState, this.mFragment.mState);
            } else {
                maxState = Math.min(maxState, 1);
            }
        }
        if (!this.mFragment.mAdded) {
            maxState = Math.min(maxState, 1);
        }
        if (this.mFragment.mRemoving) {
            if (this.mFragment.isInBackStack()) {
                maxState = Math.min(maxState, 1);
            } else {
                maxState = Math.min(maxState, -1);
            }
        }
        if (this.mFragment.mDeferStart && this.mFragment.mState < 3) {
            maxState = Math.min(maxState, 2);
        }
        switch (this.mFragment.mMaxState) {
            case RESUMED:
                return maxState;
            case STARTED:
                return Math.min(maxState, 3);
            case CREATED:
                return Math.min(maxState, 1);
            default:
                return Math.min(maxState, -1);
        }
    }

    void ensureInflatedView() {
        if (this.mFragment.mFromLayout && this.mFragment.mInLayout && !this.mFragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
            }
            this.mFragment.performCreateView(this.mFragment.performGetLayoutInflater(this.mFragment.mSavedFragmentState), null, this.mFragment.mSavedFragmentState);
            if (this.mFragment.mView != null) {
                this.mFragment.mView.setSaveFromParentEnabled(false);
                this.mFragment.mView.setTag(R.id.fragment_container_view_tag, this.mFragment);
                if (this.mFragment.mHidden) {
                    this.mFragment.mView.setVisibility(8);
                }
                this.mFragment.onViewCreated(this.mFragment.mView, this.mFragment.mSavedFragmentState);
                this.mDispatcher.dispatchOnFragmentViewCreated(this.mFragment, this.mFragment.mView, this.mFragment.mSavedFragmentState, false);
            }
        }
    }

    void restoreState(ClassLoader classLoader) {
        if (this.mFragment.mSavedFragmentState == null) {
            return;
        }
        this.mFragment.mSavedFragmentState.setClassLoader(classLoader);
        this.mFragment.mSavedViewState = this.mFragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
        this.mFragment.mTargetWho = this.mFragment.mSavedFragmentState.getString(TARGET_STATE_TAG);
        if (this.mFragment.mTargetWho != null) {
            this.mFragment.mTargetRequestCode = this.mFragment.mSavedFragmentState.getInt(TARGET_REQUEST_CODE_STATE_TAG, 0);
        }
        if (this.mFragment.mSavedUserVisibleHint != null) {
            this.mFragment.mUserVisibleHint = this.mFragment.mSavedUserVisibleHint.booleanValue();
            this.mFragment.mSavedUserVisibleHint = null;
        } else {
            this.mFragment.mUserVisibleHint = this.mFragment.mSavedFragmentState.getBoolean(USER_VISIBLE_HINT_TAG, true);
        }
        if (!this.mFragment.mUserVisibleHint) {
            this.mFragment.mDeferStart = true;
        }
    }

    void attach(FragmentHostCallback<?> host, FragmentManager fragmentManager, Fragment parentFragment) {
        this.mFragment.mHost = host;
        this.mFragment.mParentFragment = parentFragment;
        this.mFragment.mFragmentManager = fragmentManager;
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, host.getContext(), false);
        this.mFragment.performAttach();
        if (this.mFragment.mParentFragment == null) {
            host.onAttachFragment(this.mFragment);
        } else {
            this.mFragment.mParentFragment.onAttachFragment(this.mFragment);
        }
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, host.getContext(), false);
    }

    void create() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto CREATED: " + this.mFragment);
        }
        if (!this.mFragment.mIsCreated) {
            this.mDispatcher.dispatchOnFragmentPreCreated(this.mFragment, this.mFragment.mSavedFragmentState, false);
            this.mFragment.performCreate(this.mFragment.mSavedFragmentState);
            this.mDispatcher.dispatchOnFragmentCreated(this.mFragment, this.mFragment.mSavedFragmentState, false);
        } else {
            this.mFragment.restoreChildFragmentState(this.mFragment.mSavedFragmentState);
            this.mFragment.mState = 1;
        }
    }

    void createView(FragmentContainer fragmentContainer) {
        String resName;
        if (this.mFragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto CREATE_VIEW: " + this.mFragment);
        }
        ViewGroup container = null;
        if (this.mFragment.mContainer != null) {
            container = this.mFragment.mContainer;
        } else if (this.mFragment.mContainerId != 0) {
            if (this.mFragment.mContainerId == -1) {
                throw new IllegalArgumentException("Cannot create fragment " + this.mFragment + " for a container view with no id");
            }
            container = (ViewGroup) fragmentContainer.onFindViewById(this.mFragment.mContainerId);
            if (container == null && !this.mFragment.mRestored) {
                try {
                    resName = this.mFragment.getResources().getResourceName(this.mFragment.mContainerId);
                } catch (Resources.NotFoundException e) {
                    resName = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.mFragment.mContainerId) + " (" + resName + ") for fragment " + this.mFragment);
            }
        }
        this.mFragment.mContainer = container;
        this.mFragment.performCreateView(this.mFragment.performGetLayoutInflater(this.mFragment.mSavedFragmentState), container, this.mFragment.mSavedFragmentState);
        if (this.mFragment.mView != null) {
            boolean z = false;
            this.mFragment.mView.setSaveFromParentEnabled(false);
            this.mFragment.mView.setTag(R.id.fragment_container_view_tag, this.mFragment);
            if (container != null) {
                container.addView(this.mFragment.mView);
            }
            if (this.mFragment.mHidden) {
                this.mFragment.mView.setVisibility(8);
            }
            ViewCompat.requestApplyInsets(this.mFragment.mView);
            this.mFragment.onViewCreated(this.mFragment.mView, this.mFragment.mSavedFragmentState);
            this.mDispatcher.dispatchOnFragmentViewCreated(this.mFragment, this.mFragment.mView, this.mFragment.mSavedFragmentState, false);
            Fragment fragment = this.mFragment;
            if (this.mFragment.mView.getVisibility() == 0 && this.mFragment.mContainer != null) {
                z = true;
            }
            fragment.mIsNewlyAdded = z;
        }
    }

    void activityCreated() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto ACTIVITY_CREATED: " + this.mFragment);
        }
        this.mFragment.performActivityCreated(this.mFragment.mSavedFragmentState);
        this.mDispatcher.dispatchOnFragmentActivityCreated(this.mFragment, this.mFragment.mSavedFragmentState, false);
    }

    void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto RESTORE_VIEW_STATE: " + this.mFragment);
        }
        if (this.mFragment.mView != null) {
            this.mFragment.restoreViewState(this.mFragment.mSavedFragmentState);
        }
        this.mFragment.mSavedFragmentState = null;
    }

    void start() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto STARTED: " + this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    void resume() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "moveto RESUMED: " + this.mFragment);
        }
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragment.mSavedFragmentState = null;
        this.mFragment.mSavedViewState = null;
    }

    void pause() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "movefrom RESUMED: " + this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    void stop() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "movefrom STARTED: " + this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    FragmentState saveState() {
        FragmentState fs = new FragmentState(this.mFragment);
        if (this.mFragment.mState > -1 && fs.mSavedFragmentState == null) {
            fs.mSavedFragmentState = saveBasicState();
            if (this.mFragment.mTargetWho != null) {
                if (fs.mSavedFragmentState == null) {
                    fs.mSavedFragmentState = new Bundle();
                }
                fs.mSavedFragmentState.putString(TARGET_STATE_TAG, this.mFragment.mTargetWho);
                if (this.mFragment.mTargetRequestCode != 0) {
                    fs.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, this.mFragment.mTargetRequestCode);
                }
            }
        } else {
            fs.mSavedFragmentState = this.mFragment.mSavedFragmentState;
        }
        return fs;
    }

    Fragment.SavedState saveInstanceState() {
        Bundle result;
        if (this.mFragment.mState <= -1 || (result = saveBasicState()) == null) {
            return null;
        }
        return new Fragment.SavedState(result);
    }

    private Bundle saveBasicState() {
        Bundle result = new Bundle();
        this.mFragment.performSaveInstanceState(result);
        this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, result, false);
        if (result.isEmpty()) {
            result = null;
        }
        if (this.mFragment.mView != null) {
            saveViewState();
        }
        if (this.mFragment.mSavedViewState != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray(VIEW_STATE_TAG, this.mFragment.mSavedViewState);
        }
        if (!this.mFragment.mUserVisibleHint) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean(USER_VISIBLE_HINT_TAG, this.mFragment.mUserVisibleHint);
        }
        return result;
    }

    void saveViewState() {
        if (this.mFragment.mView == null) {
            return;
        }
        SparseArray<Parcelable> mStateArray = new SparseArray<>();
        this.mFragment.mView.saveHierarchyState(mStateArray);
        if (mStateArray.size() > 0) {
            this.mFragment.mSavedViewState = mStateArray;
        }
    }

    void destroy(FragmentHostCallback<?> host, FragmentManagerViewModel nonConfig) {
        boolean shouldClear;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "movefrom CREATED: " + this.mFragment);
        }
        boolean beingRemoved = this.mFragment.mRemoving && !this.mFragment.isInBackStack();
        boolean shouldDestroy = beingRemoved || nonConfig.shouldDestroy(this.mFragment);
        if (shouldDestroy) {
            if (host instanceof ViewModelStoreOwner) {
                shouldClear = nonConfig.isCleared();
            } else if (host.getContext() instanceof Activity) {
                Activity activity = (Activity) host.getContext();
                shouldClear = true ^ activity.isChangingConfigurations();
            } else {
                shouldClear = true;
            }
            if (beingRemoved || shouldClear) {
                nonConfig.clearNonConfigState(this.mFragment);
            }
            this.mFragment.performDestroy();
            this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
            return;
        }
        this.mFragment.mState = 0;
    }

    void detach(FragmentManagerViewModel nonConfig) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(TAG, "movefrom ATTACHED: " + this.mFragment);
        }
        this.mFragment.performDetach();
        boolean z = false;
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        this.mFragment.mState = -1;
        this.mFragment.mHost = null;
        this.mFragment.mParentFragment = null;
        this.mFragment.mFragmentManager = null;
        if (this.mFragment.mRemoving && !this.mFragment.isInBackStack()) {
            z = true;
        }
        boolean beingRemoved = z;
        if (beingRemoved || nonConfig.shouldDestroy(this.mFragment)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(TAG, "initState called for fragment: " + this.mFragment);
            }
            this.mFragment.initState();
        }
    }
}
