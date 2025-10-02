package edu.augustana.csc305.lab3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class RegistrationController {

    private final RegistrationModel model = new RegistrationModel();
    private final RegistrationView view = new RegistrationView();

    public RegistrationView getView() {
        return this.view;
    }

    private void updateFirstName() {
        model.getFirstName().set(view.getFirstNameField().getText());
    }

    // Add a similar method for updating the last name.

    private void updateLastName() {
        model.getLastName().set(view.getLastNameField().getText());
    }

    private void updateBday() { model.getBday().set(view.getBdayField().getText()); }
    private void updateEmail() {model.getEmail().set(view.getEmailField().getText()); }
    private void updatePhoneNum() {
        model.getPhoneNum().set(view.getPhoneNumField().getText());
    }
    private void updateStAddress() {
        model.getStAddress().set(view.getStAddressField().getText());
    }
    private void updateCity() {
        model.getCity().set(view.getCityField().getText());
    }
    private void updateState() {
        model.getState().set(view.getStateField().getText());
    }
    private void updateZip() {
        model.getZip().set(view.getZipField().getText());
    }

    public RegistrationController() {
        view.getFirstNameField().textProperty().subscribe(() -> updateFirstName());
        // And similar for last name.
        view.getLastNameField().textProperty().subscribe(() -> updateLastName());

        view.getBdayField().textProperty().subscribe(() -> updateBday());
        view.getEmailField().textProperty().subscribe(() -> updateEmail());
        view.getPhoneNumField().textProperty().subscribe(() -> updatePhoneNum());
        view.getStAddressField().textProperty().subscribe(() -> updateStAddress());
        view.getCityField().textProperty().subscribe(() -> updateCity());
        view.getStateField().textProperty().subscribe(() -> updateState());
        view.getZipField().textProperty().subscribe(() -> updateZip());

        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.print(model.getFirstName().get());
                System.out.print(model.getLastName().get());
                System.out.print(model.getBday().get());
                System.out.print(model.getEmail().get());
                System.out.print(model.getPhoneNum().get());
                System.out.print(model.getStAddress().get());
                System.out.print(model.getCity().get());
                System.out.print(model.getState().get());
                System.out.print(model.getZip().get());
            }
        });
    }


}
