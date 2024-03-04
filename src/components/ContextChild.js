import React, { useContext } from "react";
import MyContext from "./MyContext";

const ContextChild = () => {
  const { value, setValue } = useContext(MyContext);
  return (
    <div
      style={
        value.theme === "LightGreen"
          ? {
              backgroundColor: "lightgreen",
              color: "black",
            }
          : {
              backgroundColor: "darkgreen",
              color: "white",
            }
      }
    >
      ContextChild
      <h3> {value.userName}</h3>
      <h3> {value.theme}</h3>
      <button
        onClick={() => {
          setValue({
            ...value,
            theme: "LightGreen",
          });
        }}
      >
        CLICK
      </button>


      <button
        onClick={() => {
          setValue({
            ...value,
            theme: "DarkGreen",
          });
        }}
      >
        CLICK
      </button>
    </div>
  );
};

export default ContextChild;
