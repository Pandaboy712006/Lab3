package edu.augustana.csc305.lab3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab3App extends Application {

    @Override public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new RegistrationController().getView(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Student Registration");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}