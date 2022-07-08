import React, { useState } from "react";

export default class EmpSalary extends React.Component() {
    constructor(props) {
        super(props);
        console.log("constructor is called!!");
        this.state = { date: new Date() };
    }

    componentDidMount() {
        console.log("component did mount called!!");
        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.timerID);
    }

    tick() {
        this.setState({
            date: new Date()
        });
    }

    render() {
        return (
            <div>
                <h2>Employee Salary Details</h2>
                <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
            </div>
        );
    }
}