import React, { useState, useMemo } from 'react'

function UsememoCounter() {
    const [counterOne, setCounterOne] = useState(0)
    const [counterTwo, setCounterTwo] = useState(0)

    const increeaseCounterOne = () => {
        setCounterOne(counterOne + 1)
    }

    const increeaseCounterTwo = () => {
        setCounterTwo(counterTwo + 1)
    }

    const isEven = useMemo(() => {
        let i = 0
        while (i < 100000000) i++
        return counterOne % 2 === 0
    }, [counterOne])
    return (
        <div>
            <div>
                <h1>Counter One = {counterOne}</h1>
                <button onClick={increeaseCounterOne}>Increase Counter One</button>
                <span>{isEven ? "Even" : "Odd"}</span>

            </div>

            <div>
                <h1>Counter Two = {counterTwo}</h1>
                <button onClick={increeaseCounterTwo}>Increase Counter Two</button>
            </div>
        </div>
    )
}

export default UsememoCounter
