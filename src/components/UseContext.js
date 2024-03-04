import React, {useState, useContext} from 'react'
import MyContext from './MyContext'
import ContextChild from './ContextChild'

const UseContext = () =>{

    //const value = useContext(MyContext)

    return(
        <div>
            {/* {value.userName} */}
            <ContextChild/>
        </div>
    )
}

export default UseContext
