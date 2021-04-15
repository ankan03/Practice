import React from 'react'
import './Style.css'

function MyStyleItem(props) {
    const cn = props.isStyle ? 'primary' : ''
    return (

        <div >
            <h1 className={cn} >Stylesheet</h1>
        </div>
    )
}

export default MyStyleItem
