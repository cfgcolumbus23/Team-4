import React from "react";
import Select from "react-select";
import { useState } from "react";
import { useEffect } from "react";
import "../App.css";

//generates the options box to choose a particular goodwill course
function SelectOptionBox() {
  useEffect(() => {
    fetch("http://localhost:8080/courses/getAllCourses/")
      .then((response) => response.json()) //function(response) {return {response.json}}
      .then((data) => setOptionsData(data))
      .catch((error) => {
        console.error("Error fetching courses", error);
      });
  }, []);

  const [optionsData, setOptionsData] = useState([]);
  // const options = [
  //   { value: 'chocolate', label: 'Chocolate' },
  //   { value: 'strawberry', label: 'Strawberry' },
  //   { value: 'vanilla', label: 'Vanilla' }
  // ]

  return (
    <div class="dropdown-container">
      {/* <MyComponent/> */}
      <Select Options={optionsData} />
    </div>
  );
}

export default SelectOptionBox;
