import React, { Component } from 'react'

class LifecycleB extends Component {
    constructor(props) {
        super(props)
        console.log("LifecycleB constructor")
        this.state = {
            name: "Ankan"
        }
    }

    static getDerivedStateFromProps(props, state) {
        console.log("LifecycleB getDerivedStateFromProps")
        return null
    }

    componentDidMount() {
        console.log("LifecycleB componentDidMount")
    }

    shouldComponentUpdate() {
        console.log("LifecycleB shouldComponentUpdate")
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState) {
        console.log("LifecycleB getSnapshotBeforeUpdate")
        return null
    }

    componentDidUpdate() {
        console.log("LifecycleB componentDidUpdate")
    }


    render() {
        console.log("LifecycleB render")
        return (
            <div>
                <h1>LifecycleB</h1>
            </div>
        )
    }
}

export default LifecycleB
