//alert("abc");
//single-line comment
/* multi
     -line
        comment*/

      /*  
function add(a, b) {
    c = a+b;
    document.getElementById('sum').innerHTML='Your sum is <span style="color:red"> '+c+' </span>';
}
a = prompt("Enter a number");
a = Number.parseInt(a);
b = prompt("Enter a number");
b = Number.parseInt(b);
add(a, b);
*/

function calcBMI(){
    var height = parseFloat(document.getElementById('height').value);
    var weight = parseFloat(document.getElementById('weight').value);
    console.log(height,weight);

    var heightInCm=height/100;
    let bmi = weight/(heightInCm**2);
    document.getElementById('bmiVal').innerText='Your BMI Value is '+bmi.toFixed(2);
    if(bmi<18.9){
        var status="You are under weight";
    }else if(bmi>18.9 && bmi<=24.5){
        var status="You are fit";
    }else if(bmi>24.6){
        var status="You are overweight"
    }
    document.getElementById('stat').innerText=status;
    return false;


}


