import React, { useMemo, useState } from 'react'

const MemoDemo = () => {

    const [a, setA] = useState(0);
    const [b, setB] = useState(0);

    const memoVar = useMemo(()=>{
        add(a, b);
    },[a, b])

    const add = (a, b) =>{
        console.log("returning sum ....")
        return a + b;
    }

  return (
    <div>
        <button onClick={memoVar(2, 3)}>Click</button>
        <button onClick={memoVar(2, 3)}>Click</button>
        <button onClick={memoVar(2, 4)}>Click</button>
    </div>
  )
}

export default MemoDemo