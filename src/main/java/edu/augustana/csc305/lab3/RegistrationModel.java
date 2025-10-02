package edu.augustana.csc305.lab3;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RegistrationModel {

    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty lastName = new SimpleStringProperty();

    private final StringProperty bday = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();
    private final StringProperty phoneNum = new SimpleStringProperty();
    private final StringProperty stAddress = new SimpleStringProperty();
    private final StringProperty city = new SimpleStringProperty();
    private final StringProperty state = new SimpleStringProperty();
    private final StringProperty zip = new SimpleStringProperty();

    public StringProperty getFirstName() {
        return firstName;
    }

    public StringProperty getLastName() {
        return lastName;
    }


    public StringProperty getBday() {
        return bday;
    }
    public StringProperty getEmail() {
        return email;
    }
    public StringProperty getPhoneNum() {
        return phoneNum;
    }
    public StringProperty getStAddress() {
        return stAddress;
    }
    public StringProperty getCity() {
        return city;
    }
    public StringProperty getState() {
        return state;
    }
    public StringProperty getZip() {
        return zip;
    }

}
