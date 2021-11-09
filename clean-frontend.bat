echo Clean static paths . . .
set WD=%~dp0
PowerShell -NoProfile -ExecutionPolicy Bypass -Command "& '%WD%clean-html.ps1'"
PowerShell -NoProfile -ExecutionPolicy Bypass -Command "& '%WD%clean-images.ps1'"