import React, { Component } from 'react'
import MyContext from './MyOwnContext'

class ClassProvider extends Component {
    state = {
        message : "Hello from Provider"
    }

    render() {
        return (
            <div>
                <MyContext.Provider value = {{
                    myValue : this.state.message
                }}>
                    {this.props.children}
                </MyContext.Provider>
            </div>
        )
    }
}

export default ClassProvider