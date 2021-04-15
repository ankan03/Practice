import React, { Component } from 'react'
class WelcomeDestructureProps extends Component {
    render() {
        const { name, heroname } = this.props
        // const {state1,state2} = this.state
        return (
            <div>
                <h2>Welcome {name} a.k.a {heroname}</h2>
            </div>
        )
    }
}

export default WelcomeDestructureProps