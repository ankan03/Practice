import React, { Component } from 'react'

class ClassClick extends Component {

    clickHandeller() {
        console.log("Button Click Class component")
    }

    render() {
        return (
            <button onClick={this.clickHandeller}>Click Class Button</button>
        )
    }
}

export default ClassClick
