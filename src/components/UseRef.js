import React, { useEffect, useState } from "react";
import { useRef } from "react";

export const UseRef = () => {
  const preValue = useRef("");
  const [count, setCount] = useState("");

  useEffect(() => {
    preValue.current = count
  }, [count]);


  return (
    <div>
      UseRef
      {/* {count} */}
      <input
        type="text"
        onChange={(event) => {
          setCount(event.target.value)
        }}
      />
      {/* <button
        onClick={() => {
            inputRef.current.value = {count}
        }}
      >
        COUNT
      </button> */}
      {count}
      <br/>
      {preValue.current}
    </div>
  );
};
