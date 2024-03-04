import { Component } from "react";
import { Link } from "react-router-dom";

class MenuClass extends Component{
    render(){
        return(
            <div>
                <h4>Menu</h4>
                <ul>
                    <li>
                        <Link to = '/menu/login'>Class Login</Link>
                    </li>
                    <li>
                        <Link to = '/menu/home'>Class Home</Link>
                    </li>
                </ul>
            </div>
        )
    }
}

export default MenuClass