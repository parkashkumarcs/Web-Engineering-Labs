const add=document.getElementById("addBall");

add.onclick=addBalls;
function addBalls(){
    const ball=document.createElement("div");
    ball.className="ball";
    ball.style.backgroundColor=randomColor();
    const myContainer=document.getElementsByClassName("container")[0];
    var store=myContainer.appendChild(ball);
    const remove=document.getElementById("removeBall");
    remove.onclick=function removeBall(){
    store.remove();
}

}

function randomColor(){
    var red=Math.floor(Math.random()*255);
    var blue=Math.floor(Math.random()*255);
    var green=Math.floor(Math.random()*255);

    var newColor="rgb("+red+","+blue+","+green+")";
    return newColor;
}

