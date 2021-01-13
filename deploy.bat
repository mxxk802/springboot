@echo off

rem 定义文件格式声明采用UTF-8编码
chcp 65001
echo 项目名称：springboot-boot  %date:~5,2%
echo ==========================springboot-boot根目录==========================
echo 当前路径：%cd%

cd /d %cd%
rem 指定最后编译好的jar的存放位置
rem::设置项目路径
set JAR_PATH=%cd%\target
echo 要执行jar包的路径：%JAR_PATH%
cd /d %JAR_PATH%
rem 遍历当前目录(不包含子目录)
for  %%i in (*.jar) do ( call :runwith %%i )

:runwith
java -Xmx521m -jar  %1
pause>nul & goto :eof