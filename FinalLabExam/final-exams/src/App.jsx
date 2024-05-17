import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  //let [count, setCount] = useState([])
  let [count, setCount] = useState(0)
  let addCustomer=()=>{

    count=<>
        <div className='main'>
        <p>Customer</p>
        <div className='container'>
          <button className='btn'>+</button>
          <label>0</label>
          <button className='btn'>-</button>
          <button className='btn1'>Delete</button>
        </div>
        </div>
        
    </>
      //setCount([...count,useSet]);
      setCount(count);
  }


  return (
    /*<div>{count.map((item,index)=>{
        <div key={index.id}>{count}</div>
      })}</div>*/ 
    <>
      <button onClick={addCustomer}>Add Customer</button>
      <div>{count}</div>
    </>
  )
}

export default App
