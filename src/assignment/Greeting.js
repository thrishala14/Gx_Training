// Assignment 2: Functional Components
// Task:
// Create a functional component named Greeting that takes a name prop and displays a personalized greeting.
// Requirements:
// • The component should be a function, not a class.
// • Use the props parameter to access the name prop.
// • Display a greeting message that includes the provided name.

const Greeting = (props) =>{
    return (
        <div>
            <h6>Hello, {props.name}</h6>
        </div>
    )
}

export default Greeting