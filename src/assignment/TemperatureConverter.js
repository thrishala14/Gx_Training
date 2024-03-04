// Build a component named TemperatureConverter that converts Celsius to Fahrenheit. Use state to manage the
// temperature input.
// Requirements:
// • Create state variables for Celsius and Fahrenheit temperatures.
// • Include input fields for Celsius and Fahrenheit.
// • When the user enters a value in one input field, update the other input field accordingly.

import { useState } from "react";

const TemperatureConverter = () => {
  let [temp, setTemp] = useState(0);
  let [ftemp, setFtemp] = useState(0);

  return (
    <div>
      <label>CELSIUS: </label>
      <input
        value={temp}
        onChange={(event) => {
          setFtemp((ftemp = event.target.value * 1.8 + 32));
          setTemp((temp = event.target.value));
        }}
      ></input>
      <label>FAHRENHEIT: </label>
      <input
        value={ftemp}
        onChange={(event) => {
          setTemp((temp = (event.target.value - 32) * (5 / 9)));
          setFtemp((ftemp = event.target.value));
        }}
      ></input>
    </div>
  );
};

export default TemperatureConverter;
