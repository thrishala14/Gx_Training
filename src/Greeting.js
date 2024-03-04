const userProfile = {
    name: "Thrishala",
    age: 22
}

function greeting(user){
    return user.name + " " +user.age;
}

export const greeter = <h1> Hello, {greeting(userProfile)}</h1>

