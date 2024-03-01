const mydoc=document.getElementById("head1")
alert(mydoc.innerText)
mydoc.style.color="green"
mydoc.innerText="Hello, world!"

const myButton=document.getElementById("mybtn")
myButton.innerText="Changed"
function sayHi(){
    alert("Hello, world!")
}
myButton.onclick=sayHi;

