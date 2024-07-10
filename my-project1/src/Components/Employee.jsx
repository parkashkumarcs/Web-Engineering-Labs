import { useState } from "react";
import femaleProfile from ./images/femaleProfile.jpg;
function Employee(){
    const [employees, employeeSet]=useState([
        {
        fullName: "Parkash Kumar",
        job: "Software Engineer",
        gender: "Male",
        salary: "12000$"
        },
        {
            fullName: "Nizam Uddin",
            job: "Software Engineer",
            gender: "Male",
            salary: "13000$"
        },
        {
            fullName: "Shahzia",
            job: "Programmer",
            gender: "Female",
            salary: "10000$"
        },
        {
            fullName: "Asif Ali",
            job: "Project Manager",
            gender: "Male",
            salary: "15000$"
        }
    
    ]); 
    return(<>
        
        <div>{employees.map((employee) =>(
            <h3>Full Name: {employee.fullName}</h3>
        ) )}</div>
    </>)
}
export default Employee;