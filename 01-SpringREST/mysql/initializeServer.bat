rem CREATE THE DIRECTORY FOR MYSQL INITIALIZATION
mkdir "C:\ProgramData\MySQL\MySQL Server 5.7"
copy .\my.ini "C:\ProgramData\MySQL\MySQL Server 5.7"

rem CREATE THE SUB-DIRECTORY FOR MYSQL DATA
mkdir "C:\ProgramData\MySQL\MySQL Server 5.7\data"

rem LAUNCH THE MYSQL-INITIALIZATION-PROCESS
mysqld.exe --defaults-file="C:\ProgramData\MySQL\MySQL Server 5.7\my.ini" --initialize --console

rem READ THE MYSQL-INITIALIZATION-LOGS (NOTE THE GENERATED TEMPORARY PASSWORD !!!)
[Note] A temporary password is generated for root@localhost: pHwij&Wjo96T
