import * as React from 'react';
import { useState } from 'react';


//create a select all that apply box
const Submit = () => {

    const [postField, setPostFields] = useState(false)
    const handleSubmit = () => {
        

    }


  return (
    <div class="select-all-apply-menu align-left">
      <button onClick={handleSubmit} type="Submit">Submit</button>
    </div>
  );
};

export default Submit;
