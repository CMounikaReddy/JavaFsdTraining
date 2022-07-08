import React, { useState } from "react";

export function EmployeeIdGeneration(){

    const [count, setCount] = useState(0);
    const [companyName, setCompanyName] = useState(0);

    return(
        <div>
            <h1> {companyName} </h1>
            {this.state.setCompanyName("Incedo")}
            <p>You Clicked {count} Times</p>
            <button onClick={() => setCount(count+1)}>
                Click Here
            </button>
        </div>
    );
}