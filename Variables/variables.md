# Variables in Programming

## What are Variables?

Variables are named storage locations in a program that hold data which can be changed during program execution. They act as containers for values.

### Example:
```java
int age = 25;
String name = "Alice";
```

Here, `age` and `name` are variables storing an integer and a string respectively.

## Types of Variables

1. **Local Variables**  
   Declared inside a method or block and accessible only within that scope.  
   Example:
   ```java
   void method() {
       int count = 10; // local variable
   }
   ```

2. **Instance Variables**  
   Declared inside a class but outside any method, and belong to an instance of the class. Each object has its own copy.  
   Example:
   ```java
   public class Person {
       String name; // instance variable
   }
   ```

3. **Class (Static) Variables**  
   Declared with the `static` keyword inside a class, shared among all instances of the class.  
   Example:
   ```java
   public class Person {
       static int population; // class variable
   }
   ```

## Defining and Initializing Variables

Variables are defined by specifying the data type followed by the variable name. They can be initialized at the time of declaration or later.

### Syntax:
```java
dataType variableName;          // Declaration
variableName = value;           // Initialization

// Or combined:
dataType variableName = value;  // Declaration + Initialization
```

### Example:
```java
int number;          // Declaration
number = 100;        // Initialization

String message = "Hello";  // Declaration + Initialization
```

## Accessing Data in Variables

You can access the value stored in a variable by using its name.

### Example:
```java
int x = 5;
System.out.println(x);  // Outputs: 5
```

For instance variables, you access them through an object:
```java
Person p = new Person();
p.name = "John";
System.out.println(p.name);  // Outputs: John
```

For static variables, access them using the class name:
```java
Person.population = 1000;
System.out.println(Person.population);  // Outputs: 1000
```

## Naming Conventions for Variables

- Variable names should start with a letter, underscore (_), or dollar sign ($).
- Subsequent characters can be letters, digits, underscores, or dollar signs.
- Use camelCase for variable names (e.g., `myVariable`).
- Variable names should be meaningful and descriptive.
- Avoid using Java reserved keywords as variable names.

### Examples of valid variable names:
```java
int age;
String firstName;
double _price;
boolean $isAvailable;
```

### Examples of invalid variable names:
```java
int 2ndNumber;    // starts with a digit
String class;     // reserved keyword
```
