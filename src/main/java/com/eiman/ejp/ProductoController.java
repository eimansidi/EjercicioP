package com.eiman.ejp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProductoController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}