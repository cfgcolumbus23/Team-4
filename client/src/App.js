import "./App.css";
// import SuggestionPage from './pages/SuggestionPage';
import SuggestionPage2 from "./pages/SuggestionPage2";
import TrainingPage from "./pages/TrainingPage";
import ChatPage from "./pages/ChatPage";
import { Navbar } from "./components/Navbar.jsx";
import { BrowserRouter } from "react-router-dom";
import "./components/NavBar.css"; // Import the CSS file for Navbar
import logo from "./logo.svg";
import AppChat from "./pages/ChatPageTest";

function App() {
  return (
    <div>
      <header>
        <Navbar />
      </header>
      <body>
        <AppChat />
        {/* <SuggestionPage2 /> */}
        {/* <TrainingPage /> */}
        {/* <ChatPage/> */}
      </body>
    </div>
  );
}

export default App;