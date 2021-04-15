import React from 'react'

// 1st method of destructing
// const GreetDestructure = ({ name, heroname }) => {
//     return (
//         <div>
//             <h1>name = {name} heroname = {heroname}</h1>
//         </div>
//     )
// }

// 2nd method of destructing
const GreetDestructureProps = props => {
    const { name, heroname } = props
    return (
        <div>
            <h1>name = {name} heroname = {heroname}</h1>
        </div>
    )
}

export default GreetDestructureProps

