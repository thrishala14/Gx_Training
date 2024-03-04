import React, {Component} from 'react'
import ChildClass from './ChildClass'

class DemoClass extends Component{
    constructor(){
        super()
        this.state = 
        {
            value:1,
            obj: {
                name: "thrishala",
                age:22
            }
        }
        console.log("constructor")
        //this.change = this.change.bind(this)
    }
    componentDidMount(){
        console.log('componentDidMount')
    }
    static getDerivedStateFromProps(){
        //--cannot read 'this' because static 
        // this.setState({
        //     value: this.state.value+1})  
        console.log("getDerivedStateFromProps")
        return null;
    }
    change = () =>{
        this.setState({
            value:this.state.value+1,
            obj: {
                name: "abc",
                age:24
            }
        })
    }
    
    render(){
        console.log("render")
        return(
            <div>
                <h4> Hi {this.state.value}</h4>
                <p>{this.state.obj.name}</p>
                <p>{this.state.obj.age}</p>
                <button onClick = {()=>this.change()}>CLICK</button>
                
                <br/><br/>

                <ChildClass value = {this.state.value} obj = {this.state.obj} func = {()=>this.change()}/>
            </div>
        )
    }
}

export default DemoClass