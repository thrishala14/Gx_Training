import React, { useState } from 'react'
import './styles.css';
const MouseEvents = () => {
    const [counta, setCounta] = useState(0);
    const [countb, setCountb] = useState(0);
    const [countc, setCountc] = useState(0);

    return (
        <div style={{textAlign:"center", padding:"2rem"}}>
            <div onMouseEnter = {()=>setCounta(c=>c+1)}>
                <p>ON ENTER</p>
                <button >{counta}</button>
            </div>
            <div onMouseOver = {()=>setCountb(c=>c+1)}>
                <p>ON OVER</p>
                <button >{countb}</button>
            </div>
            <div>
                <p>ON MOVE</p>
                <button onMouseMove = {()=>setCountc(c=>c+1)}>{countc}</button>
            </div>

            <div>
                <input onChange = {(e)=>console.log("onchange :  " +e.target.value)}/>
                <input onKeyDown={(e)=>console.log("onkeydown:" +e.key)}/>
            </div>
        </div>
    )
}

export default MouseEvents