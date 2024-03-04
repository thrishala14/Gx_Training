import React, { useState } from 'react'
import { useHref } from 'react-router-dom'
import img1 from './img1.jpg'
import img2 from './img2.jpg'
import img3 from './img3.jpg'

const ImageSlider = () => {
  const images = [
    {
        id: 1,
        img: <img src={img1} alt = "img1" style={{height: "10rem", width: "14rem"}}/>
    },
    {
        id: 2,
        img: <img src={img2} alt = "img2" style={{height: "10rem", width: "14rem"}}/>
    },
    {
        id: 3,
        img: <img src={img3} alt = "img3" style={{height: "10rem", width: "14rem"}}/>
    }
  ]

  const [count, setCount] = useState(1);
  return (
    <>
        {images.find(i=>{return i.id===count}) ? images.map((i)=> {if(i.id === count){return i.img}}): <img alt ="no"/>}
        <button onClick={()=> setCount(count => {if(count!=1){return count-1}})} > I--</button>
        <button onClick={()=> setCount(count => {if(count<=3){return count+1}})}> --I</button>
    </>
  )
}

export default ImageSlider