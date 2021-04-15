import React, { Component } from 'react'

class HoverCounter extends Component {
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
                <h1 onMouseOver={increamentCount}>Hover {count} Times</h1>
            </div>
        )
    }
}

export default HoverCounter
