package com.example.project_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HumanController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}