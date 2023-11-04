import React from "react";
import Select from 'react-select'
import { useState } from "react";
import { useEffect } from "react";
import "../App.css";

//generates the options box to choose a particular goodwill course
function SelectOptionBox() {

   useEffect(() => {
    fetch("/courses/getAllCourses/")
      .then(response => response.json())  //function(response) {return {response.json}}
      .then(data =>  setOptionsData(data));
   })
   .catch((error) => {
    console.error("Error fetching courses", error);
   });

   const [optionsData, setOptionsData] = useState([]);

      
    const MyComponent = () => (
        <Select options={optionsData}/>
      )

    return (
    <div class="select-all-apply-menu">
        <MyComponent/>
    </div>
    );
}

export default SelectOptionBox;
