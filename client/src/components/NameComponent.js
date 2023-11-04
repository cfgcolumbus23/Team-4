import React, { Component } from "react";
// import DialogTitle from "@material-ui/core/DialogTitle";
// import DialogContent from "@material-ui/core/DialogContent";
// import DialogContentText from "@material-ui/core/DialogContentText";
// import TextField from "@material-ui/core/TextField";
// import DialogActions from "@material-ui/core/DialogActions";
// import Button from "@material-ui/core/Button";
// import Dialog from "@material-ui/core/Dialog";

import { DialogTitle } from "@mui/material";
import { DialogContent } from "@mui/material";
import { DialogContentText } from "@mui/material";
import { TextField } from "@mui/material";
import { DialogActions } from "@mui/material";
import { Button } from "@mui/material";
import { Dialog } from "@mui/material";

class NameComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      open: true,
      name: null,
    };
  }

  handleClickOpen = () => {
    try {
      this.setState({ open: true });
    } catch (error) {
      //nothing, just to stop buttom from being clicked when not loaded
    }
  };

  handleClose = () => {
    try {
      this.setState({ open: false });
    } catch (error) {
      //nothing, just to stop buttom from being clicked when not loaded
    }
  };

  save = () => {
    try {
      this.setState({ open: false });
      this.props.setName(this.state.name);
    } catch (error) {
      //nothing, just to stop buttom from being clicked when not loaded
    }
  };

  setEnteredName = (event) => {
    try {
      this.setState({ name: event.target.value });
    } catch (error) {
      //nothing, just to stop buttom from being clicked when not loaded
    }
  };

  render() {
    return (
      <div>
        <Dialog open={this.state.open} aria-labelledby="form-dialog-title">
          <DialogTitle id="form-dialog-title">Chat</DialogTitle>
          <DialogContent>
            <DialogContentText>Please enter your name</DialogContentText>
            <TextField
              autoFocus
              margin="dense"
              id="name"
              label="Name"
              type="name"
              onChange={this.setEnteredName}
              fullWidth
            />
          </DialogContent>
          <DialogActions>
            <Button onClick={this.save} color="primary">
              Save
            </Button>
            <Button onClick={this.handleClose} color="primary">
              Cancel
            </Button>
          </DialogActions>
        </Dialog>
      </div>
    );
  }
}

export default NameComponent;
