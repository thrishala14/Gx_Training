import React, { useReducer } from 'react'

const UseReducer = () => {
    const reducer = (state, action)=>{
        if(action.value === "" ){
            return({
                ...state,
                error: "error"
            })
        }
        else if(action.type==="change"){
            return(
                {
                    ...state,
                    [action.name]: action.value
                }
            )
        }
        else if(action.type === "SUBMIT"){
            alert("form submitted");
            console.log(state)
        }
       
        else{
            return state;
        }
    };

    const [state, dispatch] = useReducer(reducer, {
        name: "",
        email: "",
        error: ""
    })
  return (
    <>
        <input name ="name" placeholder='name' onChange={(e)=>dispatch({type: "change", value: e.target.value, name: e.target.name})}/>
        <input name = "email" placeholder='email' onChange={(e)=>dispatch({type: "change", value: e.target.value, name: e.target.name})}/>
        <button onClick={()=>dispatch({type: "SUBMIT"})}>Submit</button>
        {state.error!=="" && <p>error</p> }
    </>
  )
}

export default UseReducer