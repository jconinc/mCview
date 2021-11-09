echo Remove temp folders and directories . . .
set WD=%~dp0
if exist %WD%src\main\resources\static (
    echo removing \static . . .
    rd /S /Q %WD%src\main\resources\static
    md %WD%src\main\resources\static
)
if exist %WD%src\main\resources\templates (
    echo removing \templates . . .
    rd /S /Q %WD%src\main\resources\templates
    md %WD%src\main\resources\templates
)
if exist %WD%frontend\.next (
    echo removing \.next . . .
    rd /S /Q %WD%frontend\.next
)
if exist %WD%frontend\out (
    echo removing \out . . .
    rd /S /Q %WD%frontend\out
)
if exist %WD%target (
    echo Remove \target . . .
    rd /S /Q %WD%target
)