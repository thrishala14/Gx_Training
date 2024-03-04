import { Component } from "react";
import MyContext from "./MyOwnContext";

class ClassComponent extends Component{
    render(){
        return(
            <div>
                
                <h3>Class Component</h3>
                {this.context.myValue}
                <br/>
                
                <MyContext.Consumer>
                    {(item) =>{
                        return <p> Using Consumer : {item.myValue}</p>
                    }}
                </MyContext.Consumer>
                
            </div>
        )
    }
}

ClassComponent.contextType = MyContext;

export default ClassComponent