import React, { useEffect, useRef, useState } from 'react'

const Counter = () => {
    const [count, setCount] = useState(0);
    const [flag , setFlag] = useState(false);
    const [input, setInput] = useState();
    const [randNumber, setRandNumber] = useState(0);

    useEffect(()=>{
        let interval;
        
        if(flag == false){
            interval = setInterval(()=>{
                setCount(c=>c+1);
            },1000)
        }
        else{
            clearInterval(interval);
        }
        return ()=>clearInterval(interval);
    },[count, flag])
    
    useEffect(()=>{
        setRandNumber(Math.floor(Math.random() * (9999 - 1000 + 1)) + 1000)
    },[])

    const randNum =()=>{
        alert(randNumber)
    }

    const handleClick =()=>{
        console.log(input, randNumber)
        
        if(input == randNumber){
            setFlag(true);
            alert("you pased at "+count+ " seconds")
        }
    }
    return (
        <>
            {count}
            <input onChange={(e)=>setInput(e.target.value)}/>
           {/* flag == false?  */}
            <button onClick={()=>randNum()}>Generate Num</button>
            <button onClick = {()=>handleClick()}>Pause</button>
        </>
    )
}

export default Counter