// Assignment 6: Conditional Rendering
// Task:
// Build a component named UserStatus that displays different 
// messages based on whether a user is logged in or not.
// Requirements:
// • Use state to track the user's login status.
// • Display a welcome message if the user is logged in.
// • Display a login prompt if the user is not logged in

import { useState } from "react"

const UserStatus = () =>{
    let[loggedIn, setLoggedIn] = useState(false)
    var[message, setMessage] = useState("hey")
    let[btnMessage, setBtnMessage] =useState("click")

    const checkLoggin = () =>{
        setLoggedIn(
                loggedIn=!loggedIn
            )
        if(loggedIn == true){
            setMessage(
                message= "welcome"
            )
            setBtnMessage(
                btnMessage = "LOGOUT"
            )
        }
        else{
            setMessage(
            message= "please login"
            )
            setBtnMessage(
                btnMessage = "LOGIN"
            )
        }
    }

    return (
        <div>
            <p>USER STATUS: {message}</p>
            <button onClick={(event)=>checkLoggin()}>{btnMessage}</button>
        </div>
    )
}

export default UserStatus