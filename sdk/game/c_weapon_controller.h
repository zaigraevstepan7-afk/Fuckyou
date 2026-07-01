#pragma once

enum visibilityState_t : uint8_t
{
    visibilityState_t_just_switched = 0,
    visibilityState_t_waiting_switch_animation = 1,
    visibilityState_t_set_visible = 2,
};

enum handleState_t : uint8_t
{
    handleState_t_primary = 0,
    handleState_t_secondary = 1,
    handleState_t_not_stated = 2,
};

enum class view_mode_t : uint8_t;

class c_player_controller;
class c_weapon_parameters;

#pragma pack(1)
class c_weapon_controller
{
    char __pad[0x20];
public:
    c_player_controller *m_pPlayer;
    void *m_pMecanim;
    void *m_pAnimation;
    void *m_pAnimationParameters;
    visibilityState_t m_uVisibilityState;
    char __pad1[0x3];
    view_mode_t m_viewMode;
    char __pad2[0x3];
    void *m_action0;
    void *m_action1;
    void *m_pTransform;
    void *m_aControllers;
    void *m_qword0;
    void *m_qword1;
    float m_fLocalTime;
    float m_fDeltaTime;
    void *m_pLOD;
    handleState_t m_uHandleState;
    char pad3[0x3];
    uint8_t m_uAnimationID;
    char pad4[0x3];
    void *m_psAnimationName;
    int32_t m_iOwnerID;
    int32_t m_int0;
    c_weapon_parameters *m_pParameters;
    void *m_qword2;
    void *m_pWeaponMap;
    uint8_t m_uSlotIndex;
    bool m_bIsActive;
    char pad5[0x6];
    void *m_pStatrack;
    void *m_pMaterial;
    void *m_qword3;
    void *m_qword4;
    void *m_qword5;
    void *m_qword6;
};
#pragma pack()

enum class shoot_state : uint8_t
{
    Reloading = 0,
    PreReload = 1,
    Switching = 2,
    TryToSwitch = 3,
    Ready = 4
};

enum class gun_state_t : uint8_t
{
    Aiming = 0,
    AimingReload = 1,
    NotAiming = 2,
    StartingAiming = 3,
    FinishingAiming = 4
};

enum class gun_aiming_mode_t : uint8_t
{
    NotStated = 0,
    Stopped = 2,
    LoopShooting = 3
};

class c_bullet_hit_data;

#pragma pack(1)
class c_gun_controller : public c_weapon_controller
{
public:
    safe_t<int> yaxyiznaet;
    safe_t<float > m_fTimeFiredSafe;
    safe_t<float > m_fFireIntervalSafe;
    int32_t m_iShotID;
    int32_t m_iAudioSourceIndex;
    safe_t<int> m_iCapacitySafe;
    safe_t<int> m_iAmmoSafe;
    safe_t<bool > m_bInfinityAmmoSafe;
    safe_t<bool > m_bInfinityMagazinesSafe;
    void *m_pSound;
    shoot_state m_shootState;
    char __pad0[0x7];
    void *m_qword7;
    void *m_qword8;
    void *m_pRecoilControl;
    c_gun_parameters *m_pParameters;
    void *m_pSightView;
    float m_fLastHandledShotTime;
    float m_fLastShotPlayedTime;
    void *m_pSnapshot;
    state_simple_t<uint8_t> *m_pState;
    state_simple_t<uint8_t> *m_pAimMode;
    void *m_lShotBuffer;
    void *m_lUnhandledShotBuffer;
    void *m_pCamera;
    void *m_pMuzzle;
    void *m_qword9;
    void *m_pMuzzle2;
    void *m_qword10;
    void *m_pSoundParameters;
    void *m_qword11;
    float m_fSwitchAnimConfirmDuration;
    float m_fReloadAnimConfirmDuration;
    int32_t m_iCurrentMuzzleIndex;
    safe_t<float> m_fRadiusSafe;
    safe_t<float> m_fMinRandomDegreeSafe;
    safe_t<float> m_fMaxRandomDegreeSafe;
    safe_t<float> sdfsd;
    void *zilko;
    void *zilko2;
    bool m_bool0;
    char __pad1[0x3];
    float m_fAccuracyAdditive;
    char __pad2[0x4];
    void *m_pAccuracyData;
    monoDictionary<int, monoList<c_bullet_hit_data *> *> *m_pdCharacterHits;
    void *m_qword0;
    float m_fRecoilMult;
    float m_fAccuracyMult;
    float m_fReloadCycle;
    bool penis;
};

static_assert(offsetof(c_gun_controller, m_pAimMode) == 0x180);

static_assert(offsetof(c_gun_controller, m_pdCharacterHits) == 0x220);

class c_bullet_hit_data
{
    char pad[0x10];

public:
    Vector3 start;
    Vector3 end;
    float unk;
    int m_iDamage;
};
#pragma pack()

