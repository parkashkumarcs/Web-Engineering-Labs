//There are three types to display the output of content:
// 1. console.log() output
// 2. windows.alert() output
// 3. document.getElementById() output

// 1. console.log() output
//console.log(`Hello world`);
//console.log(`My name is Parkash Kumar`);

// 2. windows.alert() output
//window.alert(`I am from windows alert output!`);

// 3. document.getElementById() output
//document.getElementById("h1").textContent=`Hello world`;

////////////////////////////////////////////////////////

//There are two ways to declare variables in JavaScript
// 1. let
// 2. var

// 1. let

/*
let num;
num = 123;
console.log(`you lucky number is ${num}`);

let myAlert;
myAlert ="Cold weather";
window.alert(`today is ${myAlert}`);

let skill='JavaScript';
document.getElementById("p1").textContent=`I love to learn ${skill} Programming language`;
*/

//////////////////////////////////////////
/*
//Arithmetic Operators
// '+', '-', '*', '/', '%'

let sum, sub, mul, div,mod;
sum=3+5;
sub=10-5;
mul=10*5;
div=10/3;
mod=10%3;
document.getElementById('h1').textContent=`The sum of two numbers is ${sum}`;
document.getElementById('h2').textContent=`The subtraction of two numbers is ${sub}`;
document.getElementById('h3').textContent=`The multiplication of two numbers is ${mul}`;
document.getElementById('h4').textContent=`The division of two numbers is ${div}`;
document.getElementById('h5').textContent=`The remainder of two numbers is ${mod}`;

// operator precedence:
// 1. ()
// 2. components='**'
// 3. *, /, %
// 4. +, -

let expression=2 + 8 - 2 * 3 / (2+1) + 2**5 %3;
document.getElementById('p1').textContent = `Result: ${expression}`;
*/

/////////////////////////////////////////////////////


//How to accept user input

// There are two ways to accept user input
// 1. Easy way to accept user through windows prompt
// 2. Professional way to accept user through html elements

/*
// 1. Easy way to accept user through windows prompt
let input1=window.prompt("Enter your name please: ");
window.alert(`My name is ${input1}`);
document.getElementById("h1").textContent = `My name is ${input1}`;
*/

/*
// 2. Professional way to accept user through html elements
let username;
//let x;
document.getElementById("submit").onclick=function(){
    username = document.getElementById("myText").value;
    document.getElementById("myheading1").innerHTML=`Username is ${username}`;
    //x = document.getElementById("myheading1").innerHTML=`Username is ${username}`;
}

//document.getElementById("myheading1").innerHTML=`Username is ${x}`;
*/

/*
let person={
    "firstName": "John",
    "lastName": "Wicks",
    "age": "20",
    "gender": "male",
    "birthDate": "200-10-20"
}

let text="";
for(let x in person) {
    text+= person[x]+" ";
}
document.getElementById("h1").textContent=text;

let myArray=["John", "Danish", "Teerth", "Shoaib", "Sanjay"];
let myList="";
for(let x in myArray) {
    myList += myArray[x]+"<br>";
}
document.getElementById("h2").innerHTML=myList;

*/
/////////////////////////////////////
/*
let x,y;
x=12;
y=3;

function getMults(num1,num2){
    let alertMessage="";
    if(num1==12 && num2==3){
        alertMessage="I am not interested"
    }
    else{
        alertMessage="else is executed"
    }
    return alertMessage
}
document.getElementById("h1").innerHTML=getMults(x,y);

let x=12, y=3;
let myFunc=(x,y)=>x*y;
document.getElementById("h1").innerHTML=myFunc(x,y);
*/
///////////////////////////////////////

/*
let array1=new Array(5);
let array2=new Array();
for(let i=0;i<array1.length;i++){
    array1[i]=i;
}
for(let i=0;i<5;i++){
    array2[i]=i;
}
outputArray("Array1 Contains:",array1);
outputArray("Array2 Contains:",array2);

function outputArray(message,theArray){
    document.writeln("<h1>" + message + "</h1");
    document.writeln("<table border=\"1px\" width="+"\"50%\">");
    document.writeln("<tr><th>Subscript</th> <th>value</th></tr>");
    for(let i=0;i<theArray.length;i++){
        document.writeln(`<tr><td>${i}</td><td>${theArray[i]}</td></tr>`);
    }
    document.writeln("</table>");
}
*/
/*
function myNumber(){
    let n=0;
    return{
        next: function(){
            n += 10;
            return{value:n, done:false};
        }
    };
}
const n=myNumber();
document.getElementById("h1").innerHTML=n.next();
document.getElementById("h2").innerHTML=n.next();
document.getElementById("h3").innerHTML=n.next();
document.getElementById("h4").innerHTML=n.next();

*/
/////////////////////////////////////////////

