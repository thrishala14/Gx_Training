// Assignment 5: Props
// Task:
// Create two components - Parent and Child. Pass a message as a prop from Parent to Child and display it in Child.
// Requirements:
// • Create a Parent component that includes a message in its state.
// • Pass the message as a prop to the Child component.
// • Display the message in the Child component.

import { useState } from "react"
import Child from "./Child"

const Parent = () =>{
    const [message, setMessage] = useState("This is a message")
    return(
        <div>
            <Child message = {message}></Child>
        </div>
    )

}

export default Parent

