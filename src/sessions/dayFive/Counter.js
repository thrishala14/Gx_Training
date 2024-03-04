import React, { useState } from 'react'

const Counter = () => {
    const [state, setState] = useState(0);

    const increment = (event) =>{
        if(state === 3){
            event.target.style.visibility = "hidden";
        } else {
            setState(c=>c+1);
        }
    }
  return (
    <div style={{textAlign:"center"}}>
        <h5>Counter: {state}</h5>
        <button onClick={(event)=>increment(event)}>Increment</button>
    </div>
  )
}

export default Counter