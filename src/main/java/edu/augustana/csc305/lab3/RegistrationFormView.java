package edu.augustana.csc305.lab3;

import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RegistrationFormView extends GridPane {

    private static TextField firstNameField = new TextField();
    private static TextField lastNameField = new TextField();


    private static TextField bdayField = new TextField();
    private static TextField emailField = new TextField();
    private static TextField phoneNumField = new TextField();
    private static TextField stAddressField = new TextField();
    private static TextField cityField = new TextField();
    private static TextField stateField = new TextField();
    private static TextField zipField = new TextField();

    public RegistrationFormView() {
        add(new Label("First Name"), 0, 0);
        add(firstNameField, 1, 0);

        add(new Label("Last Name"), 0, 1);
        add(lastNameField, 1, 1);

        add(new Label("Birthday"), 0, 2);
        add(bdayField, 1, 2);

        add(new Label("Email"), 0, 3);
        add(emailField, 1, 3);

        add(new Label("Phone number"), 0, 4);
        add(phoneNumField, 1, 4);

        add(new Label("Street Address"), 0, 5);
        add(stAddressField, 1, 5);

        add(new Label("City"), 0, 6);
        add(cityField, 1, 6);

        add(new Label("State"), 0, 7);
        add(stateField, 1, 7);

        add(new Label("Zip code"), 0, 8);
        add(zipField, 1, 8);

        //This isn't padding, but I looked it up and this works while I couldn't figure out how to get padding working. I'll ask later but this works for now.
        setVgap(5);
    }

    public static TextField getFirstName(){
        return firstNameField;
    }

    public static TextField getLastName(){
        return lastNameField;
    }


    public static TextField getBday() {
        return bdayField;
    }
    public static TextField getEmail() {
        return emailField;
    }
    public static TextField getPhoneNum() {
        return phoneNumField;
    }
    public static TextField getStAddress() {
        return stAddressField;
    }
    public static TextField getCity() {
        return cityField;
    }
    public static TextField getState() {
        return stateField;
    }
    public static TextField getZip() {
        return zipField;
    }
}
