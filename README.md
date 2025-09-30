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
                       using JavaFX properties to store data.

* `RegistrationView`: Renders the registration screen as a `BorderPane`.  
                      Currently contains nothing but a "Register" button.

Run the application via the `Lab3App` class and ensure you see an empty
(except for the "Register" button") registration window.