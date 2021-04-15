import React, { Component } from 'react'
class EventBind extends Component {

    constructor() {
        super()
        this.state = {
            message: "Hello"
        }

        {/* Binding in the class constructor */ }
        // this.clickhandeller = this.clickhandeller.bind(this)
    }

    // clickhandeller() {
    //     this.setState({
    //         message: "Goodbye"
    //     })
    //     console.log(this)
    // }

    //  Binding in class property as arrow function
    clickhandeller = () => {
        this.setState({
            message: 'Goodbye'
        })
    }

    render() {
        return (

            <div>
                <h1>{this.state.message}</h1>
                {/* Binding in the render method */}
                {/* <button onClick={this.clickhandeller.bind(this)}>Click</button> */}

                {/* Binding in the arrow function */}
                {/* <button onClick={() => this.clickhandeller()}>Click</button> */}

                {/* Binding in the class constructor */}
                {/* <button onClick={this.clickhandeller}>Click</button> */}

                {/* Binding in class property as arrow function */}
                <button onClick={this.clickhandeller}>Click</button>
            </div>
        )
    }

}
export default EventBind