
import React, { useEffect, useState } from 'react';
import { Link, useNavigate, useParams } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';

export default function Editemployee() {


    const empInitial = {
        empId: '',
        empName: '',
        age: '',
        status: ''
    };

    let loaded = false;

    const [employee, setEmployee] = useState(empInitial);
    const [loading, setLoading] = useState(true);

    const navigate = useNavigate();
    const { empId } = useParams();

    useEffect(() => {
        alert("use effect called u");
        alert(empId);
        async function getEmp() {
            alert("Before Fetch");
            const response = await fetch(`http://localhost:8080/employee/getEmp/${empId}`);
            const json = await response.json();
            setEmployee(json);
            console.log(json);
            loaded = true;
            setLoading(false);
        }
        getEmp();
    }, []);

    const handleChange = (event) => {
        const { name, value } = event.target
        setEmployee({ ...employee, [name]: value })
    }


    const handleSubmit = (evt) => {

        evt.preventDefault();
        alert(`Submitting Name.................www ${employee.empName + "...." + employee.age + " " + employee.status}`);

        fetch('http://localhost:8080/employee/updateEmp', {
            method: 'put',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(employee)
        }).then((response) => console.log(response)).catch(console.log("error"));

        setEmployee(empInitial);
        navigate('/dashboard');
    }


    return (
        <div>
            <Container>
                <Form onSubmit={handleSubmit}>

                    <FormGroup>
                        <Label for="empName">Employee Id</Label>
                        <Input type="text" name="empId" id="empId" value={employee.empId || ''}
                            onChange={handleChange} autoComplete="empId" />
                    </FormGroup>

                    <FormGroup>
                        <Label for="empName">Employee Name</Label>
                        <Input type="text" name="employeeName" id="employeeName" value={employee.empName || ''}
                            onChange={handleChange} autoComplete="empName" />
                    </FormGroup>

                    <FormGroup>
                        <Label for="empName">Employee Age</Label>
                        <Input type="text" name="age" id="age" value={employee.age || ''}
                            onChange={handleChange} autoComplete="age" />
                    </FormGroup>

                    <FormGroup>
                        <Label for="empName">Employee Status</Label>
                        <Input type="text" name="status" id="status" value={employee.status || ''}
                            onChange={handleChange} autoComplete="status" />
                    </FormGroup>
                    <input type="submit" value="Update Employee" />

                </Form>
            </Container>
        </div>

    )

}

