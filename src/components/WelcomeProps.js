import React, { Component } from 'react'
class WelcomeProps extends Component {
    render() {
        return (
            <div>
                <h2>Welcome {this.props.heroname} a.k.a {this.props.name}</h2>
            </div>
        )
    }
}

export default WelcomeProps