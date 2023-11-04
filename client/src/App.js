import "./App.css";
import SuggestionPage2 from "./pages/SuggestionPage2";
import TrainingPage from "./pages/TrainingPage";
import ChatPage from "./pages/ChatPage";
import { Navbar } from "./components/Navbar.jsx";
import { BrowserRouter } from "react-router-dom";
import "./components/NavBar.css"; // Import the CSS file for Navbar
import ProgressBar from "./components/ProgressBar.jsx"; // Import the ProgressBar component
import logo from "./logo.svg";
import AppChat from "./pages/ChatPageTest";
import React, { Component } from "react";
import SockJsClient from "react-stomp";
import "./App.css";
import "./css/MessageStyle.css";
import NameComponent from "./components/NameComponent";
import { TextField } from "@mui/material";
import { DialogActions } from "@mui/material";
import { Button } from "@mui/material";

<<<<<<< HEAD
function App() {
  return (
    <div>
      <header>
        <Navbar />
      </header>
      <body>
        //<ProgressBar /> {/* Include the ProgressBar component here */}
        <SuggestionPage2 />
        {/* <TrainingPage /> */}
        {/* <ChatPage/> */}
      </body>
    </div>
  );
=======
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      messages: [],
      typedMessage: "",
      name: "",
    };
  }

  componentDidMount() {
    this.clientRef.connect();
  }

  setName = (name) => {
    console.log(name);
    this.setState({ name: name });
  };

  sendMessage = () => {
    this.clientRef.sendMessage(
      "/app/user-all",
      JSON.stringify({
        name: this.state.name,
        message: this.state.typedMessage,
      })
    );
  };

  displayMessages = () => {
    return (
      <div>
        {this.state.messages.map((msg) => {
          return (
            <div>
              {this.state.name == msg.name ? (
                <div>
                  <p className="title1">{msg.name} : </p>
                  <br />
                  <p>{msg.message}</p>
                </div>
              ) : (
                <div>
                  <p className="title2">{msg.name} : </p>
                  <br />
                  <p>{msg.message}</p>
                </div>
              )}
            </div>
          );
        })}
      </div>
    );
  };

  render() {
    return (
      <div>
        <NameComponent setName={this.setName} />
        <div className="align-center">
          <h1>Welcome to Web Sockets</h1>
          <br />
          <br />
        </div>
        <div className="align-center">
          User : <p className="title1"> {this.state.name}</p>
        </div>
        <div className="align-center">
          <br />
          <br />
          <table>
            <tr>
              <td>
                <TextField
                  id="outlined-basic"
                  label="Enter Message to Send"
                  variant="outlined"
                  onChange={(event) => {
                    this.setState({ typedMessage: event.target.value });
                  }}
                />
              </td>
              <td>
                <Button
                  variant="contained"
                  color="primary"
                  onClick={this.sendMessage}
                >
                  Send
                </Button>
              </td>
            </tr>
          </table>
        </div>
        <br />
        <br />
        <div className="align-center">{this.displayMessages()}</div>
        <SockJsClient
          url="/ws/"
          topics={["/topic/user"]}
          onConnect={() => {
            console.log("connected");
          }}
          onDisconnect={() => {
            console.log("Disconnected");
          }}
          onMessage={(msg) => {
            var jobs = this.state.messages;
            jobs.push(msg);
            this.setState({ messages: jobs });
            console.log(this.state);
          }}
          ref={(client) => {
            this.clientRef = client;
          }}
        />
      </div>
    );
  }
>>>>>>> 687d9a5ca3f2d5d8c2bc635c164c1d386a57e4c4
}

export default App;
