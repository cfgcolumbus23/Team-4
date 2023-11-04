import * as React from "react";
import Checkbox from "./Checkbox";
import SelectAllApply from "/SelectAllApply,css"
//create a select all that apply box
const SelectAllApplyBox = () => {
  const [checkedOne, setCheckedOne] = React.useState(false);
  const [checkedTwo, setCheckedTwo] = React.useState(false);
  const [checkedThree, setCheckedThree] = React.useState(false);
  const [checkedFour, setCheckedFour] = React.useState(false);

  const handleChangeOne = () => {
    setCheckedOne(!checkedOne);
  };

  const handleChangeTwo = () => {
    setCheckedTwo(!checkedTwo);
  };

  const handleChangeThree = () => {
    setCheckedThree(!checkedThree);
  };

  const handleChangeFour = () => {
    setCheckedFour(!checkedFour);
  };

  return (
    <div class="select-all-apply-menu align-left">
      <h2>Choose all that apply:</h2>
      <Checkbox
        label="Single Parent"
        value={checkedOne}
        onChange={handleChangeOne}
      />
      <Checkbox label="Veteran" value={checkedTwo} onChange={handleChangeTwo} />
      <Checkbox
        label="Incarcaerated"
        value={checkedThree}
        onChange={handleChangeThree}
      />
      <Checkbox label="I/DD" value={checkedFour} onChange={handleChangeFour} />
    </div>
  );
};

export default SelectAllApplyBox;
