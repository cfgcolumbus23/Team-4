// Import component before using it
import TextBox from "../components/TextBox";
import "../App.css";
import React from "react";

function TrainingPage() {

  return (
    <div className="suggestion-box-container">
        <TextBox isRequired="Enter Chat"/>
    </div>
  );
}

export default TrainingPage;
