$("#openWardrobe").click(open);

function open() {
    $.get("/api/wardrobe/open", function (data) {
        alert(data);
    });
    $("#openWardrobe").hide();
    $("#getOutWardrobe").hide();
    $("#closeWardrobe").show();
    $("#getInWardrobe").show();
    $("#kickWardrobe").show();
}

$("#closeWardrobe").click(close);

function close() {
    $.get("/api/wardrobe/close", function (data) {
        alert(data);
    });
    $("#openWardrobe").show();
    $("#getOutWardrobe").hide();
    $("#closeWardrobe").hide();
    $("#getInWardrobe").hide();
    $("#kickWardrobe").show();
}

$("#getInWardrobe").click(getIn);

function getIn() {
    $.get("api/wardrobe/getIn", function (data) {
        alert(data);
    });
    $("#openWardrobe").hide();
    $("#getOutWardrobe").show();
    $("#closeWardrobe").show();
    $("#getInWardrobe").hide();
    $("#kickWardrobe").show();
}

$("#getOutWardrobe").click(getOut);

function getOut() {
    $.get("api/wardrobe/getOut", function (data) {
        alert(data);
    });
    $("#openWardrobe").hide();
    $("#getOutWardrobe").hide();
    $("#closeWardrobe").show();
    $("#getInWardrobe").show();
    $("#kickWardrobe").show();
}

$("#kickWardrobe").click(kick);

function kick() {
    $.get("api/wardrobe/kick", function (data) {
       alert(data);
    });
}