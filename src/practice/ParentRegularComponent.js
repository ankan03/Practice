import React, { Component } from 'react'
import Memocomponent from './Memocomponent';
import MyPureComponent from './MyPureComponent';
import RegularComponent from './RegularComponent';

export class ParentRegularComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            name: "Ankan"
        }
    }


    componentDidMount() {
        setInterval(() => {
            this.setState({
                name: "Ankan"
            })
        }, 2000);
    }

    render() {
        console.log("********* Inside ParentRegularComponent*********")
        return (
            <div>
                Inside ParentRegularComponent
                {/* <MyPureComponent name={this.state.name}></MyPureComponent>
                <RegularComponent name={this.state.name}></RegularComponent> */}
                <Memocomponent name={this.state.name}></Memocomponent>
            </div>
        )
    }
}

export default ParentRegularComponent
