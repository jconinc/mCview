$Path              = [string](Get-Location)
$Input             = Get-Item "$Path\src\main\resources\templates\*html"
$TargetString      = '/_next/static/'
$ReplacementString = ''
$Input | ForEach-Object {
    (Get-Content -Path $_.FullName).Replace($TargetString,$ReplacementString) | Set-Content -Path $_.FullName
}
