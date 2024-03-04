import React from 'react'

const defaultVal = {
    profile:{
        name:"thrishala",
        age: 22
    }
}

export const ClassContext = React.createContext(defaultVal)