import React from 'react'

function FunctionClick() {
    // function clickHandeler() {
    //     console.log("Button Click")
    // }

    const clickHandeler = () => console.log("Button Click inside Function component")

    return (
        <div>
            <button onClick={clickHandeler}>Click Function Button</button>1
        </div>
    )

    //if we use () after the function name (Because eventHandeller is not a "functional call" it is "function" only )
    // return (
    //     <div>
    //         <button onClick={clickHandeler()}>Click</button>
    //     </div>
    // )

}

export default FunctionClick
