// .UseReducer Hook:
// - Develop an application for managing a shopping cart.
// - Implement the `useReducer` hook to manage the cart's state.
// - Enable users to add or remove items from the cart

import React, { useReducer } from "react";

const reducer = (state, action) => {
  if(action.type === "ADD"){
    console.log(state.items)
    return {items:  state.items.concat({name:action.value})
  }}
  else if(action.type ==="REMOVE"){
    return {
      items: state.items.filter((item)=>item.name!=action.value)
    }
  }
  else return state;
};
const ReducerDemo = () => {

  const [state, dispatch] = useReducer(reducer, {
    items: [{
        name: "abc"
    }]
  });

  return (
    <div>
      <h2>Shopping Application</h2>
      
      <label> ENTER ITEM</label>
      <input id="item" />
      <br/>
      <button onClick={()=>dispatch({type:"ADD", value: document.getElementById("item").value})}>ADD</button>
      <br/>
      <button onClick={()=>dispatch({type:"REMOVE", value: document.getElementById("item").value})}>REMOVE</button>

      <h3>CART</h3>
      {state.items.map((item)=><p>{item.name}</p>)}
    </div> 
  );
};
export default ReducerDemo;
