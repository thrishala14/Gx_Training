import React from "react";
function HelloWorld(){
    return(
        <div><p>Default Export </p></div>
    );
}

export default HelloWorld;

export function Welcome(){
    return(
        <div>Named Export</div>
    )
};

export function Addition(props){
    var a = document.getElementById("first").value
    var b = document.getElementById("second").value
    var op = document.getElementById("op").value
    let ans = 0
    if(op === '+')
        ans =a + b
    else if(props.c === '-')
        ans =props.a-props.b
    else if(props.c === '*')
        ans =props.a*props.b
    else if(props.c === '/')
        ans =props.a/props.b
    document.getElementById("ans").value = ans
   return(<div>
    <h4>Fisrt No: {props.a}</h4>
    <h4>Operator: {props.c}</h4>
    <h4>Second No: {props.b}</h4>
    <p>Answer : {ans}</p>
    </div>
    );
}
