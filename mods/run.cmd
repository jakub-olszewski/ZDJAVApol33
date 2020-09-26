@echo off

set JAVA_HOME=D:\projects\sdacademy.pl\openjdk-12.0.2_windows-x64_bin\jdk-12.0.2
set PATH=%PATH%;%JAVA_HOME%\bin

cd ..

java --module-path mods -m pl.sdacademy/pl.sdacademy.pl.sdacademy.module.HelloModules

pause
