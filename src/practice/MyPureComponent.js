import React, { PureComponent } from 'react'

class MyPureComponent extends PureComponent {


    render() {
        console.log("********* Inside MyPureComponent*********")
        return (
            <div>
                MyPureComponent {this.props.name}
            </div>
        )
    }
}

export default MyPureComponent
