var fruits = ['Banana', 'Mangoes','Strawberry','Apples'].sort();
var liDom='';
for(let i=0;i<fruits.length;i++){
    liDom+="<li>"+fruits[i]+"</li>";
}
document.getElementById('abc').innerHTML=liDom;

localStorage.setItem('username', 'Thrishala ');
document.getElementById('cde').innerHTML=localStorage.getItem('username');


sessionStorage.setItem('username', 'Thrishala n p ');
document.getElementById('def').innerHTML=sessionStorage.getItem('username');