$(document).ready(function () {
    $("#start").click(function () {
        runTimer();
    });
    $("#stop").click(function () {
        stopTimer();
    });
    $("#get").click(function () {
        getLastValue();
    });
    $("#clear").click(function () {
        clear();
    });
    $("#getAll").click(function () {
        getAll();
    });
});

var intervalValueSec = 10;
var interval;

function setIntervalVar(argument) {
    interval = argument;
}

function runTimer() {
    $.ajax({
        url: "/start",
        type: 'GET',
        success: function () {
            setIntervalVar(setInterval(function(){ getCurrentValue() }, intervalValueSec * 1000));
        },
        error: function () {
            alert("timer wasn't started");
        }
    });
}

function stopTimer() {
    $.ajax({
        url: "/stop",
        type: 'GET',
        success: function () {
            clearInterval(interval);
        },
        error: function () {
            alert("timer wasn't stopped");
        }
    });
}

function getCurrentValue() {
    $.ajax({
        url: "http://apilayer.net/api/live?access_key=4b9c01f270204d06ec381e7b12b8e7e2&source=USD",
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            sendValue(data.quotes.USDBYN);
        },
        error: function () {
            alert("failed to get current value");
        }
    });
}

function sendValue(argument) {
    $.ajax({
        url: "/send",
        type: 'POST',
        data: {value: argument},
        success: function () {
        },
        error: function () {
        }
    });
}

function getLastValue() {
    $.ajax({
        url: "/get",
        type: 'GET',
        success: function (data) {
            alert("The last rate is: " + data);
        },
        error: function () {
            alert("failed to get last value");
        }
    });
}

function clear() {
    $.ajax({
        url: "/clear",
        type: 'POST',
        success: function () {
            alert("The previous statistics was cleared");
        },
        error: function () {
            alert("failed to clear statistics");
        }
    });
}

function getAll() {
    $.ajax({
        url: "/get-all",
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            $("#content").empty();
            $.each(data, function(i, obj) {
                $("#content").append(
                    "<ul>" +
                    "<li>" + obj.value + "</li>" +
                    "<li>" + obj.date + "</li>" +
                    "<hr>" +
                    "</ul>"
                );
            });
            $("#modal").modal('show');
        },
        error: function () {
            alert("failed to get rate list!");
        }
    });
}