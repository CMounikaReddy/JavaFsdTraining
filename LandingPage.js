import React from "react";
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from './Home';
import About from './About';
import Dashboard from './Dashboard';
import Employee from './Employee';
import EmployeeManagement from './EmployeeManagement';
import EditEmployee from './EditEmployee';

export default function LandingPage() {
    return (
        <div>

            <BrowserRouter>
                <h1>Online Shopping</h1>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/about">About</Link>
                        </li>
                        <li>
                            <Link to="/dashboard">Dashboard</Link>
                        </li>
                        <li>
                            <Link to="/employeeManagement">EmployeeManagement</Link>
                        </li>
                    </ul>
                    <br/><hr/>
            <Routes>
                <Route path="/"  element={<Home />} />
                <Route path="about" element={<About />} />
                <Route path="dashboard" element={<Dashboard />} />
                <Route path="employeeManagement" element={<EmployeeManagement />} />
                <Route path="employeeRegistration" element={<Employee />} />
                <Route path="editEmployee/:empId" exact={true} element={<EditEmployee/>} />
            </Routes>

        </BrowserRouter >

        </div >

    );
}
