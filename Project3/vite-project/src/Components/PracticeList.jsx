import React from "react";
import { useState } from "react";
function PracticeList(){
    /*
    var name="John";
    var color="Red";
    var age=5;
    var person={name,color,age};
    var foo={bar:'pony', baz:4}
    var {bar:a, baz:b}=foo;

    function sum(...num){
        var result=0;
        num.forEach(function (number){
            result+=number;
        });
        return result;
    }

    function sum(a,b,c){
        return a+b+c;
    }
    var args=[1,2,3];

    function* generator(){
        yield 1;
        yield 2;
        return 3;
    }

    var get=generator();
    for(let x of get){
        alert(x);
    }

    function displayV(some){
        console.log(some);
    }

    let myPromise=new Promise(function (myResolve, myReject){
        let x=0;
        if(x==0){
            myResolve("OK");
        }else{
            myReject("Error");
        }
    });

    console.log(myPromise.then(
            function(value) {1},
            function(error) {2}
        ))

        function* generatorFunc(){
        let x=yield 'hello';
        console.log(x);
        console.log("some code");
        yield 5;

    }
    const generator=generatorFunc();

    setTimeout(function(){myFunction("Good friend!:");},5000);
    function myFunction(value){
        console.log(value);
    }
    const myPromise=new Promise(function(myResolve, myReject){
        setTimeout(function(){myResolve("good friend too"); }, 3000);
    });
    myPromise.then(function(value){
        console.log(value);
    })

    var name="John";
    var color="Red";
    var age=5;
    var person={name,color,age};


    <div>
            {Object.values(person).map((item, index) => (
                <h1 key={index}>{item}</h1>
            ))}
        </div>

        let [message1, setMessage] = useState("");


    function shoot(){
        message1="I am killer";
        setMessage(message1);
        //document.getElementById("it").innerHTML=message1;
    }
    */
    let [number,newNumber]=useState([])
    let addNum=()=>{
        newNumber([...number,{
            id: number.length,
            value: "Parkash"
        }]);
    }
    return (
        // console.log(sum(1)),
        //console.log(sum(...args))
        //console.log(generator.next()),
        //console.log(generator.next(6)),
        //console.log(generator.next())
        //<p></p>
        //<button onClick={shoot}>Killed!</button>
        //<h1>{message1}</h1>
        <>
            <button onClick={addNum}>Add Number</button>
            <ol>
                {number.map(item=>(<li key={item.id}>{item.value}</li>))}
            </ol>  
            
        </>
    );
}

export default PracticeList;