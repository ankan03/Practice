import React, { useState, useEffect } from 'react'

function HookMouse() {
    const [x, set_X] = useState(0)
    const [y, set_Y] = useState(0)

    const logMousePosition = e => {
        console.log('mouseMove')
        set_X(e.clientX)
        set_Y(e.clientY)
    }
    useEffect(() => {
        console.log('Inside useEffect')
        window.addEventListener('mousemove', logMousePosition)

        return () => {
            console.log('Unmount called')
            window.removeEventListener('mousemove', logMousePosition)
        }
    }, [])
    return (
        <div>
            <h1>X = {x}</h1>
            <h1>Y = {y}</h1>
        </div>
    )
}

export default HookMouse
