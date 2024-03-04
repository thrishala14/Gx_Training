import "bootstrap/dist/css/bootstrap.css";
import React, {useReducer} from 'react'

const reducer=(state, action)=>{
    if(action.type == "add"){
        return {
            items: state.items.concat(action.value), 
            noOfItems: state.noOfItems+1,
            total: (state.items.reduce((prev, curr)=>{return prev+curr.price}, 0))+action.value.price
        }
    }
    if(action.type == "remove"){
        return {
        items: state.items.filter((item)=>item!=action.value), 
        noOfItems: state.noOfItems-1,
        total: state.total-action.value.price
    }
    }
}
const ShoppingCart = () => {
    const products = [
        {
            name: "item1",
            price: 200,
        },
        {
            name: "item2",
            price: 300,
        },
        {
            name: "item3",
            price: 400,
        },
        ];
        const[state, dispatch] = useReducer(reducer, {
            noOfItems: 0,
            items: [],
            total:0
        })
  return (
    

    <div>
      <h2 className="text-light bg-dark text-center"> SHOPPING APPLICATION</h2>
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Cart</th>
          </tr>
        </thead>
        <tbody>
          
      {products.map((item, index) => (
        <tr>
            <th scope="row">{index+1}</th>
            <td> {item.name}</td>
            <td> {item.price} </td>
            <td><button onClick={()=>dispatch({type:"add", value: item})}>ADD TO CART</button></td>
        </tr>
         
      ))}
      </tbody>
      </table>
      <h4>CART</h4>
      <p className= "text-info">No of items in cart: {state.noOfItems}</p>
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Cart</th>
          </tr>
        </thead>
        <tbody>
      {state.items.map((item, index)=><tr>
            <th scope="row">{index+1}</th>
            <td> {item.name}</td>
            <td> {item.price} </td>
            <td><button onClick={()=>dispatch({type:"remove", value: item})}>REMOVE</button></td>
        </tr>)}
        <th></th>
        <td>TOTAL PRICE: </td>
        <td>{state.total}</td>
        <td></td>
        </tbody>
        </table>
    </div>
    
)};

export default ShoppingCart;
