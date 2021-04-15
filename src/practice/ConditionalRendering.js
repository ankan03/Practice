import React, { Component } from 'react'

class ConditionalRendering extends Component {
    constructor(props) {
        super(props)

        this.state = {
            isLoggedin: false
        }
    }



    render() {

        // if (this.state.isLoggedin) {
        //     return (
        //         <div>
        //             Welcome Ankan
        //         </div>
        //     )
        // } else {
        //     return (
        //         <div>
        //             Welcome Guest
        //         </div>
        //     )
        // }

        // let message;
        // if (this.state.isLoggedin) {
        //     message = "Hello Ankan"
        // } else {
        //     message = "Hello Guest"
        // }
        // return (
        //     <div>
        //         {message}
        //     </div>
        // )

        // return this.state.isLoggedin ? <div>Hello Ankan</div> : <div>Hello guest</div>

        return this.state.isLoggedin && <div>Hello Ankan</div>

    }
}

export default ConditionalRendering
