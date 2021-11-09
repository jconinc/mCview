echo Copy frontend static files to resource static directories . . .
set WD=%~dp0
Xcopy /S /I %WD%frontend\out\_next\static %WD%src\main\resources\static
Xcopy /I %WD%frontend\out\*.html %WD%src\main\resources\templates
Xcopy /I %WD%frontend\out\img %WD%src\main\resources\static\img
timeout 3