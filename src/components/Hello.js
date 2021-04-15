import React from 'react'
const Hello = () => {
    // return (
    //     <div>
    //         <h1>Hello JSX</h1>
    //     </div>
    // )
    return React.createElement('div', { id: 'hello', className: 'outerElement' }, React.createElement('h1', { id: 'innerElement' }, 'Hello Mukherjee'))
}
export default Hello