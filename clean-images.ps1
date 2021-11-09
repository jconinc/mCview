$Path              = [string](Get-Location)
$Input             = Get-Item "$Path\src\main\resources\templates\*html"
$TargetString      = '/img/'
$ReplacementString = 'img/'
$Input | ForEach-Object {
    (Get-Content -Path $_.FullName).Replace($TargetString,$ReplacementString) | Set-Content -Path $_.FullName
}
