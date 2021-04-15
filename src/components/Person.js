import React from 'react'

function Person({ p }) {
    return (
        <div>
            <h2>
                name = {p.name} id = {p.id} age = {p.age} skill = {p.skill}
            </h2>
        </div>
    )
}

export default Person
