import { useState, useMemo } from "react"

const UseMemo =()=>{
    const[count, setCount] = useState(0);
    const a = useMemo(()=>calculation(count), []);

    const increment=()=>{
        setCount(count+1)
    }
    return(
        <div>
            {a}
            <button onClick={increment}>Click</button>
        </div>
    )
}


const calculation = (count1) =>{
    console.log("calc")
    for(let i = 0; i<1000;i++){
        count1+=1
    }
    return count1;
}

export default UseMemo