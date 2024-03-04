import {useState} from 'react'
import ChildComponent from './ChildComponent'
const DemoFunctional = (props)=>{
    let var1 = "variable1"

    

    const [age, setAge] = useState(22);
    const [arr, setArr] = useState({
        name:"ppp",
        age: 20
    })

    const obj = {
        one: "one",
        two:"two"
    }
    const change = () =>{
        var1 = "variable2"
       setAge(50)
       setArr({
        name:"rrr",
        age: 40
    })
    }
    return(
        <div>
            {/* <h5>PROPS</h5>
            <p> Hello {props.name} and age is {props.age} and variable is {var1}</p>
           
            <h5>Variables</h5>
            <p>{var1}</p>
            <button onClick = {change()}>CLICK</button>
            
            <h5>State</h5>
            <p>{age}</p>
            <button onClick = {()=>setAge(50)}>CLICK</button>
            <p>{arr.name} {arr.age}</p>
            <button onClick = {()=>setArr({
                name:"rrr",
                age:40
            })}>CLICK object</button> */}

            {age}
            {arr.name} {arr.age}
        
            <ChildComponent obj = {arr} age={age} change = {change}/>
        </div>
    )
}

export default DemoFunctional;




{/*
return statement can have only one parent element
props: to communicate between components
can pass String, int, objects, functionss
*/}