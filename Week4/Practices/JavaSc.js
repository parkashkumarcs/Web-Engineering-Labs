/*
let num;
num=0;
document.getElementById("label").innerHTML=num;
document.getElementById("buttonInc").onclick=function(){
    num+=1;
    document.getElementById("label").innerHTML=num;
}
let word;
word="Parkash Kumar";
document.getElementById("myLabel").innerHTML=word;
console.log("Hello World!");*/

function generateOutput() {
    let output = '';
    for (let i = 1; i <= 5; i++) {
        output += `Number ${i}<br>`;
    }
    document.getElementById('myContainer').innerHTML = output;
}
generateOutput();


let myArray = [1, 2, 3, 4, 5];

function displayResults() {
    let output = '';

    output += `Original Array: [${myArray.join(', ')}]<br><br>`;

    myArray.push(6, 7);
    output += `After push(6, 7): [${myArray.join(', ')}]<br>`;

    const poppedElement = myArray.pop();
    output += `After pop(): [${myArray.join(', ')}] (Popped Element: ${poppedElement})<br>`;

    const shiftedElement = myArray.shift();
    output += `After shift(): [${myArray.join(', ')}] (Shifted Element: ${shiftedElement})<br>`;

    myArray.unshift(0);
    output += `After unshift(0): [${myArray.join(', ')}]<br>`;

    const newArray = myArray.concat([8, 9]);
    output += `After concat([8, 9]): [${newArray.join(', ')}]<br>`;

    const slicedArray = newArray.slice(2, 5);
    output += `After slice(2, 5): [${slicedArray.join(', ')}]<br>`;

    newArray.splice(2, 2, 10, 11);
    output += `After splice(2, 2, 10, 11): [${newArray.join(', ')}]<br>`;

    const indexOfElement = newArray.indexOf(10);
    output += `Index of 10: ${indexOfElement}<br>`;

    const lastIndexOfElement = newArray.lastIndexOf(10);
    output += `Last Index of 10: ${lastIndexOfElement}<br>`;

    const includesElement = newArray.includes(7);
    output += `Includes 7: ${includesElement}<br>`;

    document.getElementById('myContainer1').innerHTML = output;
}
displayResults();