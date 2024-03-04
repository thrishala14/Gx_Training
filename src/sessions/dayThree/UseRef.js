import React, { useRef, useState } from 'react'
import swal from 'sweetalert';

const UseRef = () => {
    const [timeElapsed, setTimeElapsed] = useState(0);
    const [isRunning, setIsRunning] = useState(false);
    const intervalRef = useRef(0);
    const counterRef = useRef(0);

    const startTime = () =>{
        setIsRunning(true);
        clearInterval(intervalRef);
        if(isRunning === true){
            intervalRef = setInterval(()=>{
                counterRef.current++;
             setTimeElapsed(t=>t+1)}
            , 1000);
        }
        
    }

    const pauseTime = () =>{
        setIsRunning(false);
    }

    const stopTime = () =>{
        clearInterval(intervalRef.current);
        setIsRunning(false);
        swal({
            title: "stopwatch stopped",
            text: `you completed ${timeElapsed} seconds`,
            icon: 'info'
        })
        setTimeElapsed(0);
        counterRef.current = 0;
    }

    return (
        <>
            <h2>Stopwatch</h2>
            {counterRef.current} seconds
            <button onClick = {startTime}>Start</button>
            <button onClick = {pauseTime}>Pause</button>
            <button onClick = {stopTime}>Stop</button>

        </>
    )
}

export default UseRef