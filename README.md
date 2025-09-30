# CSC 305 Lab 3

In this lab, we will explore implementing a model-view-controller 
architecture in JavaFX. Our goal is to build a simple form for 
registering students.

To get started, clone this repository and then open the project 
directory (or the pom.xml it contains) in IntellJ Idea. Once you have
opened the project in Idea, follow along with the rest of this README.

## A Tour of the Project

The project structure is similar to that of our last lab. The project 
directory contains the following:

* `README.md`: this README file.

* `pom.xml`: defines the project's properties and dependencies. The
  main configuration file used by Maven to build, run, and package
  the project.

* `mvnw` and `mvnw.cmd`: wrappers around Maven build commands. A
  standard part of Maven projects that we can ignore for now.

* `src`: the directory where the source code lives.
    * `src/main/java/module-info.java`: a JavaFX configuration file
      describing JavaFX-specific module dependencies and exports.
    * `src/main/java/edu/augustana/csc305/lab3`: the Java source
      files for this lab.

The source files consist of the following class definitions:

* `Lab3App`: the main entry point for running the application.

* `RegistrationController`: Manages a registration view and model.

* `RegistrationModel`: The model class for student registrations,
                       using JavaFX properties to store data. Currently
                       contains a first name and last name.            

* `RegistrationView`: Renders the registration screen as a `BorderPane`.  
                      Currently contains nothing but a "Register" button.

Run the application via the `Lab3App` class and ensure you see an empty
(except for the "Register" button") registration window.


## Rendering the Registration Form

Let's start by showing users a form with a first name and last name field.
For a form like this, JavaFX's `GridPane` is a good layout option. Take
a moment to look over the
[GridPane documentation](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html).

Create a new class in the `edu.augustana.csc305.lab3` package called
`RegistrationFormView` which extends `GridPane`. Give it two private
`TextField` data members, one for the first name and one for the last name.

In the constructor, add the text fields (and some labels) to the grid. We
want labels to be in the first column and the text fields to be in the
second column, with one entry per row.

```java
public RegistrationFormView() {
    add(new Label("First Name"), 0, 0);
    add(firstNameField, 1, 0);
    
    // And similar for last name (make sure to set the right row / column values).
}
```

Next, give the `RegistrationView` a private `RegistrationFormView` data member.
In the `RegistrationView`'s constructor, set this form view to be in the center
pane:

```java
setCenter(formView);
```

Run the application and take a look. You should see a text field for first and last
name. 

As we haven't added any padding or margins, the text boxes are too close together.
Take a few minutes to tweak the spacing to make the form's layout look better.


## Updating the Model

When the user types into the text boxes, we want to update the backing 
`RegistrationModel` to match. 

Add accessors (getters) for the first and last name text fields in both the 
`RegistrationFormView` and the `RegistrationView`. Then, add a method to 
`RegistrationController` which reads the latest value from those text fields
into the model:

```java
    private void updateFirstName() {
        model.getFirstName().set(view.getFirstNameField().getText());
    }
    
    // Add a similar method for updating the last name.
```

`TextFields` have a `TextProperty` we can listen to for changes. Add a constructor
to `RegistrationController` and register listeners on  the views to call your `update` 
methods whenever something changes:

```java
public RegistrationController() {
    view.getFirstNameField().textProperty().subscribe(()-> updateFirstName());
    // And similar for last name.
}
```

## Responding to Button Clicks

In a real application, clicking the "Register" button would likely send form
information to some other subsystem for processing. For now, let's just dump
it out to the console.

Add any accessors for the Register button you need, and in the `RegistrationController`
constructor, call `setOnAction` on the button to register a callback which prints
the model information to the console.


## Adding Fields

We can now expand the model and views to handle more user information. Add the following fields
to the registration form:

* Birthday. (While JavaFX has options for nicely selecting dates, you can just make 
            this a string for now.)

* Email address

* Phone number

* Address. You should have fields for street address (lines 1 and 2), city, state,
           and ZIP code. To make this look nice, you can arrange these fields using
           box layouts (`HBox` and / or `VBox`) or sub-`GridPane`s. This is optional
           for the lab, but good practice.

Ensure that clicking the "Register" button correctly prints all information to the console.

## Submission Instructions

When you are finished, upload all of your model, view, and controller classes to Moodle.
Place them in a single zip or tar file if you know how to do that, otherwise you may
upload the files individually.