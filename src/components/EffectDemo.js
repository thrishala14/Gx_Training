import React, {useState, useEffect} from 'react'


const EffectDemo = ()=>{
    const[count, setCount] = useState(0)
    const [inputValue, setInputValue] = useState("")
    useEffect(()=>{
        setTimeout(()=>{
            setCount(preValue =>preValue+1)
        }, 1000)
    }, [count, inputValue])
    return(
        <div>
            <h3>EFFECT DEMO</h3>
            <input onChange={(e)=>setInputValue(e.target.value)}/>
            <p>The counter: {count}</p>
            <button className = "btn btn-primary" onClick = {
                ()=>setCount(count+1)
            }>CLICK</button> 
        </div>
    )
}

export default EffectDemo