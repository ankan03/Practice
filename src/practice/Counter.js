import React, { Component } from 'react'

class Counter extends Component {

    constructor(props) {
        super(props)

        this.state = {
            count: 0
        }
    }

    changCount() {
        // this.setState({
        //     count: this.state.count + 1
        // },
        //     () => {
        //         console.log(this.state.count)
        //     })

        this.setState(prevState => ({
            count: prevState.count + 1
        }))


    }

    incrementFive() {
        this.changCount()
        this.changCount()
        this.changCount()
        this.changCount()
        this.changCount()
    }

    render() {
        return (
            <div>
                <h1>Counter - {this.state.count}</h1>
                <button onClick={() => this.incrementFive()}> Increment </button>
            </div>
        )
    }
}


export default Counter