import React, { useState } from 'react'

const FormDemo = () => {
    const [details, setDetails] = useState({
        name:"",
        age: 0
    })
    function handleChange(event){
        setDetails({
            ...details,
            [event.target.name]: event.target.value
        })
    }
    const handleLoad = () =>{
        console.log("form loaded")
    }
   

    const handleSubmit = (e) =>{
        e.preventDefault();
        console.log("form submitted")
        console.log(details)
    }
    
  return (
    <>
        <form
            onSubmit={handleSubmit}
            onLoad={handleLoad()}
            >
            <input name = "name" onChange={(e)=>handleChange(e)}/>
            <input name= "age" onChange={(e)=>handleChange(e)}/>
            <button type = "submit">submit</button>
        </form>
    </>
  )
}

export default FormDemo