import React from 'react'

function Heros({ heroname }) {
    if (heroname === "Jocker") {
        throw new Error("Not a hero")
    }
    return (
        <div>
            {heroname}
        </div>
    )
}

export default Heros
