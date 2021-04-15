import React from 'react'

function Title() {
    console.log(`Inside Title`)
    return (
        <div>
            Use Callback Hook
        </div>
    )
}

export default React.memo(Title)
