import React, { useState } from 'react'

const FormDemo1 = () => {
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [status, setStatus] = useState(false);
    const [err, setErr] = useState("");

    const validateName = (name) =>{
        const regExName = /^[a-zA-Z]+$/;
        return regExName.test(name);
    }

    const validateEmail = (email) =>{
        const regExmail = /^[^\s]+@[^\s]+\.[^\s]+$/;
        return regExmail.test(email);
    }

    const submitFun = () =>{
        if(!name.trim() || !email.trim()){
            setErr("name and email are required");
            return
        }

        if(!validateName(name)){
            setErr("name can only contain letters");
            return
        }

        if(!validateEmail(email)){
            setErr("invalid email address");
            return
        }
        setStatus(true);
    }
    return (
        <div>
        <p>Main Validation</p>
        <form onSubmit={(e)=>e.preventDefault()}>
        <p>Name: </p>
            <input placeholder='name' onChange={(e)=>setName(e.target.value)}/>
            <br/>
            <p>Email: </p>
            <input placeholder='email' onChange={(e)=>setEmail(e.target.value)}/>
            <br/>
            {status === false?
            <button onClick={submitFun}>Submit</button>:
            <>
                <p>Form Submitted succesfully!!</p>
                <p>Name: {name}</p>
                <p>Email: {email}</p>
            </>
            }
            {err}
            </form>
        </div>
    )
}

export default FormDemo1