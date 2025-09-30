package edu.augustana.csc305.lab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class RegistrationView extends BorderPane {

    private final Button registerButton = new Button("Register");

    public RegistrationView() {
        setBottom(buildButtonBox());
        setCenter(formView());
        setPadding(new Insets(20));
    }

    private HBox buildButtonBox() {
        HBox buttonBox = new HBox(this.registerButton);
        buttonBox.setAlignment(Pos.CENTER);
        return buttonBox;
    }

    private RegistrationFormView formView() {
        return new RegistrationFormView();
    }

    public TextField getFirstNameField(){
        return RegistrationFormView.getFirstName();
    }

    public TextField getLastNameField(){
        return RegistrationFormView.getLastName();
    }

    public Button getButton(){
        return registerButton;
    }
}
