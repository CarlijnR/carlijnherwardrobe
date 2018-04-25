$("#openWardrobe").click(open);

function open() {
    $.get("/api/wardrobe/open", function (data) {
        alert(data);
    });
    $("#openWardrobe").hide();
}

$("#closeWardrobe").click(close);

function close() {
    $.get("/api/wardrobe/close", function (data) {
        alert(data);
    });
}

$("#getInWardrobe").click(getIn);

function getIn() {
    $.get("api/wardrobe/getIn", function (data) {
        alert(data);
    });
}

$("#getOutWardrobe").click(getOut);

function getOut() {
    $.get("api/wardrobe/getOut", function (data) {
        alert(data);
    });
}

$("#kickWardrobe").click(kick);

function kick() {
    $.get("api/wardrobe/kick", function (data) {
       alert(data);
    });
}