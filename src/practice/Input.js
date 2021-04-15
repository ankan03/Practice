import React, { Component } from 'react'
import FocusInput from './FocusInput'

class Input extends Component {
    constructor(props) {
        super(props)

        this.inputRef = React.createRef()
    }

    focusIp() {
        this.inputRef.current.focus()
    }
    render() {
        return (
            <div>
                <input type='text' ref={this.inputRef} ></input>
            </div>
        )
    }
}

export default Input
