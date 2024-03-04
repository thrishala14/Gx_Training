import React, { useState } from "react";

const Greet = () => {
  const [name, setName] = useState({
    firstName: "",
    lastName: "",
  });

  const nameChange = (e) => {
    setName({
        ...name,
        [e.target.name]: [e.target.value]
    })
  };

  const submitForm = ()=>{
    alert("Hello," +name.firstName +" " +name.lastName)
  }

  return (
    <>
      <form>
        <input placeholder="firstName" name ='firstName' onChange={(e)=>nameChange(e)}/>
        <input placeholder="lastName" name = 'lastName' onChange={(e)=>nameChange(e)}/>
        <button type = "submit" onClick={()=>submitForm()}>Submit</button>
      </form>
    </>
  );
};

export default Greet;
