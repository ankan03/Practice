import React from 'react'
import Person from './Person'

function List() {
    const noList = [1, 2, 3, 4]
    const personList = [
        {
            a: 1,
            b: 2,
            c: 3
        },

        {
            a: 4,
            b: 5,
            c: 6
        },

        {
            a: 7,
            b: 8,
            c: 9
        }

    ]
    const mapList = noList.map((n, index) => <div key={index}>{n}</div>)
    const map1 = personList.map(p => <div key={p.a}>a={p.a} b={p.b} c={p.c}</div>)


    return (
        <div>
            {mapList}
            {/* <div>{map1}</div> */}
            {/* <Person personList={personList}></Person> */}
        </div>
    )
}

export default List

