import "./App.css";
import SuggestionPage2 from "./pages/SuggestionPage2";
import TrainingPage from "./pages/TrainingPage";
import { Navbar } from "./components/Navbar.jsx";
import { BrowserRouter } from "react-router-dom";
import "./components/NavBar.css"; // Import the CSS file for Navbar
import ProgressBar from "./components/ProgressBar.jsx"; // Import the ProgressBar component
import logo from "./logo.svg";

// App.js (or App.jsx)
import React from 'react';

function App() {
  return (
    <div>
      <header>
      </header>
      <body>
        <SuggestionPage2 />
        {/* <TrainingPage /> */}
        {/* <ChatPage/> */}
      </body>
    </div>
  );

}

export default App;

