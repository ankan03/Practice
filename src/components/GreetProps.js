import React from 'react'

const GreetProps = (Props) => {
    console.log(Props)
    return (
        <div>
            <h1>
                Hello {Props.name} hero = {Props.heroname}
            </h1>
            {Props.children}
        </div>
    )
}

export default GreetProps