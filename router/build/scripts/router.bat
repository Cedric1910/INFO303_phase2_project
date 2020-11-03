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
@rem  router startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and ROUTER_OPTS to pass JVM options to this script.
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

set CLASSPATH=%APP_HOME%\lib\router.jar;%APP_HOME%\lib\common.jar;%APP_HOME%\lib\camel-jms-2.24.3.jar;%APP_HOME%\lib\activemq-broker-5.15.12.jar;%APP_HOME%\lib\camel-gson-2.24.3.jar;%APP_HOME%\lib\camel-jetty-2.24.3.jar;%APP_HOME%\lib\camel-http-2.24.3.jar;%APP_HOME%\lib\camel-mail-2.24.3.jar;%APP_HOME%\lib\camel-jsonpath-2.24.3.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.30.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.30.jar;%APP_HOME%\lib\activation-1.1.1.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\camel-spring-2.24.3.jar;%APP_HOME%\lib\camel-jetty9-2.24.3.jar;%APP_HOME%\lib\camel-jetty-common-2.24.3.jar;%APP_HOME%\lib\camel-http-common-2.24.3.jar;%APP_HOME%\lib\camel-core-2.24.3.jar;%APP_HOME%\lib\spring-jms-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-context-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-tx-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-aop-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-messaging-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-beans-5.1.6.RELEASE.jar;%APP_HOME%\lib\geronimo-jms_2.0_spec-1.0-alpha-2.jar;%APP_HOME%\lib\activemq-openwire-legacy-5.15.12.jar;%APP_HOME%\lib\activemq-client-5.15.12.jar;%APP_HOME%\lib\guava-28.2-jre.jar;%APP_HOME%\lib\jackson-databind-2.9.10.3.jar;%APP_HOME%\lib\jetty-servlet-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-security-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-server-9.4.12.v20180830.jar;%APP_HOME%\lib\javax.servlet-api-3.1.0.jar;%APP_HOME%\lib\commons-httpclient-3.1.jar;%APP_HOME%\lib\commons-codec-1.11.jar;%APP_HOME%\lib\javax.mail-1.6.1.jar;%APP_HOME%\lib\json-path-2.4.0.jar;%APP_HOME%\lib\json-smart-action-2.3.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\slf4j-api-1.7.30.jar;%APP_HOME%\lib\jaxb-core-2.3.0.jar;%APP_HOME%\lib\jaxb-impl-2.3.0.jar;%APP_HOME%\lib\spring-expression-5.1.6.RELEASE.jar;%APP_HOME%\lib\spring-core-5.1.6.RELEASE.jar;%APP_HOME%\lib\geronimo-jms_1.1_spec-1.1.1.jar;%APP_HOME%\lib\hawtbuf-1.11.jar;%APP_HOME%\lib\geronimo-j2ee-management_1.1_spec-1.0.1.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-2.10.0.jar;%APP_HOME%\lib\error_prone_annotations-2.3.4.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\jackson-annotations-2.9.10.jar;%APP_HOME%\lib\jackson-core-2.9.10.jar;%APP_HOME%\lib\jetty-servlets-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-client-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-jmx-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-http-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-io-9.4.12.v20180830.jar;%APP_HOME%\lib\jetty-util-9.4.12.v20180830.jar;%APP_HOME%\lib\json-smart-2.3.jar;%APP_HOME%\lib\spring-jcl-5.1.6.RELEASE.jar;%APP_HOME%\lib\jetty-continuation-9.4.12.v20180830.jar;%APP_HOME%\lib\accessors-smart-1.2.jar;%APP_HOME%\lib\asm-5.0.4.jar

@rem Execute router
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %ROUTER_OPTS%  -classpath "%CLASSPATH%" router.Router %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable ROUTER_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%ROUTER_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
