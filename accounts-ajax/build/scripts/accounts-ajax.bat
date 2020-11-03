@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  accounts-ajax startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and ACCOUNTS_AJAX_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\accounts-ajax.jar;%APP_HOME%\lib\jooby-netty-1.6.6.jar;%APP_HOME%\lib\common.jar;%APP_HOME%\lib\jooby-1.6.6.jar;%APP_HOME%\lib\netty-codec-http2-4.1.43.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.43.Final.jar;%APP_HOME%\lib\netty-handler-4.1.43.Final.jar;%APP_HOME%\lib\netty-codec-4.1.43.Final.jar;%APP_HOME%\lib\netty-transport-native-epoll-4.1.43.Final.jar;%APP_HOME%\lib\netty-transport-native-unix-common-4.1.43.Final.jar;%APP_HOME%\lib\netty-transport-4.1.43.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.43.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.43.Final.jar;%APP_HOME%\lib\netty-common-4.1.43.Final.jar;%APP_HOME%\lib\javassist-3.22.0-GA.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\slf4j-api-1.7.25.jar;%APP_HOME%\lib\config-1.3.3.jar;%APP_HOME%\lib\funzy-0.1.0.jar;%APP_HOME%\lib\guice-multibindings-4.2.0.jar;%APP_HOME%\lib\guice-4.2.0.jar;%APP_HOME%\lib\guava-25.1-jre.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-2.0.0.jar;%APP_HOME%\lib\error_prone_annotations-2.1.3.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\aopalliance-1.0.jar

@rem Execute accounts-ajax
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %ACCOUNTS_AJAX_OPTS%  -classpath "%CLASSPATH%" server.Server %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable ACCOUNTS_AJAX_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%ACCOUNTS_AJAX_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega