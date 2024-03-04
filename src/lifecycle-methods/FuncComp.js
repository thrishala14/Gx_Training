import React from 'react'

const FuncComp = (props) => {
    if(props.name == "akshatha"){
        throw new Error("name not correct")
    }
  return (
    <div>
        {props.name}
    </div>

  )
}


export default FuncComp