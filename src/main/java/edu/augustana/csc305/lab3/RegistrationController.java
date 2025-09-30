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

    public RegistrationController() {
        view.getFirstNameField().textProperty().subscribe(() -> updateFirstName());
        // And similar for last name.
        view.getLastNameField().textProperty().subscribe(() -> updateLastName());

        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.print(model.getFirstName().get());
                System.out.print(model.getLastName().get());
            }
        });
    }


}
