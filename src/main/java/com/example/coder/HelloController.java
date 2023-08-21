package com.example.coder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea txtMessage;

    @FXML
    private TextField txtDictFileName;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void encode(ActionEvent actionEvent)
    {
        String encoded = Coder.encode(txtMessage.getText(), txtDictFileName.getText());
        txtMessage.setText(encoded);
    }
    @FXML
    public void decode(ActionEvent actionEvent)
    {
        String decoded = Coder.decode(txtMessage.getText(), txtDictFileName.getText());
        txtMessage.setText(decoded);
    }
}