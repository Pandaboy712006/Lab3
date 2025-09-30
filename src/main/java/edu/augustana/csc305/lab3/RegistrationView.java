package edu.augustana.csc305.lab3;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RegistrationView extends BorderPane {

    private final Button registerButton = new Button("Register");

    public RegistrationView() {
        setBottom(buildButtonBox());
    }

    private HBox buildButtonBox() {
        HBox buttonBox = new HBox(this.registerButton);
        buttonBox.setAlignment(Pos.CENTER);
        return buttonBox;
    }
}
