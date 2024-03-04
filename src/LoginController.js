import { Component } from "react";

function UserGreeting(props){
    return <h1>Welcome!</h1>
}

function GuestGreeting(props){
    return <h1>Please Sign In!</h1>
}

function Greeting(props){
    const isLoggedIn = props.isLoggedIn;
    if(isLoggedIn){
        return <UserGreeting/>
    }
    return <GuestGreeting/>
}

function LoginButton(props){
    return <button onClick={props.onClick}>Login</button>
}

function LogoutButton(props){
    return <button onClick={props.onClick}>Logout</button>
}

class LoginController extends Component{
    constructor(props){
        super(props);
        this.state = {
            isLoggedIn: true
        }
    }

    handleLoginClick(){
        this.setState({
            isLoggedIn: true
        })
    }

    handleLogoutClick(){
        this.setState({
            isLoggedIn: false
        })
    }

    render(){
        const isLoggedIn = this.state.isLoggedIn;
        let button;
        if(isLoggedIn){
            button = <LogoutButton onClick={()=>this.handleLogoutClick()}></LogoutButton>
        }
        else{
            button = <LoginButton onClick={()=>this.handleLoginClick()}></LoginButton>
        }
        return (
            <>
            <Greeting isLoggedIn = {isLoggedIn}></Greeting>
            {button}
            </>
        )
    }
}

export default LoginController