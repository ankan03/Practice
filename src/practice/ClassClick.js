import React, { Component } from 'react'

export class ClassClick extends Component {
    buttonClick = () => {
        console.log("Button class clicked")
    }
    render() {
        return (
            <div>
                <button onClick={this.buttonClick}>Class Click</button>
            </div>
        )
    }
}

export default ClassClick
