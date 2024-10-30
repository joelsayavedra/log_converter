package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("./GUI/layout.fxml"));
        GridPane root = loader.load();



        // TextArea textArea1 = (TextArea) root.lookup("#textArea1");
        // textArea1.setText("prueba");
        // TextArea textArea2 = (TextArea) root.lookup("#textArea2");
        // textArea2.setVgrow(javafx.scene.layout.Region.ALWAYS);



        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Aplicación JavaFX con FXML");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}