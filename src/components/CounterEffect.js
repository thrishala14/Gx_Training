import React, {useState, useEffect} from 'react'

const CounterEffect = ()=>{
    const[data, setData] = useState("")
    const[count, setCount] = useState(0)
    useEffect(()=>{
       fetch('https://jsonplaceholder.typicode.com/comments')
       .then(response =>response.json())
       .then(resDate => {
        setData(resDate[count].email);
        console.log(resDate)
       },)
    }, [])
    return(
        <div>
        <h1>{data}</h1>
            <h2>COUNTER EFFECT DEMO</h2>
            <p> Counter : {count}</p>
            <button className = "btn btn-primary" onClick = {
                ()=>setCount((p)=>p+1)
            }>CLICK</button> 
        </div>
    )
}

export default CounterEffect