import React from 'react'

const PreventDefault = () => {
  function handleClick(event){
    event.preventDefault(alert("anchor tag disabled"));
  }

  function handleChange(event){
    console.log("event at x - " +event.screenX);
    console.log("event at y - " +event.screenY);
    console.log("type - " +event.type);
    console.log("view - "+event.view);
    event.target.style.visibility = "hidden"
  }

  return (
    <div>
        <a href='https://www.wikipedia.org/' onClick={(e) =>handleClick(e)}>Wikipedia Link</a>
        <input onChange={(e)=>handleChange(e)}/>
        <p>window height: {window.innerHeight}</p>
        <p>window width: {window.innerWidth}</p>
    </div>
  )
}

export default PreventDefault