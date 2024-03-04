import React from 'react'
import Counter from './Counter';
import PreventDefault from './PreventDefault';
import FormDemo from './FormDemo';
import MouseEvents from './MouseEvents';
import FormDemo1 from './FormDemo1';

const MainClass = () => {
  function handleChange(event){
    console.log(event);
  }

  return (
    <>
        {/* <input type = "text" onChange={(event)=>handleChange(event)}/>
        <button onClick={(event)=>handleChange(event)}>Click</button>
        <Counter/>
        <PreventDefault/> */}
        {/* <FormDemo/> */}
        {/* <MouseEvents/> */}
        <FormDemo1/>
    </>
  )
}

export default MainClass