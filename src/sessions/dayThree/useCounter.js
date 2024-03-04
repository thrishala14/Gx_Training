import React, { useState } from 'react'

const useCounter = (initialValue, step) => {
    const [state, setState] = useState(initialValue);

    const increment = () =>{
        setState(p=>p+step);
    }

    const decrement = () =>{
        setState(p=>p-step);
    }

    const reset = () =>{
        setState(0);
    }
    
    return [state, increment, decrement, reset]
}

export default useCounter