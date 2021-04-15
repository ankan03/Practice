import React from 'react'

function FunctionClick() {

    function buttonClick() {
        console.log("Button function clicked")
    }

    return (
        <div>
            <button onClick={buttonClick}>Function Click</button>
        </div>
    )
}

export default FunctionClick
