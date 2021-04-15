import React, { Component } from 'react'
import Updatedcomponent from './WithCount'

class HoverCounter extends Component {
    // constructor(props) {
    //     super(props)

    //     this.state = {
    //         count: 0
    //     }
    // }
    // onClickCounter = () => {


    //     this.setState(prevState => ({
    //         count: prevState.count + 1
    //     }))
    // }

    render() {
        const { count, incrementCount } = this.props
        return (
            <div>

                <h1 onMouseOutCapture={incrementCount}>Hover {count} times</h1>

            </div>
        )
    }
}

export default Updatedcomponent(HoverCounter, 10)
