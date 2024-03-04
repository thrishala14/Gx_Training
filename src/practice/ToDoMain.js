import React, { useState } from "react";

const ToDoMain = () => {
  const [list, setList] = useState([
    { id: 1, name: "kyle", age: 33 },
    { id: 2, name: "john", age: 23 },
    { id: 3, name: "adrianna", age: 27 },
    { id: 4, name: "annie", age: 19 },
  ]);

  const [user, setUser] = useState({ id: 0, name: "", age: 0 });

  const currAge = (item)=>{
    setUser(item)
  }

  const incrementAge =(item)=>{
    setList((users)=>{
      return (
        users.map((i)=>{
          if(i.id === item.id){
            return {...i, age: i.age +1}
          }
          else return i
        })
      )
    })
  }

  return (
    <div>
      User: {user.name} {user.age}
      {list.map((item) => {
        return (
          <>
            <p>
              {item.id}. {item.name} & {item.age}
            <button onClick = {()=>setUser(item)}>Set User</button>
            <button onClick = {()=>incrementAge(item)}>Increment Age</button>
            </p>
          </>
        );
      })}
    </div>
  );
};

export default ToDoMain;
