import React, { Component } from 'react'

export class DestructuringC extends Component {

    render() {
        const { name, title } = this.props
        return (
            <div>
                <h1>Hello {name} {title}</h1>
            </div>
        )
    }
}

export default DestructuringC
