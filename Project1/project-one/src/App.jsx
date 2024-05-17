import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [users, setUsers] = useState([]);

  const createUser = () => {
    setUsers([...users, { activeStep: 0 }]);
  };

  const nextStep = (userIndex) => {
    const updatedUsers = [...users];
    const activeStep = updatedUsers[userIndex].activeStep + 1;
    updatedUsers[userIndex].activeStep = activeStep;
    setUsers(updatedUsers);
  };

  return (
    <>
      <div className="App">
      <h1>Click the button to create multiple users</h1>
      <button onClick={createUser}>Create User</button>
      {users.map((user, userIndex) => (
        <div key={userIndex} className="user">
          <p>User {userIndex + 1}</p>
          <div className="steps">
            {[...Array(5)].map((_, stepIndex) => (
              <div
                key={stepIndex}
                className={`step ${user.activeStep === stepIndex ? 'active' : ''}`}
                onClick={() => setUsers(users => {
                  const updatedUsers = [...users];
                  updatedUsers[userIndex].activeStep = stepIndex;
                  return updatedUsers;
                })}
              >
                Step {stepIndex + 1}
              </div>
            ))}
          </div>
          <button className="btn"
            onClick={() => nextStep(userIndex)}
            disabled={user.activeStep === 4}
          >
            Next
          </button>
        </div>
      ))}
    </div>
    </>
  )
}

export default App
