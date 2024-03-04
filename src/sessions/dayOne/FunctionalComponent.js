import React, { useState } from 'react'

const FunctionalComponent = () => {
  const [count, setCount] = useState(30);
  const [timeouts, setTimeouts] = useState(false);

  const decrementCount = () =>{
    if(timeouts == false){
      setCount((prevCount)=>prevCount-1)
      console.log(timeouts, count);
      setTimeout(decrementCount, 1000)
      setTimeouts(true)
    }
  }
  
  return (
    <>
        {/* <h3>Thrishala N P</h3>
        <h5>Associate Developer</h5>
        <p>{location}</p>
        <p>{age}</p> */}
        <button onClick={()=>decrementCount()}>Decrement</button>
        {count}
    </>
  )
}

export default FunctionalComponent