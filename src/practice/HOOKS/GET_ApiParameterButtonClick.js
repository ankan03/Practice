import axios from 'axios'
import React, { useState, useEffect } from 'react'

function GET_ApiParameterButtonClick() {

    const [post, setPost] = useState({})
    const [id, setId] = useState(1)
    const [buttonFetchId, setButtonFetchId] = useState(id)

    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/posts/${buttonFetchId}`)
            .then(response => {
                console.log(response)
                setPost(response.data)
            })
            .catch(error => {
                console.log(error)
            })

    }, [buttonFetchId])
    function seletedId() {
        setButtonFetchId(id)
    }
    return (
        <div>
            <input type='text' value={id} onChange={e => setId(e.target.value)}></input>
            <button onClick={() => seletedId()}>Fetch Post</button>
            <h2>{post.title}</h2>
        </div>
    )
}

export default GET_ApiParameterButtonClick
