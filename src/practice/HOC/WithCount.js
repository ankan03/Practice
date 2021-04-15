import React from 'react'

const Updatedcomponent = (OriginalComponent, incrementValue) => {
    class NewCount extends React.Component {

        constructor(props) {
            super(props)

            this.state = {
                count: 0
            }
        }
        increamentCount = () => {
            this.setState(prevState => {
                return { count: prevState.count + incrementValue }
            })
        }

        render() {
            return (
                <OriginalComponent count={this.state.count} incrementCount={this.increamentCount}  {...this.props}></OriginalComponent>
            )

        }
    }
    return NewCount
}
export default Updatedcomponent