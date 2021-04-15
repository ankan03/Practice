import React, { Component } from 'react'

class User extends Component {
    render() {
        return (
            <div>
                {this.props.myRenderProp(true)}
            </div>
        )
    }
}

export default User
