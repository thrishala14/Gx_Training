import React, { useState } from 'react'

const TodoList = () => {
  const [todo, setTodo] = useState([]);
  const [ip, setIp] = useState("");

  const addTodo =(e)=>{
    e.preventDefault();
    setTodo([...todo, ip]);
    setIp("")
  }
  return (
    <>
        <h3>To do List</h3>
        <form onSubmit={(e)=>addTodo(e)}>
          <input onChange={(e)=>{setIp(e.target.value)}}/>
        </form>
        <ul>
          {todo.map((i)=>{return <li>{i}</li>})}
        </ul>
    </>
  )
}

export default TodoList