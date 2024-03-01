function reverseArray(inputArray) {
    return inputArray.reverse();
}

const originalArray = [1, 2, 3];
const reversedArray = reverseArray(originalArray);
const output = `Original Array: [${originalArray.join(', ')}]<br>Reversed Array: [${reversedArray.join(', ')}]`;

document.getElementById('Container').innerHTML = output;
