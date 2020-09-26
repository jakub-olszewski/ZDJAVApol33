@echo off

set JAVA_HOME=D:\projects\sdacademy.pl\openjdk-12.0.2_windows-x64_bin\jdk-12.0.2
set PATH=%PATH%;%JAVA_HOME%\bin

cd ..

javac -d mods/pl.sdacademy src/pl.sdacademy/module-info.java src/pl.sdacademy/pl/sdacademy/module/HelloModules.java


