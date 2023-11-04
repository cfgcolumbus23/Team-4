import React, { useState } from "react";
import "./TextBox.css";

export default function TextBox({ text, onClick }) {
  return (
    <button className="rounded-button" onClick={onClick}>
      {text}
    </button>
  );
}