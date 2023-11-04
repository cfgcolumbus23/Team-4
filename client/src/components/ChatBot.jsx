// ChatBot.jsx
import React, { useState } from 'react';
import './ChatBot.css'; // Make sure to create a corresponding CSS file for styling

const ChatBot = () => {
  const [messages, setMessages] = useState([]);
  const [userInput, setUserInput] = useState('');

  const handleUserInput = (event) => {
    setUserInput(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (!userInput.trim()) return;

    // Add the user's input to the messages array
    setMessages([...messages, { sender: 'user', text: userInput.trim() }]);

    // Here you would typically send the userInput to a backend service
    // and get a response. For now, we'll just mimic a bot response.
    const botResponse = `Bot says: You typed "${userInput.trim()}"`;
    setMessages([...messages, { sender: 'user', text: userInput.trim() }, { sender: 'bot', text: botResponse }]);

    // Clear the input field
    setUserInput('');
  };

  return (
    <div className="chatbot-container">
      <div className="messages-display">
        {messages.map((message, index) => (
          <div key={index} className={`message ${message.sender}`}>
            {message.text}
          </div>
        ))}
      </div>
      <form className="user-input-form" onSubmit={handleSubmit}>
        <input
          type="text"
          value={userInput}
          onChange={handleUserInput}
          placeholder="Type your message here..."
        />
        <button type="submit">Send</button>
      </form>
    </div>
  );
};

export default ChatBot;
