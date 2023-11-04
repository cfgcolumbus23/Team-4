import "../App.css";
import React, { useState } from "react";
import axios from "axios";
import Navbar from "../components/Navbar";

//Render the suggestion page
function SuggestionPage2() {
  axios.defaults.baseURL = "http://localhost:8080";

  const [value, setValue] = useState("");
  const [email, setEmail] = useState("");
  const [name, setName] = useState("");
  const [feedback, setFeedback] = useState("");

  const handleSubmit = () => {
    axios.defaults.baseURL = "http://localhost:8080";

    // const postObject = {
    //   feedbackId: 7,
    //   message: "feedback",
    //   isSingleParent: false,
    //   isVeteran: false,
    //   wasIncarcerated: false,
    //   hasIDD: false,
    // };

    axios.post("/feedback/save", {
      feedbackId: 7,
      message: feedback,
      isSingleParent: checkedOne,
      isVeteran: checkedTwo,
      wasIncarcerated: checkedThree,
      hasIDD: checkedFour,
    });
  };

  //for textboxes
  function handleChangedValue(e) {
    // setValue(e.target.value);
    // console.log(value);

    switch (e.target.id) {
      case "name":
        setName(e.target.value);
        break;
      case "feedback":
        setFeedback(e.target.value);
        break;
      case "email":
        setEmail(e.target.value);
        break;
    }
  }

  const handleInputChange = (event) => {
    // Update the name state with the new value entered in an input field
    setName(event.target.value);
  };

  const inputStyleFeedback = {
    height: "250px",
    width: "500px", // Increase the width to make it bigger
    fontSize: "24px", // Increase the font size
  };
  const inputStyleName = {
    height: "50px",
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

  //select all that apply
  const [checkedOne, setCheckedOne] = React.useState(false);
  const [checkedTwo, setCheckedTwo] = React.useState(false);
  const [checkedThree, setCheckedThree] = React.useState(false);
  const [checkedFour, setCheckedFour] = React.useState(false);

  const handleChangeOne = () => {
    setCheckedOne(!checkedOne);
  };

  const handleChangeTwo = () => {
    setCheckedTwo(!checkedTwo);
  };

  const handleChangeThree = () => {
    setCheckedThree(!checkedThree);
  };

  const handleChangeFour = () => {
    setCheckedFour(!checkedFour);
  };

  //return
  return (
    <div>
      <Navbar />
      <div className="suggestion-box-container">
        <div className="name-email-box">
          <h2>Phone Number</h2>
          <input
            type="text"
            style={inputStyleName}
            id="name"
            name="name"
            onChange={(e) => {
              handleChangedValue(e);
            }}
          />
        </div>
        <div className="name-email-box">
          <h2>Email</h2>
          <input
            type="text"
            style={inputStyleName}
            id="email"
            name="name"
            onChange={handleChangedValue}
          />
        </div>
        <div className="name-email-box">
          <h2>* Feedback</h2>
          <input
            type="text"
            style={inputStyleFeedback}
            id="feedback"
            name="name"
            onChange={handleChangedValue}
          />
        </div>
        <div class="select-all-apply-menu align-left">
          <h2>Choose all that apply:</h2>
          <Checkbox
            label="Single Parent"
            value={checkedOne}
            onChange={handleChangeOne}
          />
          <Checkbox
            label="Veteran"
            value={checkedTwo}
            onChange={handleChangeTwo}
          />
          <Checkbox
            label="Incarcaerated"
            value={checkedThree}
            onChange={handleChangeThree}
          />
          <Checkbox
            label="I/DD"
            value={checkedFour}
            onChange={handleChangeFour}
          />
        </div>
        <div class="submit">
          <button onClick={handleSubmit}>Submit</button>
        </div>
      </div>
    </div>
  );
}

export default SuggestionPage2;