/*
let sum=0;
const arr=[65,44,12,4];
arr.forEach(mySum)
function mySum(num){
    sum+=num;
}
document.getElementById("h1").innerHTML=sum;

let mult= new Array(4);
const arr1=[65,44,12,4];
arr.forEach(myMult)
function myMult(numb, index, arr){
    arr[index] = numb * 10;
    mult[index]=arr
}
for(let i=0;i<mult.length;i++){
    document.getElementById("h2").innerHTML="["+ mult[i]+"]<br>";
}
const number=[2,3,4,5];
const newArray=number.map(Math.sqrt);
for(let i=0;i<number.length;i++){    
    document.getElementById("h3").innerHTML="["+ newArray[i]+"] index is " + i;
}
document.getElementById("h4").innerHTML="["+ newArray+"]";

const ages=[16,30,24,17,45];
const Result=ages.filter(checkAdult);
function checkAdult(age){
    return age >= 18;
}
document.getElementById("h5").innerHTML="Adults ages are: [" + Result + "]";

const age=[16,30,24,17,45];
const Result1=age.find(checkAdult);
function checkAdult(age){
    return age >= 18;
}
document.getElementById("h6").innerHTML="Adults ages are: [" + Result1 + "]";

const person=[16,30,24,17,45];
const Result2=person.findIndex(checkAdult);
function checkAdult(age){
    return age >= 18;
}
document.getElementById("h7").innerHTML="Adults ages are: [" + Result2 + "]";

const reduceNumber=[175,50,25];
const result3=reduceNumber.reduce(reducedNum);
function reducedNum(total, num){
    return total-num;
}
document.getElementById("h8").innerHTML="Reduced Number is: [" + result3 + "]";

*/

////////////////////////////////////

/*
//function addAlert(alert){
  //  return "alert";
//}
try{
    addAlert("Welcome Guest!");
}catch(err){
    document.getElementById("h1").innerHTML=err.message;
}

*/

////////////////////////////////////////////////////////


//window.alert("Welcome Parkash!");
//window.confirm("Are you sure you want to quite");
//window.open("http://127.0.0.1:5500/Web-Engineering-Labs/Practices/Day3/myPage.html");
//window.close()
//window.setTimeout();

////////////////////////////////////////////////////////Screen or window////////////////////////////////////

/*
let hightbrowse=window.innerHeight;
let widthbrowse=window.innerWidth;
let sW=window.screen.width;
let sH=window.screen.height;
let sAW=window.screen.availWidth;
let sAH=window.screen.availHeight;
let sC=window.screen.colorDepth;
let sP=window.screen.pixelDepth;


document.getElementById("h1").innerHTML="Inner Hight: " + hightbrowse;
document.getElementById("h2").innerHTML="Inner Width: " + widthbrowse;

document.getElementById("h3").innerHTML="screen Hight: " + sH;
document.getElementById("h4").innerHTML="screen Width: " + sW;
document.getElementById("h5").innerHTML="screen Available Hight: " + sAH;
document.getElementById("h6").innerHTML="screen Available Width: " + sAW;
document.getElementById("h7").innerHTML="screen color Depth: " + sC;
document.getElementById("h8").innerHTML="screen pixel Depth: " + sP;

*/

///////////////////////////window.location////////////////////////////

/*
let url=window.location.url;
let hsn=window.location.hostname;
let path=window.location.pathname;
let prot=window.location.protocol;
let ass=window.location.assign();

document.getElementById("h1").innerHTML="URL: " + url;
document.getElementById("h2").innerHTML="HostName: " + hsn;
document.getElementById("h3").innerHTML="Path: " + path;
document.getElementById("h4").innerHTML="protocol: " + prot;
document.getElementById("h5").innerHTML="URL: " + ass;
*/

//////////////////////////// console.object//////////////////////////

