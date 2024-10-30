package org.example;

import org.example.Common.LogConverter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button;

        @FXML
    private TextArea textArea1;

    @FXML
    private TextArea textArea2;

    @FXML
    protected void handleButtonClick() {
        // label.setText("¡Botón clicado!");
        textArea2.setText(LogConverter.convertLog(textArea1.getText()));
    }
}