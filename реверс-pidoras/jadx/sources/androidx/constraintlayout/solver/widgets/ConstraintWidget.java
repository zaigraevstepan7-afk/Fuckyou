package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public boolean measured;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public WidgetRun getRun(int orientation) {
        if (orientation == 0) {
            return this.horizontalRun;
        }
        if (orientation == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public void setInVirtualLayout(boolean inVirtualLayout) {
        this.mInVirtuaLayout = inVirtualLayout;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int maxWidth) {
        this.mMaxDimension[0] = maxWidth;
    }

    public void setMaxHeight(int maxHeight) {
        this.mMaxDimension[1] = maxHeight;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean hasBaseline) {
        this.hasBaseline = hasBaseline;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean inPlaceholder) {
        this.inPlaceholder = inPlaceholder;
    }

    protected void setInBarrier(int orientation, boolean value) {
        this.mIsInBarrier[orientation] = value;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        this.mWeight[0] = -1.0f;
        this.mWeight[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMaxDimension[0] = Integer.MAX_VALUE;
        this.mMaxDimension[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.isTerminalWidget[0] = true;
        this.isTerminalWidget[1] = true;
        this.mInVirtuaLayout = false;
        this.mIsInBarrier[0] = false;
        this.mIsInBarrier[1] = false;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int x, int y, int width, int height) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = DEFAULT_BIAS;
        this.mVerticalBiasPercent = DEFAULT_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = x;
        this.mY = y;
        this.mWidth = width;
        this.mHeight = height;
        addAnchors();
    }

    public ConstraintWidget(int width, int height) {
        this(0, 0, width, height);
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(ConstraintWidget widget) {
        this.mParent = widget;
    }

    public void setWidthWrapContent(boolean widthWrapContent) {
        this.mIsWidthWrapContent = widthWrapContent;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean heightWrapContent) {
        this.mIsHeightWrapContent = heightWrapContent;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(ConstraintWidget target, float angle, int radius) {
        immediateConnect(ConstraintAnchor.Type.CENTER, target, ConstraintAnchor.Type.CENTER, radius, 0);
        this.mCircleConstraintAngle = angle;
    }

    public String getType() {
        return this.mType;
    }

    public void setType(String type) {
        this.mType = type;
    }

    public void setVisibility(int visibility) {
        this.mVisibility = visibility;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(String name) {
        this.mDebugName = name;
    }

    public void setDebugSolverName(LinearSystem system, String name) {
        this.mDebugName = name;
        SolverVariable left = system.createObjectVariable(this.mLeft);
        SolverVariable top = system.createObjectVariable(this.mTop);
        SolverVariable right = system.createObjectVariable(this.mRight);
        SolverVariable bottom = system.createObjectVariable(this.mBottom);
        left.setName(name + ".left");
        top.setName(name + ".top");
        right.setName(name + ".right");
        bottom.setName(name + ".bottom");
        if (this.mBaselineDistance > 0) {
            SolverVariable baseline = system.createObjectVariable(this.mBaseline);
            baseline.setName(name + ".baseline");
        }
    }

    public void createObjectVariables(LinearSystem system) {
        system.createObjectVariable(this.mLeft);
        system.createObjectVariable(this.mTop);
        system.createObjectVariable(this.mRight);
        system.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            system.createObjectVariable(this.mBaseline);
        }
    }

    public String toString() {
        return (this.mType != null ? "type: " + this.mType + " " : "") + (this.mDebugName != null ? "id: " + this.mDebugName + " " : "") + "(" + this.mX + ", " + this.mY + ") - (" + this.mWidth + " x " + this.mHeight + ")";
    }

    public int getX() {
        if (this.mParent != null && (this.mParent instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) this.mParent).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        if (this.mParent != null && (this.mParent instanceof ConstraintWidgetContainer)) {
            return ((ConstraintWidgetContainer) this.mParent).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int w;
        int w2 = this.mWidth;
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultWidth == 1) {
                w = Math.max(this.mMatchConstraintMinWidth, w2);
            } else if (this.mMatchConstraintMinWidth > 0) {
                w = this.mMatchConstraintMinWidth;
                this.mWidth = w;
            } else {
                w = 0;
            }
            if (this.mMatchConstraintMaxWidth > 0 && this.mMatchConstraintMaxWidth < w) {
                return this.mMatchConstraintMaxWidth;
            }
            return w;
        }
        return w2;
    }

    public int getOptimizerWrapHeight() {
        int h;
        int h2 = this.mHeight;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                h = Math.max(this.mMatchConstraintMinHeight, h2);
            } else if (this.mMatchConstraintMinHeight > 0) {
                h = this.mMatchConstraintMinHeight;
                this.mHeight = h;
            } else {
                h = 0;
            }
            if (this.mMatchConstraintMaxHeight > 0 && this.mMatchConstraintMaxHeight < h) {
                return this.mMatchConstraintMaxHeight;
            }
            return h;
        }
        return h2;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int orientation) {
        if (orientation == 0) {
            return getWidth();
        }
        if (orientation == 1) {
            return getHeight();
        }
        return 0;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public int getHorizontalMargin() {
        int margin = this.mLeft != null ? 0 + this.mLeft.mMargin : 0;
        if (this.mRight != null) {
            return margin + this.mRight.mMargin;
        }
        return margin;
    }

    public int getVerticalMargin() {
        int margin = this.mLeft != null ? 0 + this.mTop.mMargin : 0;
        if (this.mRight != null) {
            return margin + this.mBottom.mMargin;
        }
        return margin;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int orientation) {
        if (orientation == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (orientation == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int x) {
        this.mX = x;
    }

    public void setY(int y) {
        this.mY = y;
    }

    public void setOrigin(int x, int y) {
        this.mX = x;
        this.mY = y;
    }

    public void setOffset(int x, int y) {
        this.mOffsetX = x;
        this.mOffsetY = y;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int goneMargin) {
        switch (type) {
            case LEFT:
                this.mLeft.mGoneMargin = goneMargin;
                break;
            case TOP:
                this.mTop.mGoneMargin = goneMargin;
                break;
            case RIGHT:
                this.mRight.mGoneMargin = goneMargin;
                break;
            case BOTTOM:
                this.mBottom.mGoneMargin = goneMargin;
                break;
        }
    }

    public void setWidth(int w) {
        this.mWidth = w;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setHeight(int h) {
        this.mHeight = h;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setLength(int length, int orientation) {
        if (orientation == 0) {
            setWidth(length);
        } else if (orientation == 1) {
            setHeight(length);
        }
    }

    public void setHorizontalMatchStyle(int horizontalMatchStyle, int min, int max, float percent) {
        this.mMatchConstraintDefaultWidth = horizontalMatchStyle;
        this.mMatchConstraintMinWidth = min;
        this.mMatchConstraintMaxWidth = max == Integer.MAX_VALUE ? 0 : max;
        this.mMatchConstraintPercentWidth = percent;
        if (percent > 0.0f && percent < 1.0f && this.mMatchConstraintDefaultWidth == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setVerticalMatchStyle(int verticalMatchStyle, int min, int max, float percent) {
        this.mMatchConstraintDefaultHeight = verticalMatchStyle;
        this.mMatchConstraintMinHeight = min;
        this.mMatchConstraintMaxHeight = max == Integer.MAX_VALUE ? 0 : max;
        this.mMatchConstraintPercentHeight = percent;
        if (percent > 0.0f && percent < 1.0f && this.mMatchConstraintDefaultHeight == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setDimensionRatio(String ratio) {
        int commaIndex;
        if (ratio == null || ratio.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int dimensionRatioSide = -1;
        float dimensionRatio = 0.0f;
        int len = ratio.length();
        int commaIndex2 = ratio.indexOf(44);
        if (commaIndex2 > 0 && commaIndex2 < len - 1) {
            String dimension = ratio.substring(0, commaIndex2);
            if (dimension.equalsIgnoreCase("W")) {
                dimensionRatioSide = 0;
            } else if (dimension.equalsIgnoreCase("H")) {
                dimensionRatioSide = 1;
            }
            commaIndex = commaIndex2 + 1;
        } else {
            commaIndex = 0;
        }
        int colonIndex = ratio.indexOf(58);
        if (colonIndex >= 0 && colonIndex < len - 1) {
            String nominator = ratio.substring(commaIndex, colonIndex);
            String denominator = ratio.substring(colonIndex + 1);
            if (nominator.length() > 0 && denominator.length() > 0) {
                try {
                    float nominatorValue = Float.parseFloat(nominator);
                    float denominatorValue = Float.parseFloat(denominator);
                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                        dimensionRatio = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                    }
                } catch (NumberFormatException e) {
                }
            }
        } else {
            String r = ratio.substring(commaIndex);
            if (r.length() > 0) {
                try {
                    dimensionRatio = Float.parseFloat(r);
                } catch (NumberFormatException e2) {
                }
            }
        }
        if (dimensionRatio > 0.0f) {
            this.mDimensionRatio = dimensionRatio;
            this.mDimensionRatioSide = dimensionRatioSide;
        }
    }

    public void setDimensionRatio(float ratio, int dimensionRatioSide) {
        this.mDimensionRatio = ratio;
        this.mDimensionRatioSide = dimensionRatioSide;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float horizontalBiasPercent) {
        this.mHorizontalBiasPercent = horizontalBiasPercent;
    }

    public void setVerticalBiasPercent(float verticalBiasPercent) {
        this.mVerticalBiasPercent = verticalBiasPercent;
    }

    public void setMinWidth(int w) {
        if (w < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = w;
        }
    }

    public void setMinHeight(int h) {
        if (h < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = h;
        }
    }

    public void setDimension(int w, int h) {
        this.mWidth = w;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
        this.mHeight = h;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setFrame(int left, int top, int right, int bottom) {
        int w = right - left;
        int h = bottom - top;
        this.mX = left;
        this.mY = top;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && w < this.mWidth) {
            w = this.mWidth;
        }
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && h < this.mHeight) {
            h = this.mHeight;
        }
        this.mWidth = w;
        this.mHeight = h;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setFrame(int start, int end, int orientation) {
        if (orientation == 0) {
            setHorizontalDimension(start, end);
        } else if (orientation == 1) {
            setVerticalDimension(start, end);
        }
    }

    public void setHorizontalDimension(int left, int right) {
        this.mX = left;
        this.mWidth = right - left;
        if (this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setVerticalDimension(int top, int bottom) {
        this.mY = top;
        this.mHeight = bottom - top;
        if (this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    int getRelativePositioning(int orientation) {
        if (orientation == 0) {
            return this.mRelX;
        }
        if (orientation == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int offset, int orientation) {
        if (orientation == 0) {
            this.mRelX = offset;
        } else if (orientation == 1) {
            this.mRelY = offset;
        }
    }

    public void setBaselineDistance(int baseline) {
        this.mBaselineDistance = baseline;
        this.hasBaseline = baseline > 0;
    }

    public void setCompanionWidget(Object companion) {
        this.mCompanionWidget = companion;
    }

    public void setContainerItemSkip(int skip) {
        if (skip >= 0) {
            this.mContainerItemSkip = skip;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float horizontalWeight) {
        this.mWeight[0] = horizontalWeight;
    }

    public void setVerticalWeight(float verticalWeight) {
        this.mWeight[1] = verticalWeight;
    }

    public void setHorizontalChainStyle(int horizontalChainStyle) {
        this.mHorizontalChainStyle = horizontalChainStyle;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int verticalChainStyle) {
        this.mVerticalChainStyle = verticalChainStyle;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(ConstraintAnchor.Type startType, ConstraintWidget target, ConstraintAnchor.Type endType, int margin, int goneMargin) {
        ConstraintAnchor startAnchor = getAnchor(startType);
        ConstraintAnchor endAnchor = target.getAnchor(endType);
        startAnchor.connect(endAnchor, margin, goneMargin, true);
    }

    public void connect(ConstraintAnchor from, ConstraintAnchor to, int margin) {
        if (from.getOwner() == this) {
            connect(from.getType(), to.getOwner(), to.getType(), margin);
        }
    }

    public void connect(ConstraintAnchor.Type constraintFrom, ConstraintWidget target, ConstraintAnchor.Type constraintTo) {
        connect(constraintFrom, target, constraintTo, 0);
    }

    public void connect(ConstraintAnchor.Type constraintFrom, ConstraintWidget target, ConstraintAnchor.Type constraintTo, int margin) {
        if (constraintFrom == ConstraintAnchor.Type.CENTER) {
            if (constraintTo != ConstraintAnchor.Type.CENTER) {
                if (constraintTo == ConstraintAnchor.Type.LEFT || constraintTo == ConstraintAnchor.Type.RIGHT) {
                    connect(ConstraintAnchor.Type.LEFT, target, constraintTo, 0);
                    connect(ConstraintAnchor.Type.RIGHT, target, constraintTo, 0);
                    getAnchor(ConstraintAnchor.Type.CENTER).connect(target.getAnchor(constraintTo), 0);
                    return;
                } else {
                    if (constraintTo == ConstraintAnchor.Type.TOP || constraintTo == ConstraintAnchor.Type.BOTTOM) {
                        connect(ConstraintAnchor.Type.TOP, target, constraintTo, 0);
                        connect(ConstraintAnchor.Type.BOTTOM, target, constraintTo, 0);
                        getAnchor(ConstraintAnchor.Type.CENTER).connect(target.getAnchor(constraintTo), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor left = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor right = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor top = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor bottom = getAnchor(ConstraintAnchor.Type.BOTTOM);
            boolean centerX = false;
            boolean centerY = false;
            if ((left == null || !left.isConnected()) && (right == null || !right.isConnected())) {
                connect(ConstraintAnchor.Type.LEFT, target, ConstraintAnchor.Type.LEFT, 0);
                connect(ConstraintAnchor.Type.RIGHT, target, ConstraintAnchor.Type.RIGHT, 0);
                centerX = true;
            }
            if ((top == null || !top.isConnected()) && (bottom == null || !bottom.isConnected())) {
                connect(ConstraintAnchor.Type.TOP, target, ConstraintAnchor.Type.TOP, 0);
                connect(ConstraintAnchor.Type.BOTTOM, target, ConstraintAnchor.Type.BOTTOM, 0);
                centerY = true;
            }
            if (centerX && centerY) {
                getAnchor(ConstraintAnchor.Type.CENTER).connect(target.getAnchor(ConstraintAnchor.Type.CENTER), 0);
                return;
            } else if (centerX) {
                getAnchor(ConstraintAnchor.Type.CENTER_X).connect(target.getAnchor(ConstraintAnchor.Type.CENTER_X), 0);
                return;
            } else {
                if (centerY) {
                    getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(target.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0);
                    return;
                }
                return;
            }
        }
        if (constraintFrom == ConstraintAnchor.Type.CENTER_X && (constraintTo == ConstraintAnchor.Type.LEFT || constraintTo == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor left2 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor targetAnchor = target.getAnchor(constraintTo);
            ConstraintAnchor right2 = getAnchor(ConstraintAnchor.Type.RIGHT);
            left2.connect(targetAnchor, 0);
            right2.connect(targetAnchor, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(targetAnchor, 0);
            return;
        }
        if (constraintFrom == ConstraintAnchor.Type.CENTER_Y && (constraintTo == ConstraintAnchor.Type.TOP || constraintTo == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor targetAnchor2 = target.getAnchor(constraintTo);
            getAnchor(ConstraintAnchor.Type.TOP).connect(targetAnchor2, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(targetAnchor2, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(targetAnchor2, 0);
            return;
        }
        if (constraintFrom == ConstraintAnchor.Type.CENTER_X && constraintTo == ConstraintAnchor.Type.CENTER_X) {
            ConstraintAnchor left3 = getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor leftTarget = target.getAnchor(ConstraintAnchor.Type.LEFT);
            left3.connect(leftTarget, 0);
            ConstraintAnchor right3 = getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintAnchor rightTarget = target.getAnchor(ConstraintAnchor.Type.RIGHT);
            right3.connect(rightTarget, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_X).connect(target.getAnchor(constraintTo), 0);
            return;
        }
        if (constraintFrom == ConstraintAnchor.Type.CENTER_Y && constraintTo == ConstraintAnchor.Type.CENTER_Y) {
            ConstraintAnchor top2 = getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor topTarget = target.getAnchor(ConstraintAnchor.Type.TOP);
            top2.connect(topTarget, 0);
            ConstraintAnchor bottom2 = getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintAnchor bottomTarget = target.getAnchor(ConstraintAnchor.Type.BOTTOM);
            bottom2.connect(bottomTarget, 0);
            getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(target.getAnchor(constraintTo), 0);
            return;
        }
        ConstraintAnchor fromAnchor = getAnchor(constraintFrom);
        ConstraintAnchor toAnchor = target.getAnchor(constraintTo);
        if (fromAnchor.isValidConnection(toAnchor)) {
            if (constraintFrom == ConstraintAnchor.Type.BASELINE) {
                ConstraintAnchor top3 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor bottom3 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (top3 != null) {
                    top3.reset();
                }
                if (bottom3 != null) {
                    bottom3.reset();
                }
                margin = 0;
            } else if (constraintFrom == ConstraintAnchor.Type.TOP || constraintFrom == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor baseline = getAnchor(ConstraintAnchor.Type.BASELINE);
                if (baseline != null) {
                    baseline.reset();
                }
                ConstraintAnchor center = getAnchor(ConstraintAnchor.Type.CENTER);
                if (center.getTarget() != toAnchor) {
                    center.reset();
                }
                ConstraintAnchor opposite = getAnchor(constraintFrom).getOpposite();
                ConstraintAnchor centerY2 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
                if (centerY2.isConnected()) {
                    opposite.reset();
                    centerY2.reset();
                }
            } else if (constraintFrom == ConstraintAnchor.Type.LEFT || constraintFrom == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor center2 = getAnchor(ConstraintAnchor.Type.CENTER);
                if (center2.getTarget() != toAnchor) {
                    center2.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(constraintFrom).getOpposite();
                ConstraintAnchor centerX2 = getAnchor(ConstraintAnchor.Type.CENTER_X);
                if (centerX2.isConnected()) {
                    opposite2.reset();
                    centerX2.reset();
                }
            }
            fromAnchor.connect(toAnchor, margin);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor anchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer)) {
            ConstraintWidgetContainer parent = (ConstraintWidgetContainer) getParent();
            if (parent.handlesInternalConstraints()) {
                return;
            }
        }
        ConstraintAnchor left = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor right = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor top = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor bottom = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor center = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor centerX = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor centerY = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (anchor == center) {
            if (left.isConnected() && right.isConnected() && left.getTarget() == right.getTarget()) {
                left.reset();
                right.reset();
            }
            if (top.isConnected() && bottom.isConnected() && top.getTarget() == bottom.getTarget()) {
                top.reset();
                bottom.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (anchor == centerX) {
            if (left.isConnected() && right.isConnected() && left.getTarget().getOwner() == right.getTarget().getOwner()) {
                left.reset();
                right.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (anchor == centerY) {
            if (top.isConnected() && bottom.isConnected() && top.getTarget().getOwner() == bottom.getTarget().getOwner()) {
                top.reset();
                bottom.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (anchor == left || anchor == right) {
            if (left.isConnected() && left.getTarget() == right.getTarget()) {
                center.reset();
            }
        } else if ((anchor == top || anchor == bottom) && top.isConnected() && top.getTarget() == bottom.getTarget()) {
            center.reset();
        }
        anchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer)) {
            ConstraintWidgetContainer parentContainer = (ConstraintWidgetContainer) getParent();
            if (parentContainer.handlesInternalConstraints()) {
                return;
            }
        }
        int mAnchorsSize = this.mAnchors.size();
        for (int i = 0; i < mAnchorsSize; i++) {
            ConstraintAnchor anchor = this.mAnchors.get(i);
            anchor.reset();
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type anchorType) {
        switch (anchorType) {
            case LEFT:
                return this.mLeft;
            case TOP:
                return this.mTop;
            case RIGHT:
                return this.mRight;
            case BOTTOM:
                return this.mBottom;
            case BASELINE:
                return this.mBaseline;
            case CENTER:
                return this.mCenter;
            case CENTER_X:
                return this.mCenterX;
            case CENTER_Y:
                return this.mCenterY;
            case NONE:
                return null;
            default:
                throw new AssertionError(anchorType.name());
        }
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public DimensionBehaviour getDimensionBehaviour(int orientation) {
        if (orientation == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (orientation == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour behaviour) {
        this.mListDimensionBehaviors[0] = behaviour;
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour behaviour) {
        this.mListDimensionBehaviors[1] = behaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget != null && this.mLeft.mTarget.mTarget == this.mLeft) {
            return true;
        }
        if (this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight) {
            return true;
        }
        return false;
    }

    public ConstraintWidget getPreviousChainMember(int orientation) {
        if (orientation == 0) {
            if (this.mLeft.mTarget != null && this.mLeft.mTarget.mTarget == this.mLeft) {
                return this.mLeft.mTarget.mOwner;
            }
            return null;
        }
        if (orientation == 1 && this.mTop.mTarget != null && this.mTop.mTarget.mTarget == this.mTop) {
            return this.mTop.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getNextChainMember(int orientation) {
        if (orientation == 0) {
            if (this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight) {
                return this.mRight.mTarget.mOwner;
            }
            return null;
        }
        if (orientation == 1 && this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom) {
            return this.mBottom.mTarget.mOwner;
        }
        return null;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintWidget found = null;
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget tmp = this;
        while (found == null && tmp != null) {
            ConstraintAnchor anchor = tmp.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor targetOwner = anchor == null ? null : anchor.getTarget();
            ConstraintWidget target = targetOwner == null ? null : targetOwner.getOwner();
            if (target == getParent()) {
                ConstraintWidget found2 = tmp;
                return found2;
            }
            ConstraintAnchor targetAnchor = target != null ? target.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget() : null;
            if (targetAnchor != null && targetAnchor.getOwner() != tmp) {
                found = tmp;
            } else {
                tmp = target;
            }
        }
        return found;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget != null && this.mTop.mTarget.mTarget == this.mTop) {
            return true;
        }
        if (this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom) {
            return true;
        }
        return false;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintWidget found = null;
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget tmp = this;
        while (found == null && tmp != null) {
            ConstraintAnchor anchor = tmp.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor targetOwner = anchor == null ? null : anchor.getTarget();
            ConstraintWidget target = targetOwner == null ? null : targetOwner.getOwner();
            if (target == getParent()) {
                ConstraintWidget found2 = tmp;
                return found2;
            }
            ConstraintAnchor targetAnchor = target != null ? target.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget() : null;
            if (targetAnchor != null && targetAnchor.getOwner() != tmp) {
                found = tmp;
            } else {
                tmp = target;
            }
        }
        return found;
    }

    private boolean isChainHead(int orientation) {
        int offset = orientation * 2;
        return (this.mListAnchors[offset].mTarget == null || this.mListAnchors[offset].mTarget.mTarget == this.mListAnchors[offset] || this.mListAnchors[offset + 1].mTarget == null || this.mListAnchors[offset + 1].mTarget.mTarget != this.mListAnchors[offset + 1]) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem system) {
        boolean inHorizontalChain;
        boolean inVerticalChain;
        boolean horizontalParentWrapContent;
        boolean verticalParentWrapContent;
        SolverVariable top;
        int matchConstraintDefaultHeight;
        int matchConstraintDefaultWidth;
        int height;
        boolean useRatio;
        boolean wrapContent;
        int width;
        boolean applyPosition;
        boolean useRatio2;
        SolverVariable right;
        SolverVariable left;
        boolean verticalParentWrapContent2;
        boolean horizontalParentWrapContent2;
        SolverVariable bottom;
        SolverVariable baseline;
        SolverVariable top2;
        LinearSystem linearSystem;
        SolverVariable baseline2;
        SolverVariable bottom2;
        SolverVariable top3;
        int i;
        int i2;
        int i3;
        boolean applyVerticalConstraints;
        int height2;
        boolean applyPosition2;
        boolean inHorizontalChain2;
        boolean inVerticalChain2;
        SolverVariable left2 = system.createObjectVariable(this.mLeft);
        SolverVariable right2 = system.createObjectVariable(this.mRight);
        SolverVariable top4 = system.createObjectVariable(this.mTop);
        SolverVariable bottom3 = system.createObjectVariable(this.mBottom);
        SolverVariable baseline3 = system.createObjectVariable(this.mBaseline);
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.widgets++;
        }
        if (this.horizontalRun.start.resolved && this.horizontalRun.end.resolved && this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
            if (LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.graphSolved++;
            }
            system.addEquality(left2, this.horizontalRun.start.value);
            system.addEquality(right2, this.horizontalRun.end.value);
            system.addEquality(top4, this.verticalRun.start.value);
            system.addEquality(bottom3, this.verticalRun.end.value);
            system.addEquality(baseline3, this.verticalRun.baseline.value);
            if (this.mParent != null) {
                boolean horizontalParentWrapContent3 = this.mParent != null && this.mParent.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
                boolean verticalParentWrapContent3 = this.mParent != null && this.mParent.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
                if (horizontalParentWrapContent3 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                    system.addGreaterThan(system.createObjectVariable(this.mParent.mRight), right2, 0, 8);
                }
                if (verticalParentWrapContent3 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                    system.addGreaterThan(system.createObjectVariable(this.mParent.mBottom), bottom3, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.linearSolved++;
        }
        if (this.mParent == null) {
            inHorizontalChain = false;
            inVerticalChain = false;
            horizontalParentWrapContent = false;
            verticalParentWrapContent = false;
        } else {
            boolean horizontalParentWrapContent4 = this.mParent != null && this.mParent.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean verticalParentWrapContent4 = this.mParent != null && this.mParent.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            if (isChainHead(0)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                inHorizontalChain2 = true;
            } else {
                inHorizontalChain2 = isInHorizontalChain();
            }
            if (isChainHead(1)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                inVerticalChain2 = true;
            } else {
                inVerticalChain2 = isInVerticalChain();
            }
            if (!inHorizontalChain2 && horizontalParentWrapContent4 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                SolverVariable parentRight = system.createObjectVariable(this.mParent.mRight);
                system.addGreaterThan(parentRight, right2, 0, 1);
            }
            if (!inVerticalChain2 && verticalParentWrapContent4 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                SolverVariable parentBottom = system.createObjectVariable(this.mParent.mBottom);
                system.addGreaterThan(parentBottom, bottom3, 0, 1);
            }
            inHorizontalChain = inHorizontalChain2;
            inVerticalChain = inVerticalChain2;
            horizontalParentWrapContent = horizontalParentWrapContent4;
            verticalParentWrapContent = verticalParentWrapContent4;
        }
        int width2 = this.mWidth;
        if (width2 < this.mMinWidth) {
            width2 = this.mMinWidth;
        }
        int height3 = this.mHeight;
        if (height3 < this.mMinHeight) {
            height3 = this.mMinHeight;
        }
        boolean horizontalDimensionFixed = this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean verticalDimensionFixed = this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean useRatio3 = false;
        this.mResolvedDimensionRatioSide = this.mDimensionRatioSide;
        this.mResolvedDimensionRatio = this.mDimensionRatio;
        int matchConstraintDefaultWidth2 = this.mMatchConstraintDefaultWidth;
        int matchConstraintDefaultHeight2 = this.mMatchConstraintDefaultHeight;
        if (this.mDimensionRatio <= 0.0f || this.mVisibility == 8) {
            top = top4;
        } else {
            useRatio3 = true;
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && matchConstraintDefaultWidth2 == 0) {
                matchConstraintDefaultWidth2 = 3;
            }
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && matchConstraintDefaultHeight2 == 0) {
                matchConstraintDefaultHeight2 = 3;
            }
            top = top4;
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && matchConstraintDefaultWidth2 == 3 && matchConstraintDefaultHeight2 == 3) {
                setupDimensionRatio(horizontalParentWrapContent, verticalParentWrapContent, horizontalDimensionFixed, verticalDimensionFixed);
            } else {
                if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && matchConstraintDefaultWidth2 == 3) {
                    this.mResolvedDimensionRatioSide = 0;
                    width2 = (int) (this.mResolvedDimensionRatio * this.mHeight);
                    if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
                        height = height3;
                        useRatio = true;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                    } else {
                        height = height3;
                        useRatio = false;
                        matchConstraintDefaultWidth = 4;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                    }
                } else if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && matchConstraintDefaultHeight2 == 3) {
                    this.mResolvedDimensionRatioSide = 1;
                    if (this.mDimensionRatioSide == -1) {
                        this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                    }
                    int height4 = (int) (this.mResolvedDimensionRatio * this.mWidth);
                    if (this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                        height = height4;
                        useRatio = true;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
                    } else {
                        height = height4;
                        useRatio = false;
                        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
                        matchConstraintDefaultHeight = 4;
                    }
                }
                this.mResolvedMatchConstraintDefault[0] = matchConstraintDefaultWidth;
                this.mResolvedMatchConstraintDefault[1] = matchConstraintDefaultHeight;
                this.mResolvedHasRatio = useRatio;
                boolean useHorizontalRatio = !useRatio && (this.mResolvedDimensionRatioSide == 0 || this.mResolvedDimensionRatioSide == -1);
                wrapContent = this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer);
                if (wrapContent) {
                    width = width2;
                } else {
                    width = 0;
                }
                if (this.mCenter.isConnected()) {
                    applyPosition = true;
                } else {
                    applyPosition = false;
                }
                boolean isInHorizontalBarrier = this.mIsInBarrier[0];
                boolean isInVerticalBarrier = this.mIsInBarrier[1];
                if (this.mHorizontalResolution != 2) {
                    useRatio2 = useRatio;
                    right = right2;
                    left = left2;
                    verticalParentWrapContent2 = verticalParentWrapContent;
                    horizontalParentWrapContent2 = horizontalParentWrapContent;
                    bottom = bottom3;
                    baseline = baseline3;
                    top2 = top;
                } else if (!this.horizontalRun.start.resolved || !this.horizontalRun.end.resolved) {
                    char c = '\b';
                    SolverVariable parentMax = this.mParent != null ? system.createObjectVariable(this.mParent.mRight) : null;
                    SolverVariable parentMin = this.mParent != null ? system.createObjectVariable(this.mParent.mLeft) : null;
                    verticalParentWrapContent2 = verticalParentWrapContent;
                    horizontalParentWrapContent2 = horizontalParentWrapContent;
                    baseline = baseline3;
                    bottom = bottom3;
                    useRatio2 = useRatio;
                    top2 = top;
                    right = right2;
                    left = left2;
                    applyConstraints(system, true, horizontalParentWrapContent2, verticalParentWrapContent2, this.isTerminalWidget[0], parentMin, parentMax, this.mListDimensionBehaviors[0], wrapContent, this.mLeft, this.mRight, this.mX, width, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, useHorizontalRatio, inHorizontalChain, inVerticalChain, isInHorizontalBarrier, matchConstraintDefaultWidth, matchConstraintDefaultHeight, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, applyPosition);
                } else {
                    system.addEquality(left2, this.horizontalRun.start.value);
                    system.addEquality(right2, this.horizontalRun.end.value);
                    if (this.mParent == null || !horizontalParentWrapContent || !this.isTerminalWidget[0] || isInHorizontalChain()) {
                        useRatio2 = useRatio;
                        right = right2;
                        left = left2;
                        verticalParentWrapContent2 = verticalParentWrapContent;
                        horizontalParentWrapContent2 = horizontalParentWrapContent;
                        bottom = bottom3;
                        baseline = baseline3;
                        top2 = top;
                    } else {
                        system.addGreaterThan(system.createObjectVariable(this.mParent.mRight), right2, 0, 8);
                        useRatio2 = useRatio;
                        right = right2;
                        left = left2;
                        verticalParentWrapContent2 = verticalParentWrapContent;
                        horizontalParentWrapContent2 = horizontalParentWrapContent;
                        bottom = bottom3;
                        baseline = baseline3;
                        top2 = top;
                    }
                }
                boolean applyVerticalConstraints2 = true;
                if (this.verticalRun.start.resolved || !this.verticalRun.end.resolved) {
                    linearSystem = system;
                    baseline2 = baseline;
                    bottom2 = bottom;
                    top3 = top2;
                    i = 1;
                    i2 = 8;
                    i3 = 0;
                } else {
                    linearSystem = system;
                    top3 = top2;
                    linearSystem.addEquality(top3, this.verticalRun.start.value);
                    bottom2 = bottom;
                    linearSystem.addEquality(bottom2, this.verticalRun.end.value);
                    baseline2 = baseline;
                    linearSystem.addEquality(baseline2, this.verticalRun.baseline.value);
                    if (this.mParent == null) {
                        i = 1;
                        i2 = 8;
                        i3 = 0;
                    } else {
                        if (!inVerticalChain && verticalParentWrapContent2) {
                            i = 1;
                            if (this.isTerminalWidget[1]) {
                                i2 = 8;
                                i3 = 0;
                                linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), bottom2, 0, 8);
                            }
                        } else {
                            i = 1;
                        }
                        i2 = 8;
                        i3 = 0;
                    }
                    applyVerticalConstraints2 = false;
                }
                if (this.mVerticalResolution == 2) {
                    applyVerticalConstraints = applyVerticalConstraints2;
                } else {
                    applyVerticalConstraints = false;
                }
                if (applyVerticalConstraints) {
                    boolean z = (this.mListDimensionBehaviors[i] == DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer)) ? i : i3;
                    if (z == 0) {
                        height2 = height;
                    } else {
                        height2 = 0;
                    }
                    boolean z2 = (useRatio2 && (this.mResolvedDimensionRatioSide == i || this.mResolvedDimensionRatioSide == -1)) ? i : i3;
                    SolverVariable parentMax2 = this.mParent != null ? linearSystem.createObjectVariable(this.mParent.mBottom) : null;
                    SolverVariable parentMin2 = this.mParent != null ? linearSystem.createObjectVariable(this.mParent.mTop) : null;
                    if (this.mBaselineDistance > 0 || this.mVisibility == i2) {
                        linearSystem.addEquality(baseline2, top3, getBaselineDistance(), i2);
                        if (this.mBaseline.mTarget == null) {
                            if (this.mVisibility == i2) {
                                linearSystem.addEquality(baseline2, top3, i3, i2);
                            }
                            applyPosition2 = applyPosition;
                            applyConstraints(system, false, verticalParentWrapContent2, horizontalParentWrapContent2, this.isTerminalWidget[i], parentMin2, parentMax2, this.mListDimensionBehaviors[i], z, this.mTop, this.mBottom, this.mY, height2, this.mMinHeight, this.mMaxDimension[i], this.mVerticalBiasPercent, z2, inVerticalChain, inHorizontalChain, isInVerticalBarrier, matchConstraintDefaultHeight, matchConstraintDefaultWidth, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, applyPosition2);
                        } else {
                            SolverVariable baselineTarget = linearSystem.createObjectVariable(this.mBaseline.mTarget);
                            linearSystem.addEquality(baseline2, baselineTarget, 0, i2);
                            applyPosition2 = false;
                            if (verticalParentWrapContent2) {
                                SolverVariable end = linearSystem.createObjectVariable(this.mBottom);
                                linearSystem.addGreaterThan(parentMax2, end, i3, 5);
                            }
                            applyConstraints(system, false, verticalParentWrapContent2, horizontalParentWrapContent2, this.isTerminalWidget[i], parentMin2, parentMax2, this.mListDimensionBehaviors[i], z, this.mTop, this.mBottom, this.mY, height2, this.mMinHeight, this.mMaxDimension[i], this.mVerticalBiasPercent, z2, inVerticalChain, inHorizontalChain, isInVerticalBarrier, matchConstraintDefaultHeight, matchConstraintDefaultWidth, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, applyPosition2);
                        }
                    } else {
                        applyPosition2 = applyPosition;
                        applyConstraints(system, false, verticalParentWrapContent2, horizontalParentWrapContent2, this.isTerminalWidget[i], parentMin2, parentMax2, this.mListDimensionBehaviors[i], z, this.mTop, this.mBottom, this.mY, height2, this.mMinHeight, this.mMaxDimension[i], this.mVerticalBiasPercent, z2, inVerticalChain, inHorizontalChain, isInVerticalBarrier, matchConstraintDefaultHeight, matchConstraintDefaultWidth, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, applyPosition2);
                    }
                }
                if (useRatio2) {
                    if (this.mResolvedDimensionRatioSide == i) {
                        system.addRatio(bottom2, top3, right, left, this.mResolvedDimensionRatio, 8);
                    } else {
                        system.addRatio(right, left, bottom2, top3, this.mResolvedDimensionRatio, 8);
                    }
                }
                if (!this.mCenter.isConnected()) {
                    linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                    return;
                }
                return;
            }
        }
        height = height3;
        useRatio = useRatio3;
        matchConstraintDefaultWidth = matchConstraintDefaultWidth2;
        matchConstraintDefaultHeight = matchConstraintDefaultHeight2;
        this.mResolvedMatchConstraintDefault[0] = matchConstraintDefaultWidth;
        this.mResolvedMatchConstraintDefault[1] = matchConstraintDefaultHeight;
        this.mResolvedHasRatio = useRatio;
        if (useRatio) {
        }
        wrapContent = this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer);
        if (wrapContent) {
        }
        if (this.mCenter.isConnected()) {
        }
        boolean isInHorizontalBarrier2 = this.mIsInBarrier[0];
        boolean isInVerticalBarrier2 = this.mIsInBarrier[1];
        if (this.mHorizontalResolution != 2) {
        }
        boolean applyVerticalConstraints22 = true;
        if (this.verticalRun.start.resolved) {
            linearSystem = system;
            baseline2 = baseline;
            bottom2 = bottom;
            top3 = top2;
            i = 1;
            i2 = 8;
            i3 = 0;
        }
        if (this.mVerticalResolution == 2) {
        }
        if (applyVerticalConstraints) {
        }
        if (useRatio2) {
        }
        if (!this.mCenter.isConnected()) {
        }
    }

    boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void setupDimensionRatio(boolean hparentWrapContent, boolean vparentWrapContent, boolean horizontalDimensionFixed, boolean verticalDimensionFixed) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (horizontalDimensionFixed && !verticalDimensionFixed) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!horizontalDimensionFixed && verticalDimensionFixed) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (this.mMatchConstraintMinWidth > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0423 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem system, boolean isHorizontal, boolean parentWrapContent, boolean oppositeParentWrapContent, boolean isTerminal, SolverVariable parentMin, SolverVariable parentMax, DimensionBehaviour dimensionBehaviour, boolean wrapContent, ConstraintAnchor beginAnchor, ConstraintAnchor endAnchor, int beginPosition, int dimension, int minDimension, int maxDimension, float bias, boolean useRatio, boolean inChain, boolean oppositeInChain, boolean inBarrier, int matchConstraintDefault, int oppositeMatchConstraintDefault, int matchMinDimension, int matchMaxDimension, float matchPercentDimension, boolean applyPosition) {
        int dimension2;
        boolean variableSize;
        SolverVariable endTarget;
        SolverVariable beginTarget;
        int numConnections;
        SolverVariable endTarget2;
        SolverVariable end;
        boolean variableSize2;
        int matchMaxDimension2;
        int matchMinDimension2;
        boolean variableSize3;
        SolverVariable percentBegin;
        SolverVariable percentEnd;
        SolverVariable endTarget3;
        int wrapStrength;
        boolean applyStrongChecks;
        boolean applyCentering;
        SolverVariable beginTarget2;
        boolean applyBoundsCheck;
        ConstraintWidget endWidget;
        SolverVariable beginTarget3;
        int wrapStrength2;
        SolverVariable begin;
        SolverVariable endTarget4;
        int matchConstraintDefault2;
        int i;
        ConstraintWidget beginWidget;
        SolverVariable beginTarget4;
        SolverVariable begin2;
        int rangeCheckStrength;
        int boundsCheckStrength;
        int rangeCheckStrength2;
        int i2;
        SolverVariable begin3 = system.createObjectVariable(beginAnchor);
        SolverVariable end2 = system.createObjectVariable(endAnchor);
        SolverVariable beginTarget5 = system.createObjectVariable(beginAnchor.getTarget());
        SolverVariable endTarget5 = system.createObjectVariable(endAnchor.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean isBeginConnected = beginAnchor.isConnected();
        boolean isEndConnected = endAnchor.isConnected();
        boolean isCenterConnected = this.mCenter.isConnected();
        boolean variableSize4 = false;
        int numConnections2 = isBeginConnected ? 0 + 1 : 0;
        if (isEndConnected) {
            numConnections2++;
        }
        int numConnections3 = isCenterConnected ? numConnections2 + 1 : numConnections2;
        int matchConstraintDefault3 = useRatio ? 3 : matchConstraintDefault;
        switch (dimensionBehaviour) {
            case FIXED:
                variableSize4 = false;
                break;
            case WRAP_CONTENT:
                variableSize4 = false;
                break;
            case MATCH_PARENT:
                variableSize4 = false;
                break;
            case MATCH_CONSTRAINT:
                variableSize4 = matchConstraintDefault3 != 4;
                break;
        }
        boolean variableSize5 = variableSize4;
        if (this.mVisibility == 8) {
            dimension2 = 0;
            variableSize = false;
        } else {
            dimension2 = dimension;
            variableSize = variableSize5;
        }
        if (!applyPosition) {
            endTarget = endTarget5;
        } else if (!isBeginConnected && !isEndConnected && !isCenterConnected) {
            system.addEquality(begin3, beginPosition);
            endTarget = endTarget5;
        } else if (!isBeginConnected || isEndConnected) {
            endTarget = endTarget5;
        } else {
            endTarget = endTarget5;
            system.addEquality(begin3, beginTarget5, beginAnchor.getMargin(), 8);
        }
        if (!variableSize) {
            if (wrapContent) {
                system.addEquality(end2, begin3, 0, 3);
                if (minDimension > 0) {
                    i2 = 8;
                    system.addGreaterThan(end2, begin3, minDimension, 8);
                } else {
                    i2 = 8;
                }
                if (maxDimension < Integer.MAX_VALUE) {
                    system.addLowerThan(end2, begin3, maxDimension, i2);
                }
            } else {
                system.addEquality(end2, begin3, dimension2, 8);
            }
            matchMaxDimension2 = matchMaxDimension;
            beginTarget = beginTarget5;
            end = end2;
            numConnections = numConnections3;
            variableSize2 = variableSize;
            endTarget2 = endTarget;
            variableSize3 = isTerminal;
            matchMinDimension2 = matchMinDimension;
        } else if (numConnections3 == 2 || useRatio || !(matchConstraintDefault3 == 1 || matchConstraintDefault3 == 0)) {
            int matchMinDimension3 = matchMinDimension == -2 ? dimension2 : matchMinDimension;
            int matchMaxDimension3 = matchMaxDimension == -2 ? dimension2 : matchMaxDimension;
            if (dimension2 > 0 && matchConstraintDefault3 != 1) {
                dimension2 = 0;
            }
            if (matchMinDimension3 > 0) {
                system.addGreaterThan(end2, begin3, matchMinDimension3, 8);
                dimension2 = Math.max(dimension2, matchMinDimension3);
            }
            if (matchMaxDimension3 > 0) {
                boolean applyLimit = true;
                if (parentWrapContent && matchConstraintDefault3 == 1) {
                    applyLimit = false;
                }
                if (applyLimit) {
                    system.addLowerThan(end2, begin3, matchMaxDimension3, 8);
                }
                dimension2 = Math.min(dimension2, matchMaxDimension3);
            }
            if (matchConstraintDefault3 == 1) {
                if (parentWrapContent) {
                    system.addEquality(end2, begin3, dimension2, 8);
                } else if (inChain) {
                    system.addEquality(end2, begin3, dimension2, 5);
                    system.addLowerThan(end2, begin3, dimension2, 8);
                } else {
                    system.addEquality(end2, begin3, dimension2, 5);
                    system.addLowerThan(end2, begin3, dimension2, 8);
                }
                matchMaxDimension2 = matchMaxDimension3;
                beginTarget = beginTarget5;
                numConnections = numConnections3;
                variableSize2 = variableSize;
                endTarget2 = endTarget;
                variableSize3 = isTerminal;
                matchMinDimension2 = matchMinDimension3;
                end = end2;
            } else if (matchConstraintDefault3 == 2) {
                if (beginAnchor.getType() == ConstraintAnchor.Type.TOP || beginAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                    SolverVariable percentBegin2 = system.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.TOP));
                    percentBegin = percentBegin2;
                    percentEnd = system.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                } else {
                    SolverVariable percentBegin3 = system.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                    percentBegin = percentBegin3;
                    percentEnd = system.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                }
                numConnections = numConnections3;
                int matchMinDimension4 = matchMinDimension3;
                endTarget2 = endTarget;
                beginTarget = beginTarget5;
                end = end2;
                system.addConstraint(system.createRow().createRowDimensionRatio(end2, begin3, percentEnd, percentBegin, matchPercentDimension));
                variableSize2 = false;
                matchMaxDimension2 = matchMaxDimension3;
                variableSize3 = isTerminal;
                matchMinDimension2 = matchMinDimension4;
            } else {
                beginTarget = beginTarget5;
                numConnections = numConnections3;
                int matchMinDimension5 = matchMinDimension3;
                endTarget2 = endTarget;
                end = end2;
                variableSize2 = variableSize;
                matchMaxDimension2 = matchMaxDimension3;
                matchMinDimension2 = matchMinDimension5;
                variableSize3 = true;
            }
        } else {
            int d = Math.max(matchMinDimension, dimension2);
            if (matchMaxDimension > 0) {
                d = Math.min(matchMaxDimension, d);
            }
            system.addEquality(end2, begin3, d, 8);
            matchMaxDimension2 = matchMaxDimension;
            beginTarget = beginTarget5;
            end = end2;
            numConnections = numConnections3;
            variableSize2 = false;
            endTarget2 = endTarget;
            variableSize3 = isTerminal;
            matchMinDimension2 = matchMinDimension;
        }
        if (!applyPosition || inChain) {
            SolverVariable begin4 = begin3;
            int numConnections4 = numConnections;
            int i3 = 8;
            SolverVariable begin5 = parentMin;
            SolverVariable solverVariable = parentMax;
            if (numConnections4 < 2 && parentWrapContent && variableSize3) {
                system.addGreaterThan(begin4, begin5, 0, i3);
                boolean applyEnd = isHorizontal || this.mBaseline.mTarget == null;
                if (!isHorizontal && this.mBaseline.mTarget != null) {
                    ConstraintWidget target = this.mBaseline.mTarget.mOwner;
                    applyEnd = target.mDimensionRatio != 0.0f && target.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && target.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
                }
                if (applyEnd) {
                    system.addGreaterThan(solverVariable, end, 0, i3);
                    return;
                }
                return;
            }
            return;
        }
        if (!isBeginConnected && !isEndConnected && !isCenterConnected) {
            endTarget3 = endTarget2;
            wrapStrength = 5;
        } else if (isBeginConnected && !isEndConnected) {
            endTarget3 = endTarget2;
            wrapStrength = 5;
        } else if (!isBeginConnected && isEndConnected) {
            system.addEquality(end, endTarget2, -endAnchor.getMargin(), 8);
            if (parentWrapContent) {
                system.addGreaterThan(begin3, parentMin, 0, 5);
                endTarget3 = endTarget2;
                wrapStrength = 5;
            } else {
                endTarget3 = endTarget2;
                wrapStrength = 5;
            }
        } else if (isBeginConnected && isEndConnected) {
            boolean applyStrongChecks2 = false;
            boolean applyRangeCheck = false;
            int boundsCheckStrength2 = 4;
            int centeringStrength = 6;
            int rangeCheckStrength3 = parentWrapContent ? 5 : 5;
            ConstraintWidget beginWidget2 = beginAnchor.mTarget.mOwner;
            int matchConstraintDefault4 = matchConstraintDefault3;
            ConstraintWidget endWidget2 = endAnchor.mTarget.mOwner;
            ConstraintWidget parent = getParent();
            if (!variableSize2) {
                applyRangeCheck = true;
                applyStrongChecks = false;
                applyCentering = true;
            } else if (matchConstraintDefault4 == 0) {
                if (matchMaxDimension2 == 0 && matchMinDimension2 == 0) {
                    applyStrongChecks2 = true;
                    rangeCheckStrength3 = 8;
                    boundsCheckStrength2 = 8;
                    applyCentering = false;
                } else {
                    applyCentering = true;
                    boundsCheckStrength2 = 5;
                    rangeCheckStrength3 = 5;
                }
                boolean applyStrongChecks3 = applyStrongChecks2;
                boolean applyStrongChecks4 = beginWidget2 instanceof Barrier;
                if (applyStrongChecks4 || (endWidget2 instanceof Barrier)) {
                    boundsCheckStrength2 = 4;
                    applyStrongChecks = applyStrongChecks3;
                } else {
                    applyStrongChecks = applyStrongChecks3;
                }
            } else if (matchConstraintDefault4 == 1) {
                applyRangeCheck = true;
                rangeCheckStrength3 = 8;
                applyStrongChecks = false;
                applyCentering = true;
            } else if (matchConstraintDefault4 != 3) {
                applyCentering = false;
                applyStrongChecks = false;
            } else if (this.mResolvedDimensionRatioSide == -1) {
                applyRangeCheck = true;
                rangeCheckStrength3 = 8;
                boundsCheckStrength2 = 5;
                if (oppositeInChain) {
                    boundsCheckStrength2 = 5;
                    centeringStrength = 4;
                    if (parentWrapContent) {
                        centeringStrength = 5;
                        applyCentering = true;
                        applyStrongChecks = true;
                    } else {
                        applyCentering = true;
                        applyStrongChecks = true;
                    }
                } else {
                    centeringStrength = 8;
                    applyCentering = true;
                    applyStrongChecks = true;
                }
            } else {
                applyRangeCheck = true;
                if (useRatio) {
                    boolean otherSideInvariable = oppositeMatchConstraintDefault == 2 || oppositeMatchConstraintDefault == 1;
                    if (!otherSideInvariable) {
                        rangeCheckStrength3 = 8;
                        boundsCheckStrength2 = 5;
                    }
                    applyCentering = true;
                    applyStrongChecks = true;
                } else {
                    rangeCheckStrength3 = 5;
                    if (matchMaxDimension2 > 0) {
                        boundsCheckStrength2 = 5;
                        applyCentering = true;
                        applyStrongChecks = true;
                    } else if (matchMaxDimension2 != 0 || matchMinDimension2 != 0) {
                        applyCentering = true;
                        applyStrongChecks = true;
                    } else if (oppositeInChain) {
                        rangeCheckStrength3 = (beginWidget2 == parent || endWidget2 == parent) ? 5 : 4;
                        boundsCheckStrength2 = 4;
                        applyCentering = true;
                        applyStrongChecks = true;
                    } else {
                        boundsCheckStrength2 = 8;
                        applyCentering = true;
                        applyStrongChecks = true;
                    }
                }
            }
            if (applyRangeCheck) {
                beginTarget2 = beginTarget;
                if (beginTarget2 == endTarget2 && beginWidget2 != parent) {
                    applyRangeCheck = false;
                    applyBoundsCheck = false;
                }
                if (applyCentering) {
                    endWidget = endWidget2;
                    beginTarget3 = beginTarget2;
                    wrapStrength2 = 5;
                    begin = begin3;
                    endTarget4 = endTarget2;
                    matchConstraintDefault2 = matchConstraintDefault4;
                    i = 8;
                    beginWidget = beginWidget2;
                } else {
                    if (this.mVisibility == 8) {
                        centeringStrength = 4;
                    }
                    endWidget = endWidget2;
                    matchConstraintDefault2 = matchConstraintDefault4;
                    beginWidget = beginWidget2;
                    i = 8;
                    beginTarget3 = beginTarget2;
                    wrapStrength2 = 5;
                    begin = begin3;
                    endTarget4 = endTarget2;
                    system.addCentering(begin3, beginTarget2, beginAnchor.getMargin(), bias, endTarget2, end, endAnchor.getMargin(), centeringStrength);
                }
                if (this.mVisibility != i) {
                    return;
                }
                if (applyRangeCheck) {
                    if (parentWrapContent) {
                        beginTarget4 = beginTarget3;
                        endTarget3 = endTarget4;
                        if (beginTarget4 != endTarget3 && !variableSize2 && ((beginWidget instanceof Barrier) || (endWidget instanceof Barrier))) {
                            rangeCheckStrength2 = 6;
                        }
                        begin2 = begin;
                        system.addGreaterThan(begin2, beginTarget4, beginAnchor.getMargin(), rangeCheckStrength2);
                        system.addLowerThan(end, endTarget3, -endAnchor.getMargin(), rangeCheckStrength2);
                        rangeCheckStrength3 = rangeCheckStrength2;
                    } else {
                        beginTarget4 = beginTarget3;
                        endTarget3 = endTarget4;
                    }
                    rangeCheckStrength2 = rangeCheckStrength3;
                    begin2 = begin;
                    system.addGreaterThan(begin2, beginTarget4, beginAnchor.getMargin(), rangeCheckStrength2);
                    system.addLowerThan(end, endTarget3, -endAnchor.getMargin(), rangeCheckStrength2);
                    rangeCheckStrength3 = rangeCheckStrength2;
                } else {
                    beginTarget4 = beginTarget3;
                    begin2 = begin;
                    endTarget3 = endTarget4;
                }
                if (!parentWrapContent || !inBarrier || (beginWidget instanceof Barrier) || (endWidget instanceof Barrier)) {
                    rangeCheckStrength = rangeCheckStrength3;
                    boundsCheckStrength = boundsCheckStrength2;
                } else {
                    applyBoundsCheck = true;
                    rangeCheckStrength = 6;
                    boundsCheckStrength = 6;
                }
                if (applyBoundsCheck) {
                    if (applyStrongChecks && (!oppositeInChain || oppositeParentWrapContent)) {
                        int strength = boundsCheckStrength;
                        if (beginWidget == parent || endWidget == parent) {
                            strength = 6;
                        }
                        if ((beginWidget instanceof Guideline) || (endWidget instanceof Guideline)) {
                            strength = 5;
                        }
                        if ((beginWidget instanceof Barrier) || (endWidget instanceof Barrier)) {
                            strength = 5;
                        }
                        if (oppositeInChain) {
                            strength = 5;
                        }
                        boundsCheckStrength = Math.max(strength, boundsCheckStrength);
                    }
                    if (parentWrapContent) {
                        boundsCheckStrength = Math.min(rangeCheckStrength, boundsCheckStrength);
                        if (useRatio && !oppositeInChain && (beginWidget == parent || endWidget == parent)) {
                            boundsCheckStrength = 4;
                        }
                    }
                    system.addEquality(begin2, beginTarget4, beginAnchor.getMargin(), boundsCheckStrength);
                    system.addEquality(end, endTarget3, -endAnchor.getMargin(), boundsCheckStrength);
                }
                if (parentWrapContent) {
                    int margin = parentMin == beginTarget4 ? beginAnchor.getMargin() : 0;
                    if (beginTarget4 != parentMin) {
                        wrapStrength = wrapStrength2;
                        system.addGreaterThan(begin2, parentMin, margin, wrapStrength);
                    } else {
                        wrapStrength = wrapStrength2;
                    }
                } else {
                    wrapStrength = wrapStrength2;
                }
                if (parentWrapContent && variableSize2) {
                    int i4 = i;
                    if (minDimension == 0 && matchMinDimension2 == 0) {
                        if (variableSize2 && matchConstraintDefault2 == 3) {
                            system.addGreaterThan(end, begin2, 0, i4);
                        } else {
                            int i5 = 0;
                            system.addGreaterThan(end, begin2, i5, wrapStrength);
                        }
                    }
                }
            } else {
                beginTarget2 = beginTarget;
            }
            applyBoundsCheck = true;
            if (applyCentering) {
            }
            if (this.mVisibility != i) {
            }
        } else {
            endTarget3 = endTarget2;
            wrapStrength = 5;
        }
        if (parentWrapContent && variableSize3) {
            int margin2 = endAnchor.mTarget != null ? endAnchor.getMargin() : 0;
            if (endTarget3 != parentMax) {
                system.addGreaterThan(parentMax, end, margin2, wrapStrength);
            }
        }
    }

    public void updateFromSolver(LinearSystem system) {
        int left = system.getObjectVariableValue(this.mLeft);
        int top = system.getObjectVariableValue(this.mTop);
        int right = system.getObjectVariableValue(this.mRight);
        int bottom = system.getObjectVariableValue(this.mBottom);
        if (this.horizontalRun.start.resolved && this.horizontalRun.end.resolved) {
            left = this.horizontalRun.start.value;
            right = this.horizontalRun.end.value;
        }
        if (this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
            top = this.verticalRun.start.value;
            bottom = this.verticalRun.end.value;
        }
        int w = right - left;
        int h = bottom - top;
        if (w < 0 || h < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        setFrame(left, top, right, bottom);
    }

    public void copy(ConstraintWidget src, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.mHorizontalResolution = src.mHorizontalResolution;
        this.mVerticalResolution = src.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = src.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = src.mMatchConstraintDefaultHeight;
        this.mResolvedMatchConstraintDefault[0] = src.mResolvedMatchConstraintDefault[0];
        this.mResolvedMatchConstraintDefault[1] = src.mResolvedMatchConstraintDefault[1];
        this.mMatchConstraintMinWidth = src.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = src.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = src.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = src.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = src.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = src.mIsWidthWrapContent;
        this.mIsHeightWrapContent = src.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = src.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = src.mResolvedDimensionRatio;
        this.mMaxDimension = Arrays.copyOf(src.mMaxDimension, src.mMaxDimension.length);
        this.mCircleConstraintAngle = src.mCircleConstraintAngle;
        this.hasBaseline = src.hasBaseline;
        this.inPlaceholder = src.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(src.mParent);
        this.mWidth = src.mWidth;
        this.mHeight = src.mHeight;
        this.mDimensionRatio = src.mDimensionRatio;
        this.mDimensionRatioSide = src.mDimensionRatioSide;
        this.mX = src.mX;
        this.mY = src.mY;
        this.mRelX = src.mRelX;
        this.mRelY = src.mRelY;
        this.mOffsetX = src.mOffsetX;
        this.mOffsetY = src.mOffsetY;
        this.mBaselineDistance = src.mBaselineDistance;
        this.mMinWidth = src.mMinWidth;
        this.mMinHeight = src.mMinHeight;
        this.mHorizontalBiasPercent = src.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = src.mVerticalBiasPercent;
        this.mCompanionWidget = src.mCompanionWidget;
        this.mContainerItemSkip = src.mContainerItemSkip;
        this.mVisibility = src.mVisibility;
        this.mDebugName = src.mDebugName;
        this.mType = src.mType;
        this.mDistToTop = src.mDistToTop;
        this.mDistToLeft = src.mDistToLeft;
        this.mDistToRight = src.mDistToRight;
        this.mDistToBottom = src.mDistToBottom;
        this.mLeftHasCentered = src.mLeftHasCentered;
        this.mRightHasCentered = src.mRightHasCentered;
        this.mTopHasCentered = src.mTopHasCentered;
        this.mBottomHasCentered = src.mBottomHasCentered;
        this.mHorizontalWrapVisited = src.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = src.mVerticalWrapVisited;
        this.mOptimizerMeasurable = src.mOptimizerMeasurable;
        this.mGroupsToSolver = src.mGroupsToSolver;
        this.mHorizontalChainStyle = src.mHorizontalChainStyle;
        this.mVerticalChainStyle = src.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = src.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = src.mVerticalChainFixedPosition;
        this.mWeight[0] = src.mWeight[0];
        this.mWeight[1] = src.mWeight[1];
        this.mListNextMatchConstraintsWidget[0] = src.mListNextMatchConstraintsWidget[0];
        this.mListNextMatchConstraintsWidget[1] = src.mListNextMatchConstraintsWidget[1];
        this.mNextChainWidget[0] = src.mNextChainWidget[0];
        this.mNextChainWidget[1] = src.mNextChainWidget[1];
        this.mHorizontalNextWidget = src.mHorizontalNextWidget == null ? null : map.get(src.mHorizontalNextWidget);
        this.mVerticalNextWidget = src.mVerticalNextWidget != null ? map.get(src.mVerticalNextWidget) : null;
    }

    public void updateFromRuns(boolean updateHorizontal, boolean updateVertical) {
        boolean updateHorizontal2 = updateHorizontal & this.horizontalRun.isResolved();
        boolean updateVertical2 = updateVertical & this.verticalRun.isResolved();
        int left = this.horizontalRun.start.value;
        int top = this.verticalRun.start.value;
        int right = this.horizontalRun.end.value;
        int bottom = this.verticalRun.end.value;
        int h = bottom - top;
        if (right - left < 0 || h < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        int w = right - left;
        int h2 = bottom - top;
        if (updateHorizontal2) {
            this.mX = left;
        }
        if (updateVertical2) {
            this.mY = top;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (updateHorizontal2) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && w < this.mWidth) {
                w = this.mWidth;
            }
            this.mWidth = w;
            if (this.mWidth < this.mMinWidth) {
                this.mWidth = this.mMinWidth;
            }
        }
        if (updateVertical2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && h2 < this.mHeight) {
                h2 = this.mHeight;
            }
            this.mHeight = h2;
            if (this.mHeight < this.mMinHeight) {
                this.mHeight = this.mMinHeight;
            }
        }
    }
}
