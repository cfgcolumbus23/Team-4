import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import { BrowserRouter } from "react-router-dom";
import { Link, Route, BrowserRouter as Router, Routes } from "react-router-dom";
import LaunchRouter from "./components/LaunchRouter";
import SuggestionPage2 from "./pages/SuggestionPage2";
import ChatPage from "./pages/ChatPage";
import TrainingPage from "./pages/TrainingPage";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <Router>
      <Routes>
        <Route exact path="/" element={<App />} />
        <Route exact path="/SuggestionPage" element={<SuggestionPage2 />} />
        <Route exact path="/ChatPage" element={<ChatPage />} />
        <Route exact path="/TrainingPage" element={<TrainingPage />} />
      </Routes>
    </Router>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
