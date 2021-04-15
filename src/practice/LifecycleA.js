import React, { Component } from 'react'
import LifecycleB from './LifecycleB'

class LifecycleA extends Component {
    constructor(props) {
        super(props)
        console.log("LifecycleA constructor")
        this.state = {
            name: "Ankan"
        }
    }

    static getDerivedStateFromProps(props, state) {
        console.log("LifecycleA getDerivedStateFromProps")
        return null
    }

    componentDidMount() {
        console.log("LifecycleA componentDidMount")
    }

    shouldComponentUpdate() {
        console.log("LifecycleA shouldComponentUpdate")
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log("LifecycleA getSnapshotBeforeUpdate")
        return null
    }

    componentDidUpdate() {
        console.log("LifecycleA componentDidUpdate")
    }

    updateState = () => {
        this.setState({
            name: "Mukherjee"
        })
    }

    render() {
        console.log("LifecycleA render")
        return (
            <div>
                <h1>{this.state.name}</h1>
                <button onClick={this.updateState}>Click</button>
                <LifecycleB></LifecycleB>
            </div>
        )
    }
}

export default LifecycleA
