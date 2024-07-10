import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Footer from './Components/Footer'
import Content from './Components/Content'
import Header from './Components/Header'
import Employee from './Components/Employee'

function App() {
  return (
    <>
      <Header></Header>
      <Employee></Employee>
      <Footer></Footer>
    </>
  )
}

export default App
