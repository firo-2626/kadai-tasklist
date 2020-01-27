<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>TASK LIST</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>TASK LIST</h1>
            </div>

            <div id="content">
                <!-- 各ページのビューを表示 -->
                ${param.content }
            </div>
            <div id="footer">
                by firo
            </div>
        </div>

    </body>
</html>