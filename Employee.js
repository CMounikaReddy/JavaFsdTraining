
//import EmployeeIdGeneration from "./EmployeeIdGeneration"
import React, { useState } from "react";
//import EmpSalary from "./EmpSalary"
//import UseEffectExp from "./UseEffectExp"

export default function Employee(props) {

    return (
        <div>
            <h3>Employee Registration form</h3>
           <Form/>
        </div>
    );
}

export function Form(props) {
    const [name, setName] = useState("");
    const [age, setAge] = useState("");
    const [status, setStatus] = useState("");

    const handleSubmit = (evt) => {
        evt.preventDefault();
        alert(`Submitting Details ${name +" " +age +" " + status}`)
    }
    return (
        <div>
           
        <form onSubmit={handleSubmit}>
         
            <label>Emp Name:
                <input type="text" value={name}
                    onChange={e => setName(e.target.value)}
                />
            </label><br></br>

            <label>Emp Age:
                <input type="number" value={age}
                    onChange={e => setAge(e.target.value)}
                />
            </label><br></br>

            <label>Status:
                <input type="text" value={status}
                    onChange={e => setStatus(e.target.value)}
                />
            </label><br></br>
            <input type="submit" value="Submit" />
        </form>
        </div>
    );
}


