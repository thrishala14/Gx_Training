import React, { useState } from 'react'
import useCounter from './useCounter'

export const Custom1 = () => {
    const [state, increment, decrement, reset] = 
                        useCounter(1, 1);
    return (
        <>
            <h2>Component 1</h2>
            <h4>Counter: {state}</h4>
            <button onClick = {increment}>Increment</button>
            <button onClick = {decrement}>Decrement</button>
            <button onClick = {reset}>Reset</button>
        </>
    )
}
