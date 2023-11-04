// Import component before using it
// import SelectAllApplyBox from "../components/SelectAllApplyBox";
// import TextBox from "../components/TextBox";
import "../App.css";
import React, { useState } from "react";
// import Submit from "../components/Submit";

//Render the suggestion page
function SuggestionPage2() {
  const [value, setValue] = useState("");
  const [email, setEmail] = useState("");
  const [name, setName] = useState("");
  const [feedback, setFeedback] = useState("");

  const handleSubmit = () => {
    const postObject = {"feedBackID": 100, "message": feedback, "isSingleParent":false, "isVeretran": false, "wasIncareated": false, "hasIDD": false}
    fetch("http://localhost:8080/save", {
        method: 'POST',
        body: postObject
    }).then(fetch("http://localhost:8080/get/100").then(response => response.json()).then(response => console.log(response)))
  }

  //for textboxes
  function handleChangedValue(e) {
    // setValue(e.target.value);
    // console.log(value);

    switch(e.id) {
        case "name":
            setName(e.value);
            break;
        case "feedback":
            setFeedback(e.value);
            break;
        case "email":
            setEmail(e.value);
            break;
    }
  }
  const inputStyle = {
    height: "400px",
    width: "500px", // Increase the width to make it bigger
    fontSize: "24px", // Increase the font size
  };

  //for checkboxes
  const [checked, setChecked] = React.useState(false);

  const handleChange = () => {
    setChecked(!checked);
  };
  
  const Checkbox = ({ label, value, onChange }) => {
    return (
      <label>
        <input type="checkbox" checked={value} onChange={onChange} />
        {label}
      </label>
    );
  };

  return (
    <div className="suggestion-box-container">
      <div className="name-email-box">
        <h2>
          Name
        </h2>
        <input
          type="text"
          style={inputStyle}
          id="name"
          name="name"
          onChange={handleChangedValue}
        />
      </div>
      <div className="name-email-box">
        <h2>
          Email
        </h2>
        <input
          type="text"
          style={inputStyle}
          id="email"
          name="name"
          onChange={handleChangedValue}
        />
      </div>
      <div className="name-email-box">
        <h2>
          * Feedback
        </h2>
        <input
          type="text"
          style={inputStyle}
          id="feedback"
          name="name"
          onChange={handleChangedValue}
        />
      </div>
      <div class="select-all-apply-menu align-left">
      <button onClick={handleSubmit} type="Submit">Submit</button>
    </div>
    </div>
  );
}

export default SuggestionPage2;
