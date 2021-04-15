import React, { Component } from 'react'
import ChildComponent from './ChildComponent'

class ParentComponent extends Component {

    constructor(props) {
        super(props)

        this.state = {
            parentName: "Parent"
        }

        this.greetparent = this.greetparent.bind(this)
    }

    greetparent(child) {
        alert(`Hello ${this.state.parentName} from ${child}`)
    }

    render() {
        return (
            <div>
                <ChildComponent func={this.greetparent} />
            </div>
        )
    }
}

export default ParentComponent
