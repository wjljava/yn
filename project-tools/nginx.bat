@echo off
rem yn-tools
rem author: wangjianlong http://www.yinuocredit.cn
rem GitHub: https://github.com/wangjianlong
rem OsChina: http://git.oschina.net/wangjianlong/yn

echo ==================begin========================

cls 
SET NGINX_PATH=D:
SET NGINX_DIR=D:\nginx-1.11.11\
color 0a 
TITLE yn-tools Power By wangjianlong (http://www.yinuocredit.cn)

CLS 

ECHO. 
ECHO.    ********************************************************************
ECHO.    *                                                                  *
ECHO.    *                                                                  *
ECHO.    *   yn-tools Power By wangjianlong (http://www.yinuocredit.cn)    *
ECHO.    *                                                                  *
ECHO.    *                                                                  *
ECHO.    ********************************************************************
ECHO. 

:MENU 

ECHO.---------------------------- nginx �����б� --------------------------------
tasklist|findstr /i "nginx.exe"
if ERRORLEVEL 1 (echo nginxδ����) else (echo nginx������)
ECHO.----------------------------------------------------------------------------


ECHO. 
	ECHO.  [1] ����Nginx  
	ECHO.  [2] �ر�Nginx  
	ECHO.  [3] ����Nginx  
	ECHO.  [4] �� �� 
ECHO. 

ECHO.������ѡ����Ŀ�����:
set /p ID=
	IF "%id%"=="1" GOTO start 
	IF "%id%"=="2" GOTO stop 
	IF "%id%"=="3" GOTO restart 
	IF "%id%"=="4" EXIT
PAUSE 

:start 
	call :startNginx
	ECHO.============================================================================
	ECHO. 
	ECHO. 
	GOTO MENU

:stop 
	call :shutdownNginx
	ECHO.============================================================================
	ECHO. 
	ECHO. 
	GOTO MENU
:restart 
	call :shutdownNginx
	call :startNginx
	ECHO.============================================================================
	ECHO. 
	ECHO. 
	GOTO MENU

:shutdownNginx
	ECHO. 
	ECHO.�ر�Nginx...... 
	taskkill /F /IM nginx.exe > nul
	ECHO.OK,�ر�����nginx ����
	goto :eof

:startNginx
	ECHO. 
	ECHO.����Nginx...... 
	IF NOT EXIST "%NGINX_DIR%nginx.exe" ECHO "%NGINX_DIR%nginx.exe"������ 

	%NGINX_PATH% 

	cd "%NGINX_DIR%" 

	IF EXIST "%NGINX_DIR%nginx.exe" (
		echo "start '' nginx.exe"
		start "" nginx.exe
	)
	ECHO.OK
	goto :eof