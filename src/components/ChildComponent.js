import React from 'react'

function ChildComponent(props) {
    return (
        // Passing parameter from parent to child
        // <div>
        //     <button onClick={props.gretHandeler}>Greet Parent(ChildComponent)</button>
        // </div>

        // Passing parameter from child to parent
        <div>
            <button onClick={() => props.gretHandeler('child')}>Greet Parent(ChildComponent)</button>
        </div>
    )
}

export default ChildComponent
