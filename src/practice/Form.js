import React, { Component } from 'react'

class Form extends Component {
    constructor(props) {
        super(props)

        this.state = {
            username: '',
            comments: '',
            topic: 'React'
        }
    }
    onFormChange = (event) => {
        this.setState({
            username: event.target.value
        })
    }

    onCommantChange = event => {
        this.setState({
            comments: event.target.value
        })
    }

    onTopicChange = event => {
        this.setState({
            topic: event.target.value
        })
    }

    onSubmitEvent = event => {
        alert(`${this.state.username} ${this.state.comments} ${this.state.topic}`)
        event.preventDefault()
    }

    render() {
        return (

            <form onSubmit={this.onSubmitEvent}>
                <div>
                    <label>Enter Name </label>
                    <input
                        type='text'
                        value={this.state.username}
                        onChange={this.onFormChange} />
                </div>
                <div>
                    <label>Enter Comments </label>
                    <textarea
                        type='text'
                        value={this.state.comments}
                        onChange={this.onCommantChange} />
                </div>

                <div>
                    <label>Topic</label>
                    <select value={this.state.topic} onChange={this.onTopicChange}>
                        <option value='react'>React</option>
                        <option value='angular'>Angular</option>
                        <option value='java'>Java</option>
                    </select>
                </div>

                <button type="submit">Submit</button>
            </form>

        )
    }
}

export default Form

