// Import component before using it
import SelectAllApplyBox from "../components/SelectAllApplyBox";
import TextBox from "../components/TextBox";
import "../App.css";
import React from "react";
import Submit from "../components/Submit";

//Render the suggestion page
function SuggestionPage() {
  return (
    <div className="suggestion-box-container">
      <TextBox isRequired="Not Required" fieldName="Email" height="50px" />
      <TextBox isRequired="Not Required" fieldName="Name" height="50px" />
      <TextBox isRequired="Required" fieldName="Feedback" height="400px" />
      <SelectAllApplyBox />
      <Submit />
    </div>
  );
}

export default SuggestionPage;
