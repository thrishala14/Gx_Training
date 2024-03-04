import React, { Component } from "react";
import ChildClassComponent from "./ChildClassComponent";
import FuncComp from "./FuncComp";
import ErrorHandling from "./ErrorHandling";

class ClassComponent extends Component {
  constructor() {
    super();
    this.state = {
      value: 1,
      value1: true,
    };
    console.log("constructor");
  }

  change() {
    this.setState({
      value: this.state.value + 1,
      value1:!this.state.value1
    });
    console.log(this.state.value);
  }
  componentDidMount() {
    console.log("componentDidMount");
    return null;
  }

  static getDerivedStateFromProps() {
    //--cannot read 'this' because static
    // this.setState({
    //     value: this.state.value+1})
    console.log("getDerivedStateFromProps");
    return null;
  }
  shouldComponentUpdate() {
    console.log("should Component Update");
    return true;
  }

  getSnapshotBeforeUpdate() {
    console.log("getSnapshotBeforeUpdate");
    return null
  }

  componentDidUpdate() {
    console.log("componentDidUpdate");
  }

  componentWillUnmount(){
    console.log("component will unmount")
    return true
  }
  render() {
    console.log("render");
    return (
      <div>
        <p>{this.state.value}</p>
        
        <button onClick={() => this.change()}>Click</button>
        

        {this.state.value1 ? <ChildClassComponent/> : null}
        
        
        
        <ErrorHandling>
            <FuncComp name = "thrishala"/>
            </ErrorHandling>
            <ErrorHandling>
            <FuncComp name = "akshatha"/>
            </ErrorHandling>
            <ErrorHandling>
            <FuncComp name = "supriya"/>
        </ErrorHandling>
      
      </div>
    );
  }
}

export default ClassComponent;
