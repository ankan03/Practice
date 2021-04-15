import React from 'react'

// const DestructuringFn = (props) => {
//     return (
//         <div>
//             <h1>Hello {props.name} {props.title}</h1>
//         </div>
//     )
// }

// const DestructuringFn = ({ name, title }) => {
//     return (
//         <div>
//             <h1>Hello {name} {title}</h1>
//         </div>
//     )
// }


const DestructuringFn = (props) => {

    const { name, title } = props
    return (
        <div>
            <h1>Hello {name} {title}</h1>
        </div>
    )
}




export default DestructuringFn