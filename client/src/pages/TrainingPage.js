// Import component before using it
import SelectOptionBox from "../components/SelectOptionBox";
import "../App.css";
import React from "react";


//Render the training page
function TrainingPage() {

  return (
    <div className="dropdown-container">
        <SelectOptionBox/>
    </div>
  );
}

export default TrainingPage;