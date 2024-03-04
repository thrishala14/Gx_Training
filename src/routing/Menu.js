import React, {useState} from "react";
import { Link } from "react-router-dom";
const Menu = () => {
  const [state, setState] = useState(false)

  const handleClick = ()=>{
    window.location.href = '/menu'
  }

  const displayLink = () =>{
    setState(!state)
  }

  return (
    <div>
      <h4>Menu</h4>
      <div>
      <ul style={{display:"flex", justifyContent:"space-between", width: "50rem"}}>
        <li>
          <Link to="/home">Home</Link>
        </li>
        <li>
          <Link to="/signup">Sign In</Link>
        </li>
        {/* <li>
          <Link to="/login">Login</Link>
        </li> */}
        <li style={{listStyleType:"none"}}>
          <button className = "btn btn-primary" onClick = {()=>{handleClick()}}> Class Menu</button>
        </li>
      </ul>
      <button className = "btn btn-primary" onClick = {()=>{displayLink()}}> Display Login</button>
      {state?<Link to="/login">Login</Link>:null}
      </div>
    </div>
  );
};

export default Menu;
