# Java Class Documentation

This is a simple Java program consisting of two classes: `Mesimdhenesi` and `Fakulteti`. The program demonstrates how to create instances of the `Mesimdhenesi` class and set their properties in the `Fakulteti` class's `main` method.

## Table of Contents

1. [Project Structure](#project-structure)
2. [How to Compile](#how-to-compile)
3. [How to Run](#how-to-run)
4. [Code Explanation](#code-explanation)

## Project Structure

The project is organized into two separate Java files:

- `Mesimdhenesi.java`: Contains the `Mesimdhenesi` class definition.
- `Fakulteti.java`: Contains the `Fakulteti` class definition and the `main` method.

## How to Compile

To compile the Java classes, navigate to the directory where the files are located and use the `javac` command.

```bash
javac Mesimdhenesi.java Fakulteti.java
```

This command will generate the corresponding `.class` files for each of the Java files.

## How to Run

After compiling the Java classes, you can run the program using the `java` command. Execute the `Fakulteti` class, which contains the `main` method.

```bash
java Fakulteti
```

This command will execute the `Fakulteti` class and produce the program's output.

## Code Explanation

- `Mesimdhenesi` class: This class defines a simple model for a teacher or professor with attributes such as name (`emri`), birth year (`vitiLindjes`), and job position (`angazhimi`). It provides constructors to initialize the object and methods to set and retrieve the attributes.

- `Fakulteti` class: This class contains the `main` method, where instances of the `Mesimdhenesi` class are created and manipulated. It demonstrates how to create objects of the `Mesimdhenesi` class, set their properties, and display their information.

The program's flow can be summarized as follows:

1. Create instances of the `Mesimdhenesi` class.
2. Set the attributes for each instance.
3. Display the information for each `Mesimdhenesi` instance.

---

This is a basic README documentation that provides an overview of the project, its structure, and instructions for compiling and running the program. You can expand on this documentation as needed, including additional sections for more advanced topics, usage instructions, and dependencies if applicable.