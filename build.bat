@ ECHO OFF
echo BUILDING FRONTEND . . .

:BEGIN
set /p CMD=ENTER BUILD ENVIRONMENT CONFIGURATION COMMAND [local, dev, test, prod]:
if %CMD% == local goto :EXECUTE
if %CMD% == dev goto :EXECUTE
if %CMD% == test goto :EXECUTE
if %CMD% == prod goto :EXECUTE
echo INVALID INPUT
goto :BEGIN

:EXECUTE
set WD=%~dp0
call %WD%clean-temp-folders.bat
echo Navigate to frontend directory and build project . . .
cd %WD%frontend
cmd /C npm run build:%CMD%
timeout 3
call %WD%copy-frontend.bat
cd %WD%
call %WD%clean-frontend.bat
echo finished, exiting in:
timeout 3
