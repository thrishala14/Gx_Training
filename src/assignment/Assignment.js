import React from "react";
import "./Assignment.css"
import JSX from "./JSX";
import Greeting from "./Greeting";
import Counter from "./Counter";
import TemperatureConverter from "./TemperatureConverter";
import Parent from "./Parent";
import UserStatus from "./UserStatus";

export const Assignment = () => {
  return (
    <div>
      <h5>ASSIGNMENT 1: JSX</h5>
      <JSX/>

      <h5>ASSIGNMENT 2: Functional Components</h5>
      <Greeting name = "Thrishala"/>

      <h5>ASSIGNMENT 3: Class Components</h5>
      <Counter/>

      <h5>ASSIGNMENT 4: TemperatureConverter</h5>
      <TemperatureConverter/>

      <h5>ASSIGNMENT 5: Props</h5>
      <Parent/>

      <h5>ASSIGNMENT 6: Conditional Rendering</h5>
      <UserStatus/>
    </div>
  );
};
