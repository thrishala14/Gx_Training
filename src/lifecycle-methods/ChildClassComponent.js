import React, { Component } from "react";
class ChildClassComponent extends Component{
    constructor(){
        super()
        this.state = {
            count:1
        }
        this.handleClick = this.handleClick.bind(this)
    }

    handleClick(){
        console.log("handle click")
    }
    // change(){
    //    document.addEventListener('mousedown', this.handleClick)
    // }
    componentWillUnmount(){
        document.removeEventListener('mousedown', this.handleClick)
        console.log("component will unmount")
    }
    componentDidMount(){
        document.addEventListener('mousedown', this.handleClick)
    }
    render(){
        return(
            <div>
                <h3>CHILD COMPONENT</h3>
                {this.state.count}
                {/* <button onClick = {()=>this.change()}>Click</button> */}
            </div>
        )
    }
}

export default ChildClassComponent