import React, { useState } from "react";
import axios from "axios";
const ServiceForUpdate = () => {
    
    const [patient, setPatient] = useState({
        
            appoint_id: 4,
            doctor:{
                doc_id: 2
            },
            patient: {
                patient_id: 2
            },
            fees: 500,
            appoint_type: "online",
            slot: "2023-15-11"
        
    })


    const UpdateDoctorDetails = () => {
        let url = "http://localhost:8080/doctorconsultation/modify-appointment";
        const reqBody = {
            
                "appoint_id": patient.appoint_id,
                "doctor":{
                    "doc_id": patient.doctor.doc_id
                },
                "patient": {
                    "patient_id": patient.patient.patient_id
                },
                "fees": patient.fees,
                "appoint_type": patient.appoint_type,
                "slot": patient.slot
            
        }

        axios
          .put(url, JSON.stringify(reqBody), {
            headers :{
                "Content-Type": "application/json",
                "Access-Control-Allow-Headers": "Content-Type", 
                "Access-Control-Allow-Origin": "*"
            }
          })
          .then((response) => {
              alert('successfully posted data!!')
          })
          .catch((err) => {
            console.log(err)
            alert("error in posting data");
          });
      };
    
  return (
    <div>
        <h2>Service for Post</h2>
        <label> Appointment ID : </label>
        <input type = "text" placeholder='Fees' onChange = {(event)=>{
                    setPatient({...patient, appoint_id: event.target.value})
                }}/>
        <label> Fees : </label>
        <input type = "text" placeholder='Fees' onChange = {(event)=>{
                    setPatient({...patient, fees: event.target.value})
                }}/>
        <label> Slots : </label>
        <input type = "text" placeholder='Slot' onChange = {(event)=>{
                    setPatient({...patient, slot: event.target.value})
                }}/>
      
        <button onClick = {()=>{UpdateDoctorDetails()}}>Click</button>
    </div>
  )
}

export default ServiceForUpdate