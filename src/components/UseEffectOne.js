import React, {useState, useEffect} from 'react'


const UseEffectOne = () =>{
    const[value, setValue] = useState(false)

    useEffect(()=>{
        console.log("request")
        return(()=> console.log("effect"))
    },[value]
    )
    
    const change = ()=>{
        setValue(a => !a)
    }
    return (
        <div>
            <h3> {value? "hello" : "hey"}</h3>
            <button onClick = {change}>click</button>
        </div>
    )
}

export default UseEffectOne