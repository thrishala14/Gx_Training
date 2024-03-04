import React, { useEffect, useState } from 'react'

const UseEffect = () => {
  const [count, setCount] = useState(0);

  useEffect(()=>{
    console.log("mount");
  },[])

  useEffect(()=>{
    if(count<=5){
      console.log("update");
    }
    else{
      return ()=>console.log("unmounted")
    }
  }, [count])

  return (
    <div>
      {count}
      <button onClick={()=>setCount(count+1)}>Click</button>
    </div>
  )
}

export default UseEffect