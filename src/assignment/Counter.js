// Assignment 3: Class Components
// Task:
// Create a class component named Counter that includes a state variable count. Implement a button that increments 
//the count when clicked.
// Requirements:
// • Initialize the count state to 0.
// • Display the current count in the component.
// • Implement a button that increments the count when clicked.
// • Update the component to use a class-based approach


import React, {Component} from 'react'
class Counter extends Component{
    constructor(props){
        super(props)
        this.state= {
            count: 0
        }
    }

    updateState(){
        this.setState (
            {count : this.state.count+1}
        )
    }
    render (){
        return (
            <div>
                <p>The counter is : {this.state.count}</p>
                <button onClick={()=>this.updateState()}>CLICK </button>
            </div>
        )
    }
}

export default Counter