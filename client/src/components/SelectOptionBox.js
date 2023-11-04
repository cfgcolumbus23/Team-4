import React from "react";
import Select from 'react-select'
import "../App.css";

//generates the options box to choose a particular goodwill course
function SelectOptionBox() {

    i = 0;
    while (data != null) {
      // Make a GET request to the endpoint
      fetch("/courses/getCourse/0")
      .then((response) => response.json()) 
      .then(data => console.log(data));
      options.push()
      i++;
    }
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
