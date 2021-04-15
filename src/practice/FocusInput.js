import React, { Component } from 'react'
import Input from './Input'

class FocusInput extends Component {
    constructor(props) {
        super(props)

        this.componentRef = React.createRef()
    }

    clickHandeller = () => {
        this.componentRef.current.focusIp()
    }

    render() {
        return (
            <div>
                <Input ref={this.componentRef}></Input>
                <button onClick={this.clickHandeller}>Click</button>
            </div>
        )
    }
}

export default FocusInput
