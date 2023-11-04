import React from "react";

const ProgressBar = (props) => {
  const { bgcolor, completed } = props;
  const containerStyles = {
    width: '100%',
    backgroundColor: "#e0e0e0",
  };

  const fillerStyles = {
    width: `${completed}%`,
    backgroundColor: bgcolor || "#007bff",
    height: '30px',
    color: "#fff",
    textAlign: "center",
    lineHeight: "30px",
  };

  return (
    <div style={containerStyles}>
      <div style={fillerStyles}>
        <span>{`${completed}%`}</span>
      </div>
    </div>
  );
};

export default ProgressBar;
