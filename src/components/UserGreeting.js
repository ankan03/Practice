import React, { Component } from 'react'

class UserGreeting extends Component {

    constructor(props) {
        super(props)

        this.state = {
            isLoggedIn: true
        }
    }


    render() {


        // 1st approach
        // if (this.state.isLoggedIn) {
        //     return (<div><div>Welcome Ankan</div></div>)
        // } else {
        //     return (<div><div>Welcome Guest</div></div>)
        // }

        // 2nd approach
        // let message

        // if (this.state.isLoggedIn) {
        //     message = <div><div>Welcome Ankan</div></div>
        // } else {
        //     message = <div><div>Welcome Guest</div></div>
        // }
        // return <div>{message}</div>

        // 3rd approach
        // return (
        //     this.state.isLoggedIn ?
        //         <div>Welcome Ankan</div> :
        //         <div>Welcome Guest</div>
        // )

        //4th approach
        return this.state.isLoggedIn && <div>Welcome Ankan</div>

    }
}

export default UserGreeting
