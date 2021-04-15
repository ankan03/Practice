import React from 'react'
import Person from './Person'
function NameList() {
    const names = ['Ankan', 'Mukherjee', 'Ankan']
    const person = [{
        id: 1,
        name: "Ankan",
        age: 20,
        skill: "DSA"
    },
    {
        id: 2,
        name: "Ram",
        age: 21,
        skill: "OS"
    }

    ]



    // return (
    // normal approach (1)
    // <div>
    //     <h2>{names[0]}</h2>
    //     <h2>{names[1]}</h2>
    // </div>

    //map approach (2)
    // <div>
    //     {
    //         names.map(name => <h2>{name}</h2>)
    //     }
    // </div>
    // )

    // //map approach (3)
    // return <div>{myNameList}</div>

    //map approach (4)
    // const personList = person.map(p => (
    //     <h2>
    //         name = {p.name} id = {p.id} age = {p.age} skill = {p.skill}
    //     </h2>
    // ))
    // //map approach (4)
    // return <div>{personList}</div>

    //map approach (5)
    // const personList = person.map(ps => <Person key={ps.id} p={ps} />)
    // return <div>{personList}</div>

    // map approach (6)
    const nameList = names.map((n, index) => <h2 key={index}>{index} {n}</h2>)
    return <div>{nameList}</div>
}
export default NameList