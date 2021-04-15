import React, { useState } from 'react'

function HookCounterThree() {

    const [name, setName] = useState({ firstName: '', lastName: '' })
    return (
        <div>
            <form>
                <div>
                    <label>FirstName</label>
                    <input type='text' value={name.firstName} onChange={e => setName({ ...name, firstName: e.target.value })}></input>
                </div>
                <div>
                    <label>LastName</label>
                    <input type='text' value={name.lastName} onChange={e => setName({ ...name, lastName: e.target.value })}></input>
                </div>
            </form>

            <h1>Firstname = {name.firstName}</h1>
            <h1>Lastname = {name.lastName}</h1>
            <h1>{JSON.stringify(name)}</h1>
        </div>
    )
}

export default HookCounterThree
