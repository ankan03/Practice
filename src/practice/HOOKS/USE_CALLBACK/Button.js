import React from 'react'

function Button({ clickAction, children }) {
    console.log(`Inside Button ${children}`)
    return (
        <div>
            <button onClick={clickAction}>
                {children}
            </button>
        </div>
    )
}

export default React.memo(Button)
