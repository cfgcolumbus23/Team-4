import * as React from 'react';


//this is a checkbox object for selectoptionbox.js
const App = ({label}) => {
  const [checked, setChecked] = React.useState(false);

  const handleChange = () => {
    setChecked(!checked);
  };

  return (
    <div>
      <Checkbox
        label={label}
        value={checked}
        onChange={handleChange}
      />

      <p class="no-newline"> : {checked.toString()}</p>
    </div>
  );
};

//individual checkbox 
const Checkbox = ({ label, value, onChange }) => {
  return (
    <label>
      <input type="checkbox" checked={value} onChange={onChange} />
      {label}
    </label>
  );
};

export default App;