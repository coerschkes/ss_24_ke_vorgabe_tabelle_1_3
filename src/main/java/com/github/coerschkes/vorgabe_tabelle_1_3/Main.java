package com.github.coerschkes.vorgabe_tabelle_1_3;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("User system persons");
        final FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("userSystemView.fxml"));
        final BorderPane root = loader.load();
        Scene scene = new Scene(root, 480, 240);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

