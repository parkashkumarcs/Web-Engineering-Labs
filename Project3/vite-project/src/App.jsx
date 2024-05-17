import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import './Components/ListGroup.jsx'
import PracticeList from './Components/PracticeList.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div><PracticeList/></div>
    </>
  )
}

export default App
