import axios from 'axios'
import React, { useState, useEffect } from 'react'

function GET_ApiParameter() {

    const [post, setPost] = useState([])

    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/posts`)
            .then(response => {
                console.log(response)
                setPost(response.data)
            })
            .catch(error => {
                console.log(error)
            })

    }, [])
    return (
        <div>
            <ul>
                {
                    post.map(p => (
                        <li key={p.id}>{p.title}</li>
                    ))
                }
            </ul>
        </div>
    )
}

export default GET_ApiParameter
