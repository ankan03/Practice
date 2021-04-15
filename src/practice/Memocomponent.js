import React from 'react'

function Memocomponent({ name }) {
    console.log("Memocomponent Rendered")
    return (
        <div>
            Inside Memocomponent {name}
        </div>
    )
}

export default React.memo(Memocomponent)
