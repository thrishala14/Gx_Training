
import 'bootstrap/dist/css/bootstrap.css';
import ReactDOM from 'react-dom/client';
import App from './App';
import React from 'react';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
        <React.StrictMode>
        <App/>
        </React.StrictMode>
);

// function tick(){
//     const element = (
//         <div> 
//         <h2> It is {new Date().toLocaleTimeString}</h2>
//         </div>
//     );
//     root.render(element);
// }
// setInterval(tick,1000);
