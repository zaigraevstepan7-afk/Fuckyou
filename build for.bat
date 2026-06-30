@echo off
chcp 65001 >nul
setlocal EnableExtensions

REM Project root = this script's directory
set "PROJECT=%~dp0"
if "%PROJECT:~-1%"=="\" set "PROJECT=%PROJECT:~0,-1%"

REM Prefer NDK path from env; fallback to C:\ndk
set "NDK="
if defined ANDROID_NDK_HOME set "NDK=%ANDROID_NDK_HOME%\ndk-build.cmd"
if defined ANDROID_NDK_ROOT set "NDK=%ANDROID_NDK_ROOT%\ndk-build.cmd"
if defined NDK_HOME set "NDK=%NDK_HOME%\ndk-build.cmd"
if not defined NDK set "NDK=C:\ndk\ndk-build.cmd"

if not exist "%NDK%" goto no_ndk

call "%NDK%" NDK_PROJECT_PATH="%PROJECT%" APP_BUILD_SCRIPT="%PROJECT%\jni\Android.mk" NDK_APPLICATION_MK="%PROJECT%\jni\Application.mk"
if errorlevel 1 goto build_failed

REM Sync built binaries into PC loader folder (if present)
set "LOADER_DIR="
for /d %%D in ("%PROJECT%\*dlya pc*") do if not defined LOADER_DIR set "LOADER_DIR=%%~fD"
if not defined LOADER_DIR goto no_loader

echo [INFO] Copying binaries...
set "COPIED_COUNT=0"

if exist "%PROJECT%\libs\x86_64\cheat" (
    copy /Y "%PROJECT%\libs\x86_64\cheat" "%LOADER_DIR%\cheat_x86" >nul
    echo [OK] Updated "%LOADER_DIR%\cheat_x86" (x86_64)
    set /a COPIED_COUNT+=1
)

if exist "%PROJECT%\libs\arm64-v8a\cheat" (
    copy /Y "%PROJECT%\libs\arm64-v8a\cheat" "%LOADER_DIR%\cheat_arm" >nul
    echo [OK] Updated "%LOADER_DIR%\cheat_arm" (arm64-v8a)
    set /a COPIED_COUNT+=1
)

if "%COPIED_COUNT%"=="0" (
    echo [WARN] No binaries found in "%PROJECT%\libs". Build might have failed.
    goto done
)

if exist "%PROJECT%\jni\icons" (
    xcopy /E /I /Y "%PROJECT%\jni\icons" "%LOADER_DIR%\icons" >nul
    echo [OK] Updated "%LOADER_DIR%\icons"
)
goto done

:no_ndk
echo ERROR: ndk-build not found. Set ANDROID_NDK_HOME (or ANDROID_NDK_ROOT/NDK_HOME) or install NDK to C:\ndk.
goto fail

:build_failed
echo ERROR: build failed.
goto fail

:fail
pause
exit /b 1

:done
pause
exit /b 0
