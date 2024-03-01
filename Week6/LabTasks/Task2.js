document.addEventListener('DOMContentLoaded', function () {
    const randomNumber = Math.floor(Math.random() * 10) + 1;
    const userInputElement = document.getElementById('userInput');
    const guessButton = document.getElementById('mybtn');
    const resultMessageElement = document.getElementById('resultMessage');

    guessButton.addEventListener('click', function () {
        const userGuess = parseInt(userInputElement.value, 10);

        if (isNaN(userGuess) || userGuess < 1 || userGuess > 10) {
            resultMessageElement.textContent = 'Please enter a valid number between 1 and 10.';
            resultMessageElement.style.color = 'red';
        } else {
            checkGuess(userGuess);
        }
    });

    function checkGuess(userGuess) {
        if (userGuess === randomNumber) {
            resultMessageElement.textContent = 'Congratulations! You guessed the correct number!';
            resultMessageElement.style.color = 'green';
        } else {
            resultMessageElement.textContent = `Wrong guess! The correct number was ${randomNumber}. Try again!`;
            resultMessageElement.style.color = 'red';
        }
        userInputElement.value = '';
        resetGame();
    }

    function resetGame() {
        randomNumber = Math.floor(Math.random() * 10) + 1;
    }
});
