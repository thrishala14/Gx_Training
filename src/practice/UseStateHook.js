import React, { useEffect, useState } from "react";

const UseStateHook = () => {
  const [timers, setTimers] = useState(0);
  const [active, setActive] = useState(false);

  useEffect(() => {
    let interval = null;
    if (active === true) {
      interval = setInterval(() => {
        setTimers((timers) => timers + 1);
      }, 1000);
      console.log(interval);
    } else if (active === false && timers !== 0) {
      clearInterval(interval);
    }
    return () => {
      console.log(interval);
      clearInterval(interval);
    };
  }, [active, timers]);

  const startTimer = () => {
    setActive(true);
  };

  const stopTimer = () => {
    setActive(false);
  };
  const resetTimer = () => {
    setTimers(0);
    setActive(false);
  };

  return (
    <>
      <h4>{timers}</h4>
      <button
        onClick={() => {
          startTimer();
        }}
      >
        Start
      </button>
      <button
        onClick={() => {
          stopTimer();
        }}
      >
        Stop
      </button>
      <button
        onClick={() => {
          resetTimer();
        }}
      >
        Reset
      </button>
    </>
  );
};

export default UseStateHook;
