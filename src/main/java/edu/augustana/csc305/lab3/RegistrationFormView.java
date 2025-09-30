package edu.augustana.csc305.lab3;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RegistrationFormView extends GridPane {
    private static TextField firstNameField = new TextField();
    private static TextField lastNameField = new TextField();

    public RegistrationFormView() {
        add(new Label("First Name"), 0, 0);
        add(firstNameField, 1, 0);

        // And similar for last name (make sure to set the right row / column values).
        add(new Label("Last Name"), 0, 1);
        add(lastNameField, 1, 1);
    }

    public static TextField getFirstName(){
        return firstNameField;
    }

    public static TextField getLastName(){
        return lastNameField;
    }
}
