import React, { useState } from 'react'

const EventHandling = () => {
    const [color, setColor] = useState("");
    const [display, setDisplay] = useState("");

    const handleChange =(e)=>{
        setColor(e.target.value);
        setDisplay("")
    };

    const handleClick = () =>{
        setDisplay(color);
        setColor("")
    }
    return (
        <div style={{backgroundColor: display, minHeight: visualViewport, padding:"20%"}}>
            <input value = {color} onChange={(e)=>handleChange(e)}/>
            <br/>
            <button onClick={()=>handleClick()}>Click</button>
            {display!="" ? <h3>Color is : {display}</h3>: null}
        </div>
    )
}

export default EventHandling