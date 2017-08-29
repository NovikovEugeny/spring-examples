<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script type="text/javascript" src="resources/js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.js"></script>
    <link href="resources/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="resources/js/script.js"></script>
    <title>test</title>
</head>
<body>

<button id="start" class="btn btn-success">start</button>
<button id="stop" class="btn btn-danger">stop</button>
<button id="get" class="btn btn-info">get last value</button>
<button id="getAll" class="btn btn-info">get full list</button>
<button id="clear" class="btn btn-danger">clear previous statistics</button>

<!--modal-->
<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel2">Rates:</h4>
            </div>
            <div id="content"></div>
            <div class="modal-footer">
                <button class="btn-success btn-lg" data-dismiss="modal">close</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>