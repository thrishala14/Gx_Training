import axios from 'axios'
import React, { useState } from 'react'

const ServiceIntegrationPost = () => {
    const [userDetails, setUserDetails] = useState({
        username: "",
        password: ""
    });
    const [err, setErr] = useState("");

    const setData =(e) =>{
        const {name, value} = e.target;
        setUserDetails(prev =>(
            {...prev,
            [name]:value}
        ))
        console.log(userDetails);
    }

    const submitData =() =>{
        let url = "http://localhost:8080/register";
        let user = userDetails;

        axios.post(url, user, {headers :{
            "Content-Type": "application/json",
            "Access-Control-Allow-Headers": "Content-Type", 
            "Access-Control-Allow-Origin": "*"
        }})
        .then(data=>console.log(data))
        .catch(err=>console.log(err))
    }

    return (
        <>
            <h3>Register</h3>
            <input placeholder = "username" name = "username" value = {userDetails.username} onChange={(e)=>setData(e)}/>
            <input placeholder = "password" name = "password" value = {userDetails.password} onChange={(e)=>setData(e)}/>
            <button onClick={()=>{submitData()}}>Submit</button>
        </>
    )
}

export default ServiceIntegrationPost