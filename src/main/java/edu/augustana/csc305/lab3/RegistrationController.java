package edu.augustana.csc305.lab3;

public class RegistrationController {

    private final RegistrationModel model = new RegistrationModel();
    private final RegistrationView view = new RegistrationView();

    public RegistrationView getView() {
        return this.view;
    }
}
