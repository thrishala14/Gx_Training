import React from 'react';
class ClassComponent extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            name: 'Thrishala',
            age: 22
        }
    }

    updateAge = () =>{
        this.setState({age :  25, rollNo : 4402})
        console.log(this.state)
    }
    render(){
        return(
            <>
                <h2>Class Component</h2>
                <h3>{this.state.name}</h3>
                <h5>{this.state.age}</h5>
                <p>{this.props.location}</p>
                <p>{this.props.designation}</p>
                <button onClick={() =>this.updateAge()}>Update Age</button>
            </>
        )
    }
}

export default ClassComponent