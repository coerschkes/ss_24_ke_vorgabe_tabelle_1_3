package com.github.coerschkes.vorgabe_tabelle_1_3;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Der Titel des ersten Fensters (primaryStage) wird gesetzt.
        primaryStage.setTitle("User system persons");
        // Die fxml-Datei, welche die GUI-Daten
        // zu dem Fenster enthaelt, wird geladen.
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("userSystemView.fxml"));
        // Eine grundlegende Scheibe (pane) fuer die GUI wird geladen.
        final BorderPane root = loader.load();
        // Setzen des Scenegraphen
        Scene scene = new Scene(root, 480, 240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

