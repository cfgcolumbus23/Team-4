import React from "react";
import Select from 'react-select'
import "../App.css";

function SelectOptionBox() {
    const options = [
        { value: 'chocolate', label: 'Chocolate' },
        { value: 'strawberry', label: 'Strawberry' },
        { value: 'vanilla', label: 'Vanilla' }
      ]
      
    const MyComponent = () => (
        <Select options={options} />
      )

    // Make a GET request to the endpoint
    fetch("/courses/getCourse/0")
      .then((response) => response.json()) // Assuming the response is JSON
      .then(data => console.log(data));

    return (
    <div class="select-all-apply-menu">
        <MyComponent/>
    </div>
    );
}

export default SelectOptionBox;
