import React, { useState } from "react";
import useCounter from "./useCounter";

export const Custom2 = () => {
    const [state, increment, decrement, reset] = 
    useCounter(10, 10);

  return (
    <>
      <h2>Component 2</h2>
      <h4>Counter: {state}</h4>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <button onClick={reset}>Reset</button>
    </>
  );
};
