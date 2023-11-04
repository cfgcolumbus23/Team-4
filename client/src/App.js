import './App.css'; // Import the main CSS file
import './components/NavBar.css'; // Import the CSS file for Navbar
import { Navbar } from './components/Navbar.jsx';
import { BrowserRouter, Routes, Route} from "react-router-dom";
import TestRec from './pages/SubmitARec';
import TestChatbox from './pages/ChatBox';
import TestTraining from './pages/ChatBox';


function App() {
  return (
    <div>

      <BrowserRouter>
      <Navbar />

      <Routes>
        <Route path='/TestRec' element={<TestRec/>}/>
      </Routes>
      <Routes>
        <Route path='/ChatBox' element={<TestChatbox/>}/>
      </Routes>
      <Routes>
        <Route path='/Training' element={<TestTraining/>}/>
      </Routes>
      </BrowserRouter>
     
    </div>
  );
}

export default App;
