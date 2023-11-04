// Import component before using it
import React from "react";
import Select from "react-select";
import { useState } from "react";
import { useEffect } from "react";
import "../App.css";
import axios from "axios";
import Navbar from "../components/Navbar";

//Render the training page
function TrainingPage() {
  axios.defaults.baseURL = "localhost:8080";

  useEffect(() => {
    axios
      .get("/courses/getAllCourses/")
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
    <div>
      <Navbar/>
      <div class="dropdown-container">
        {/* <MyComponent/> */}
        <Select Options={optionsData} />
      </div>
      <div class="story-container">
        <p>
          Perry who did ptionsData.title went from 20k dead end job to 70k it
          developer!!!
        </p>
      </div>
    </div>
  );
}

export default TrainingPage;
