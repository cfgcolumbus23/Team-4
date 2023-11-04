// Import component before using it
import TextBox from "../components/TextBox";
import "../App.css";
import React from "react";


//Render the training page 
function TrainingPage() {

  return (
    <div className="chat-box-container">
        <TextBox isRequired="Enter Chat"/>
    </div>
  );
}

export default TrainingPage;
