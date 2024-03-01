function applyFunction(array, func) {
    return array.map(func);
}
const doubleFunction = x => x * 2;
const numbersArray = [1, 2, 3];
const resultArray = applyFunction(numbersArray, doubleFunction);
const output = `Original Array: [${numbersArray.join(', ')}]<br>Result Array: [${resultArray.join(', ')}]`;
document.getElementById('Container').innerHTML = output;
