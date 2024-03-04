import React,{useState} from 'react'

export const HooksExampleTwo = () => {
    //const[input, setInput] = useState("");
    const forms = {
        name:"a",
        age:"22",
        gender:"f"
    }
    const[form, setForm] = useState(forms);

    let handleChange = (event) =>{
        let name = event.target.name;
        let value = event.target.value;
        setForm({
            ...form,
            [name]:value
        })
        console.log(event.target.name)
    }
    return (
        <div>
            {/* <button onClick = {()=>setInput((input) =>  "def")}></button> */}
            <input name = "name" value = {form.name} onChange={handleChange}></input>
            {form.name}

            <input name = "age" value = {form.age} onChange={handleChange}></input>
            {form.age} 

            <input name = "gender" value = {form.gender}  onChange={handleChange}></input>
            
            
            {form.gender}
        </div>
    )
}
