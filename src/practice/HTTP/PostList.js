import React, { Component } from 'react'
import axios from 'axios'

class PostList extends Component {
    constructor(props) {
        super(props)

        this.state = {
            postList: [],
            errorMessage: ""
        }
    }

    componentDidMount() {
        axios.get(`https://jsonplaceholder.typicode.com/posts`)
            .then(response => {
                this.setState({
                    postList: response.data
                })
                console.log(response)
            })
            .catch(error => {
                console.log(error)
                this.setState({
                    errorMessage: "Error in Retriving data"
                })
            })
    }

    render() {
        const { postList, errorMessage } = this.state
        return (
            <div>
                <h1>List of postList</h1>
                {
                    postList.length ?
                        // this.state.postList.map(p => <div key={p.id}>{p.title}</div>) :
                        postList.map(p => <div key={p.id}>{p.title}</div>) :
                        null
                }
                {
                    errorMessage ? <div>{errorMessage}</div> : null
                }
            </div>
        )
    }
}

export default PostList
