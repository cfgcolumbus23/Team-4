import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import SuggestionPage2 from "./pages/SuggestionPage2";
import TrainingPage from "./pages/TrainingPage";
import * as serviceWorker from "./ServiceWorker";
import SignIn from "./components/SignIn";



import AppChat from "./pages/ChatPageTest";

const root = ReactDOM.createRoot(document.getElementById("root"));
serviceWorker.unregister();
root.render(
  <React.StrictMode>
    <Router>
      <Routes>
        <Route exact path="/" element={<App />} />
        <Route exact path="/SuggestionPage" element={<SuggestionPage2 />} />
        <Route exact path="/ChatPage" element={<AppChat />} />
        <Route exact path="/TrainingPage" element={<TrainingPage />} />
        <Route exact path="/Your-Progress" element={<SignIn />} />

      </Routes>
    </Router>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();