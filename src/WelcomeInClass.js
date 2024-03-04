import React, {Component} from "react"

// function WelcomeInClass(){
//     return (

//     )
// }

class WelcomeInClass extends Component {
    constructor(props){
        super(props);
        this.state = {
            name : "Thrishala",
            caller: function () {
                console.log("inside state fucntion");
            },
        };
    }

    updateState(){
        this.setState({
            name:"something",}
        )
    }

    displayer(){
        console.log("hi")
    }
    
    render(){
        return <>
        {this.state.caller()}
        {this.displayer()}
        {this.props.name}
        <h1> Class Component, {this.state.name}</h1>
        <button type = "button" onClick={() =>this.updateState()}>button</button></>
    }
}

export default  WelcomeInClass;