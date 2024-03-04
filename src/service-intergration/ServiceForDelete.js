import React, {useState} from 'react'
import axios from 'axios'

const ServiceForDelete = () => {
  const[id, setId] = useState(0)
  const deletePatient = () =>{
    let url = "http://localhost:8080/doctorconsultation/deletepatient/";
    url+=id;
    axios.delete(url, {
        headers :{
            "Content-Type": "application/json",
            "Access-Control-Allow-Headers": "Content-Type", 
            "Access-Control-Allow-Origin": "*"
        }
      }).then((response)=>{
        alert("deleted data")
      }).catch((err)=>{
        alert("error in deleting")
      })
  }  
  return (
    <div>
        <h2>Service for Delete</h2>
        <label>Patient ID: </label>
        <input onChange={(event)=>{setId(event.target.value)}}/>
        <button onClick = {()=>{deletePatient()}}>Delete</button>
    </div>
  )
}

export default ServiceForDelete