import React, { Component } from 'react'

class Counter extends Component {

    constructor(props) {
        super(props)

        this.state = {
            count: 0
        }
    }

    increment() {
        //This is when current does not depends on the previous state
        // this.state.count = this.state.count + 1

        // this.setState(
        //     {
        //         count: this.state.count + 1
        //     },
        //     () => { console.log('callback value ', this.state.count) })



        //This is when current depends on the previous state
        this.setState(prevState => ({
            count: prevState.count + 1
        }))
        console.log(this.state.count)
    }

    incrementFive() {
        this.increment()
        this.increment()
        this.increment()
        this.increment()
        this.increment()
    }




    render() {
        return (

            <div>
                <div>
                    Counter {this.state.count}
                </div>
                <button onClick={() => this.incrementFive()}>Increment</button>
            </div>
        )
    }
}

export default Counter
