import React from 'react'

function Person({ personList }) {

    const map1 = personList.map(p => <div key={p.a}>a={p.a} b={p.b} c={p.c}</div>)
    return (
        <div>
            <div>{map1}</div>
        </div>
    )
}

export default Person
