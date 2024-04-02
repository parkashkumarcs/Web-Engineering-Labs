const add = document.getElementById("addBall");

add.onclick = addBalls;
function addBalls() {
  const ball = document.createElement("div");
  ball.className = "ball";
  ball.style.backgroundColor = randomColor();
  const container = document.getElementsByClassName("container")[0];
  container.appendChild(ball);

  ball.onclick = removeBall;

  function removeBall() {
    ball.remove();
  }
}

function randomColor() {
  var red = Math.floor(Math.random() * 256); // Random number between 0 and 255
  var green = Math.floor(Math.random() * 256);
  var blue = Math.floor(Math.random() * 256);

  // Create a random color string in RGB format
  var randomColor = "rgb(" + red + "," + green + "," + blue + ")";
  return randomColor;
}