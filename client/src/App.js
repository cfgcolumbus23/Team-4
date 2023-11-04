import "./App.css";
import SuggestionPage2 from "./pages/SuggestionPage2";
import TrainingPage from "./pages/TrainingPage";
import ChatPage from "./pages/ChatPage";
import { Navbar } from "./components/Navbar.jsx";
import { BrowserRouter } from "react-router-dom";
import "./components/NavBar.css"; // Import the CSS file for Navbar
import ProgressBar from "./components/ProgressBar.jsx"; // Import the ProgressBar component
import logo from "./logo.svg";
import TextBox from "./components/TextBox";


function App() {
  return (
    <div>
      <header>
        <Navbar />
      </header>
      <body>
        <ProgressBar /> {/* Include the ProgressBar component here */}
        <SuggestionPage2 />
        {/* <TrainingPage /> */}
        {/* <ChatPage/> */}
      </body>
    </div>
  );
}

export default App;
