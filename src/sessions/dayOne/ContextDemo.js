import React, { useContext } from 'react'
import MyContext from './MyContext'

const ContextDemo = () => {
    const {theme, setTheme} = useContext(MyContext);
  return (
    <div style={theme == false? {backgroundColor:"grey", color:"white"}:
     {backgroundColor:"yellow"}}>
        <h2>hvhjf</h2>
    </div>
  )
}

export default ContextDemo