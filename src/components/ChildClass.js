import React, { Component } from "react";


class ChildClass extends Component{
    constructor(){
        super()
        //console.log(props)
    }

    render(){
        return(
            <div>
                <h3>CHILD COMPONENT</h3>
                <p>{this.props.value}</p>
                <p>{this.props.obj.name}</p>
                <p>{this.props.obj.age}</p>
                <button onClick = {()=>this.props.func()}>Click</button>
            </div>
        )
    }
}

export default ChildClass