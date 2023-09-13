let display = document.getElementById('display');

function appendToDisplay(value){
    display.value+=value;
    debugger;
}

function clearD(){
    display.value = " ";
}

function calc(){
    debugger;
    display.value = eval(display.value);
}