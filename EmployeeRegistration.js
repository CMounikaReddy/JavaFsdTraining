import EmployeeIdGeneration from "./EmployeeIdGeneration";
import React, { useState } from "react";
import EmpSalary from "./EmpSalary";
import UseEffectExp from "./UseEffectExp";

export default function EmployeeRegistration(props) {

    return (
        <div>
            <h3>Employee Registration Form</h3>
            <Form />
        </div>
    );
}

export function Form(props) {

    const employeedet = {
        empname: '',
        age: '',
        status: '',
    };

    const [employee, setEmployee] = useState(employeedet);

    const handlechange = (event) => {
        const { name, value } = event.target

        setEmployee({ ...employee, [name]: value })
    }


    const handleSubmit = (evt) => {
        evt.preventDefault();
        alert(`Submitting Details.................www {$employee.empname + "...." + employee.age + " " + employee.status}`);

        fetch('http://localhost:8080/employee/EmpRegistration', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(employee)
        }).then((response) => console.log(response)).catch(console.log("error"));

        alert("fetch is called........");
    }
    return (
        <div>
            <form onSubmit={handleSubmit}>

                <label>Emp Name:
                    <input name="empname"
                    type="text"
                    value={employee.empname}
                        onChange={handlechange}
                    />
                </label><br/>

                <label>Emp Age:
                    <input name="age"
                    type="number"
                    value={employee.age}
                        onChange={handlechange}
                    />
                </label><br/>

                <label>Status:
                    <input name="status"
                    type="text"
                    value={employee.status}
                        onChange={handlechange}
                    />
                </label><br/>
                <input type="submit" value="Submit" />
            </form>
        </div>
    );
}