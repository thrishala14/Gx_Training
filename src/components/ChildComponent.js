const ChildComponent = (props)=>{

    const change = () =>{
        props.age = 75
    }
    return (
        <div>
            <h3>CHILD COMPONENT</h3>
            <p>
                {props.obj.name}
                <br/>
                {props.obj.age}
                <br/>
                {props.age}

                <button onClick={change}>CLICK</button>
            </p>
        </div>
    )
}

export default ChildComponent