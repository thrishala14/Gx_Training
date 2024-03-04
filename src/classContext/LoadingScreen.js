import React, {Component} from 'react';
import { ClassContext } from './ClassContext';
import ClassComponent from './ClassComponent';

class LoadingScreen extends Component{
    
    static contextType = ClassContext;

    state = {
        profile: null,
    }

    componentDidMount(){
        this._initProfile();
    }

    _initProfile(){
        const context = this.context;
        const profileData = {
            name: "thrishala",
            age: 22
        }
        context.setProfile(profileData)
    }

    
    render(){
        return(
                <h3>Hey</h3>
        )
    }
}

export default LoadingScreen