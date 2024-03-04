import React, {Component} from 'react';
import { ClassContext } from './ClassContext';

class ClassComponent extends Component{
    state = {
        profile: null,
        setProfile: this.setProfile
    }

    setProfile = (profile) =>{
        this.setState({profile})
    }

    render(){
        return(
            <ClassContext.Provider value = {this.state}>
                <div>
                    <h4>
                        Class Context
                    </h4>
                </div>
            </ClassContext.Provider>
        )
    }
}

export default ClassComponent