import React, { useState, useEffect } from 'react'

function EffectCounter2() {
    const [count, setCount] = useState(0)
    const [name, setName] = useState('')
    useEffect(() => {
        document.title = `You Clicked ${count} times`
        console.log('inside Use Effect')
    }, [count])

    return (
        <div>
            <input type='text' value={name} onChange={e => setName(e.target.value)}></input>
            <button onClick={() => setCount(p => p + 1)}>Clicked {count} times</button>
        </div>
    )
}

export default EffectCounter2
