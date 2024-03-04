import React from 'react'
import {useState} from 'react'
import axios from 'axios';


const ServiceForPost = () => {
    
    const [patient, setPatient] = useState({
        patient_name :"",
        patient_gender :"",
        patient_dob : "",
        patient_ph : 0
    })


    const PostDoctorDetails = () => {
        let url = "http://localhost:8080/doctorconsultation/newpatient";
        const reqBody = {
            "patient_name":patient.patient_name,
            "patient_gender": patient.patient_gender,
            "patient_dob": patient.patient_dob,
            "patient_ph":patient.patient_ph
        }

        axios
          .post(url, JSON.stringify(reqBody), {
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
        <label> Name : </label>
        <input type = "text" placeholder='Name' onChange = {(event)=>{
                    setPatient({...patient, patient_name: event.target.value})
                }}/>
        <label> Gender : </label>
        <input type = "text" placeholder='Gender' onChange = {(event)=>{
                    setPatient({...patient, patient_gender: event.target.value})
                }}/>
        <label> DOB : </label>
        <input type = "text" placeholder='dob' onChange = {(event)=>{
                    setPatient({...patient, patient_dob: event.target.value})
                }}/>
        <label> Phone : </label>
        <input type = "text" placeholder='ph' onChange = {(event)=>{
                    setPatient({...patient, patient_ph: event.target.value})
                }}/>
        <button onClick = {()=>{PostDoctorDetails()}}>Click</button>
    </div>
  )
}

export default ServiceForPost