import './App.css'; // Import the main CSS file
import './components/NavBar.css'; // Import the CSS file for Navbar
import { Navbar } from './components/Navbar.jsx';
import { BrowserRouter, Routes, Route} from "react-router-dom";
import TestEl from './pages/SubmitARec';
import TestE from './pages/ChatBox';
import TestChatbox from './pages/ChatBox';
import TestTraining from './pages/ChatBox';


function App() {
  return (
    <div className="GoodWi">

      <BrowserRouter>
      <Navbar />

      <Routes>
        <Route path='/' element={<TestEl/>}/>
      </Routes>
      <Routes>
        <Route path='/' element={<TestChatbox/>}/>
      </Routes>
      <Routes>
        <Route path='/' element={<TestTraining/>}/>
      </Routes>
      </BrowserRouter>
     
    </div>
  );
}

export default App;
