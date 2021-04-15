import React, { Component } from 'react'

class ClickCounter extends Component {
    // constructor(props) {
    //     super(props)

    //     this.state = {
    //         count: 0
    //     }
    // }

    // increamentCount = () => {
    //     this.setState(prevState => ({
    //         count: prevState.count + 1
    //     }))
    // }


    render() {
        const { count, increamentCount } = this.props
        return (
            <div>
                <button onClick={increamentCount}>Clicked {count} Times</button>
            </div>
        )
    }
}

export default ClickCounter
