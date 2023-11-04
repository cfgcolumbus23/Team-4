import logo from './logo.svg';
import './App.css'; // Import the main CSS file
import './components/NavBar.css'; // Import the CSS file for Navbar
import { Navbar } from './components/Navbar.jsx';
import { BrowserRouter } from "react-router-dom";

function App() {
  return (
    <div className="GoodWi">
      <Navbar />
     
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
