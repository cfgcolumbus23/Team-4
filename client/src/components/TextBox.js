import "../App.css";
import React, { useState } from "react";


//this creates a textbox based on the configurable inputs
export default function TextBox({isRequired, fieldName, height}) {

  const [value, setValue] = useState("");

  function handleChangedValue(e) {
    setValue(e.target.value);
    console.log(value);
  }

  const inputStyle = {
    height: {height},
    width: "500px", // Increase the width to make it bigger
    fontSize: "24px", // Increase the font size
  };

  return (
    <div className="name-email-box">
      <h2>{isRequired}: {fieldName}</h2>
      <input type="text" style={inputStyle} id="name" name="name" onChange={handleChangedValue} />
    </div>
  );
}