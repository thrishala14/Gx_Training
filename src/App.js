import React, { useState } from 'react'
import "bootstrap/dist/css/bootstrap.min.css";
import FunctionalComponent from './sessions/dayOne/FunctionalComponent';
import ClassComponent from './sessions/dayOne/ClassComponent';
import EventHandling from './sessions/dayOne/EventHandling';
import UseEffect from './sessions/dayOne/UseEffect';
import ParentComp from './sessions/dayOne/ParentComp';
import MyContext from './sessions/dayOne/MyContext';
import ContextDemo from './sessions/dayOne/ContextDemo';
import Counter from './sessions/dayOne/Counter';
import ServiceIntegrationPost from './sessions/dayTwo/ServiceIntegrationPost';
import { ServiceIntegrationGet } from './sessions/dayTwo/ServiceIntegrationGet';
import UseReducer from './sessions/dayThree/UseReducer';
import UseRef from './sessions/dayThree/UseRef';
import UseCallback from './sessions/dayThree/CustomHooks';
import UseMemo from './sessions/dayThree/UseMemo';
import CustomHooks from './sessions/dayThree/CustomHooks';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import Home from './sessions/dayThree/Home';
import Account from './sessions/dayThree/Account';
import About from './sessions/dayThree/About';
import MainClass from './sessions/dayFive/MainClass';
import MainComponent from './sessions/daySeven/MainComponent';
import { Pagination } from 'react-bootstrap';
import PaginationDemo from './sessions/daySeven/PaginationDemo';
import MemoDemo from './useMemo/MemoDemo';

function App(){
  const [theme, setTheme] = useState(true);

  return(
    <>
    <MemoDemo/>
    {/* <MainComponent/> */}
    {/* <PaginationDemo/> */}

    {/* <MainClass/> */}
    
    {/* <BrowserRouter>
    <div style={{display:"flex", justifyContent:"space-between"}}>
      <Link to = '/home'>Home</Link>
      <Link to = '/about'>About Us</Link>
      <Link to = '/account'>Account</Link>
    </div>
      <Routes>
        <Route path = '/home' element = {<Home/>}/>
        <Route path = '/about' element = {<About/>}/>
        <Route path = '/account' element = {<Account/>}/>
      </Routes>
    </BrowserRouter> */}
    {/* <UseReducer/> */}
    {/* <UseRef/> */}
    {/* <UseMemo/> */}
    {/* <CustomHooks/> */}


    {/* 
      DAY 2: 
    <ServiceIntegrationPost/>
    <ServiceIntegrationGet/> */}

    
      {/* 
        DAY 1: 
      <Counter/>
      <MyContext.Provider value = {{theme: theme, setTheme: setTheme}}>
        <ContextDemo/>
        <button onClick={()=>setTheme(v=>!v)}>click</button>
      </MyContext.Provider>
      <ParentComp/>
      <EventHandling/>
      <UseEffect/>
      <FunctionalComponent location = "Bangalore" age = {22}/>
      <ClassComponent location = "Bangalore" designation = "Associate Developer"/> */}
    </>
  )
}

export default App;