import React from "react";
import {Link} from "react-router-dom";
import Employee from "./Employee";

export default function EmployeeMangement() {
    return (
        <div>
            <h2>Employee Management</h2>
            <ul>
                <li>
                    <Link to="/EmployeeRegistration">EmployeeRegistration form</Link>
                </li>
                <li>
                    <Link to="/EmployeeDetails">Employee Details</Link>
                </li>
                <li>
                    <Link to="/EmployeeSalary">Employee Salary</Link>
                </li>
            </ul>
        </div >
    );
}