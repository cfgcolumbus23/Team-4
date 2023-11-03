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

    return (
    <div class="select-all-apply-menu">
        <MyComponent/>
    </div>
    );
}

export default SelectOptionBox;
