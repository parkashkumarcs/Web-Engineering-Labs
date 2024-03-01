let ballCount = 0;

function addBall() {
    const container = document.getElementById('container');

    const ball = document.createElement('div');
    ball.className = 'ball';
    ball.id = `ball-${ballCount}`;
    ballCount++;

    container.appendChild(ball);
}