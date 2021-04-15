import axios from 'axios'
import React, { useState, useEffect } from 'react'

function GET_Api() {

    const [post, setPost] = useState({})
    const [id, setId] = useState(1)

    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
            .then(response => {
                console.log(response)
                setPost(response.data)
            })
            .catch(error => {
                console.log(error)
            })

    }, [id])
    return (
        <div>
            <input type='text' value={id} onChange={e => setId(e.target.value)}></input>
            <h2>{post.title}</h2>
        </div>
    )
}

export default GET_Api
