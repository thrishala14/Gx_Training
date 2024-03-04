import React, { useMemo, useState } from 'react'

const UseMemo = () => {
    const [products, setProducts] = useState([]);
    const [input, setInput] = useState("");

    const addProduct = () =>{
        setProducts(list=>list.concat(input))
    }
    
    // const productList = useMemo(()=>{
    // console.log("added");
    // products.map(i=><h6>{i}</h6>)},[products]
    // )

    const productList = ()=>{
        console.log("added");
        return (products.map(i=><h6>{i}</h6>))}
        

    return (
        <div style = {{textAlign: "center"}}>
            <h3>Product List</h3>
            <input onChange={(e)=>{setInput(e.target.value)}} placeholder='enter item'/>
            <button onClick={addProduct}>add product</button>
            {productList}
        </div>
    )
}

export default UseMemo