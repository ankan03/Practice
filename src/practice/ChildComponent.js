import React from 'react'

function ChildComponent(props) {
    return (
        <div>
            <button onClick={() => props.func(`Child`)}>Button</button>
        </div>
    )
}

export default ChildComponent
