package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crea un botón
        Button btn = new Button("Haz clic aquí");
        btn.setOnAction(event -> System.out.println("¡Hola desde JavaFX!"));

        // Coloca el botón en un StackPane
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Configura la escena y el escenario (Stage)
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Aplicación JavaFX Básica");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}