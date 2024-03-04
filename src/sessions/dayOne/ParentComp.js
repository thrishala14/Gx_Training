import React, { useRef, useState } from 'react'
import ChildComp from './ChildComp';
import Logout from './Logout';

const ParentComp = () => {
    const inputRef = useRef('');
    const [loggedIn, setLoggedIn] = useState(false);
    const [theme, setTheme] = useState(false);


    return (
        <div style={theme==true?{backgroundColor:"black", color:"white"}:{backgroundColor:"white", color:"black"} }>
            {loggedIn==false?<h3>Please Sign in</h3>:null}
            <input ref = {inputRef}/>
            {loggedIn==false?
            <button onClick = {()=>setLoggedIn(true)}>Login</button>:
            <ChildComp name = {inputRef.current.value}/>}
            <button onClick = {()=>{setTheme(t=>!t)}}>Change Theme</button>
            {Logout()}
        </div>
    )
}

export default ParentComp