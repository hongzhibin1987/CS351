package com.example.project_2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Human extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Human.class.getResource("Human.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 480);
        stage.setTitle("Human Benchmark!");
        stage.setScene(scene);
        stage.show();
    }
    

}