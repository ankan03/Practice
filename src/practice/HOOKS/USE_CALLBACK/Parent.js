import React, { useState, useCallback } from 'react'
import Title from './Title'
import Count from './Count'
import Button from './Button'

function Parent() {
    const [age, setAge] = useState(20)
    const [salary, setSalary] = useState(5000)

    const increaseSalary = useCallback(() => {
        setSalary(salary + 100)
    }, [salary])

    const increaseAge = useCallback(() => {
        setAge(age + 1)
    }, [age])

    return (
        <div>
            <Title />
            <Count text={'Age'} count={age} />
            <Button clickAction={increaseAge}>Increase Age</Button>
            <Count text={'Salary'} count={salary} />
            <Button clickAction={increaseSalary}>Increase Salary</Button>
        </div>
    )
}

export default Parent
