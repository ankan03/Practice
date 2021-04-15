import React, { Component } from 'react'

class Binding extends Component {
    constructor(props) {
        super(props)

        this.state = {
            message: "Hello"
        }
        this.clickHandeller = this.clickHandeller.bind(this)
    }

    // clickHandeller() {
    //     this.setState({
    //         message: "Goodbye"
    //     })
    // }

    clickHandeller = () => {
        this.setState({
            message: "Goodbye"
        })
    }


    render() {
        return (
            <div>
                <h1>{this.state.message}</h1>
                {/* <button onClick={this.clickHandeller.bind(this)}>Click</button> */}
                {/* <button onClick={() => this.clickHandeller()}>Click</button> */}
                {/* <button onClick={this.clickHandeller}>Click</button> */}
                <button onClick={this.clickHandeller}>Click</button>

            </div>
        )
    }
}

export default Binding
