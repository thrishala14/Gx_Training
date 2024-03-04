import React, { useState } from 'react'

const HooksExample = () =>{
    const[count, setCount] = useState(0);
    return (
        <div>
            <h5>HOOKS EXAMPLE</h5>
            {count}
            <button onClick = {
                ()=>setCount(count+1)
            }>CLICK</button>
        </div>
    )
}

export default HooksExample


