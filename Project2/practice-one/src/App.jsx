import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
        <header>Parkash Kumar</header>
        <section>
          <div className="left-container"></div>
          <div className="centerCont">
            <div className="center-container1"></div>
            <div className="center-container2"></div>
          </div>
          <div className="rightCont">
            <div className="right-container1"></div>
            <div className="right-container2"></div>
          </div>
          
        </section>
        <footer></footer>
    </>
  )
}

export default App
