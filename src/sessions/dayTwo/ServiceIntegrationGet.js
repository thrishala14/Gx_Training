import axios from "axios";
import React, { useState } from "react";

export const ServiceIntegrationGet = () => {
    const [id, setId] = useState(0);
    const [display, setDisplay] = useState({});

    const handleSubmit=()=>{
        const url = 'http://localhost:8080/user-data/' +id;
        axios.get(url,{
            headers: {
                "Content-Type": "application/json",
                "Access-Control-Allow-Headers": "Content-Type", 
                "Access-Control-Allow-Origin": "*"
            },
          })
        .then(data=>setDisplay(data.data))
        .catch(e=>console.log(e))

    }

    return (
        <div style={{textAlign:"center"}}>
        <h3>Get Users</h3>
            <input type="number" 
                    placeholder="id" 
                    value={id} 
                    onChange={e=>setId(e.target.value)} />
            <button onClick={handleSubmit}>Submit</button>
            <h6>Username: {display.username}</h6>
            <h6>Password: {display.password}</h6>
            
        </div>
  );
};
