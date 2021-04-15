import React, { useEffect, useRef } from 'react'

function UseRefFocus() {
    const inputRef = useRef(null)
    useEffect(() => {
        inputRef.current.focus()
    }, [])
    return (
        <div>
            <input type='text' ref={inputRef}></input>
        </div>
    )
}

export default UseRefFocus
