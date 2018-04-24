// for now I made variables here because I don't know to connect to java
var openedWardrobe = false;
var isInWardrobe = false;

function openWardrobe() {
    if (openedWardrobe === false) {
        openedWardrobe = true;
        //places the sentence in the div
        document.getElementById("outputDiv").innerHTML = "<p>The wardrobe opens</p>"
        //console.log("The wardrobe opens");
    } else {
        document.getElementById("outputDiv").innerHTML = "<p>You can't open the wardrobe, it was already open</p>"
        //console.log("You can't open the wardrobe, it was already open");
    }
}

function closeWardrobe() {
    if (openedWardrobe === true) {
        openedWardrobe = false;
        document.getElementById("outputDiv").innerHTML = "<p>The wardrobe closes</p>"
        //console.log("The wardrobe closes");
    } else {
        document.getElementById("outputDiv").innerHTML = "<p>You can't close the wardrobe, it was already closed</p>"
        //console.log("You can't close the wardrobe, it was already closed");
    }
}

function getInWardrobe() {
    if (isInWardrobe === false) {
        isInWardrobe = true;
        document.getElementById("outputDiv").innerHTML = "<p>You are now inside the wardrobe</p>"
        //console.log("You are now inside the wardrobe");
    } else {
        document.getElementById("outputDiv").innerHTML = "<p>You can't get in the wardrobe, because you are already inside</p>"
        //console.log("You can't get in the wardrobe, because you are already inside");
    }
}

function getOutWardrobe() {
    if (isInWardrobe === true) {
        isOutWardrobe = false;
        document.getElementById("outputDiv").innerHTML = "<p>You are now outside the wardrobe again</p>"
        //console.log("You are now outside the wardrobe again");
    } else {
        document.getElementById("outputDiv").innerHTML = "<p>You cant go out of the wardrobe, because you are already outside</p>"
        //console.log("You cant go out of the wardrobe, because you are already outside");
    }
}

function kickWardrobe () {
    //placed variable in function to let it calculate each time the button is pressed
    var powerKick = ((Math.random() * 100) + 1);
    if (powerKick >= 80) {
        document.getElementById("outputDiv").innerHTML = "<p>You have broken the wardrobe!!</p>"
        //console.log("You have broken the wardrobe!!")
    } else {
        document.getElementById("outputDiv").innerHTML = "<p>You have hurt your foot!</p>"
        //console.log("You have hurt your foot!")
    }
}

function newWardrobe () {
    document.getElementById("outputDiv").innerHTML = "<p>IKEA just delivered a brand new wardrobe for you to play with</p>"
}