import React, { useState, useEffect } from 'react'

function EffectCounter1() {
    const [count, setCount] = useState(0)
    useEffect(() => { document.title = `You Clicked ${count} times` })
    return (
        <div>
            <button onClick={() => setCount(p => p + 1)}>Clicked {count} times</button>
        </div>
    )
}

export default EffectCounter1
