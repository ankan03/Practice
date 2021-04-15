import React, { useState } from 'react'


function HookCounterTwo() {
    const initialCount = 0
    const [count, setCount] = useState(0)
    function increamentFive() {
        for (let i = 0; i < 5; i++) {
            setCount(prevCount => prevCount + 1)

        }
    }
    return (
        <div>
            <h1>Count {count}</h1>
            <button onClick={() => setCount(prevCount => prevCount + 1)}>Increament</button>
            <button onClick={() => setCount(prevCount => prevCount - 1)}>Decreament</button>
            <button onClick={() => setCount(initialCount)}>Reset</button>
            <button onClick={() => increamentFive()}>Increament Five</button>
        </div>
    )
}

export default HookCounterTwo
