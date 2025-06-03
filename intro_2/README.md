# Java Programming Language - Overview and Concepts

## Introduction to Typed Languages

In programming, languages can be classified based on how they handle data types:

- **Statically Typed (Strongly Typed) Languages**:  
  These languages require you to declare the type of a variable explicitly, and the type is checked at compile time. For example:  
  ```java
  int a = karunakar; // This is an example of static typing where the type of 'a' is explicitly declared as int.
  ```  
  Java is a statically typed language.

- **Dynamically Typed (Loosely Typed) Languages**:  
  These languages do not require explicit type declarations. The type is determined at runtime. Examples include Python and JavaScript:  
  ```python
  a = True
  ```  
  Here, the variable `a` can hold any type of value, and its type can change during execution.

---

## Today's Agenda

1. What is Java?  
2. What are the components present in Java?  
3. Syntax for printing at least two statements  
4. Explanation of the syntax  

---

## What is Java?

Java is a:

1. **High-level programming language**: It is English-like and easy to understand.  
2. **Object-Oriented Programming Language (OOPS)**: It uses objects and classes to organize code.  
3. **Platform Independent**: Java follows the principle of WORA (Write Once, Run Anywhere), meaning compiled Java code can run on any platform with a Java Virtual Machine (JVM).  
4. **Supports Multithreading**: It can perform multiple tasks simultaneously.  
5. **Strongly Typed Language**: Java enforces strict type checking at compile time.

Java is widely used to build web applications, mobile applications, desktop applications, and more.

Java follows a **class-based** structure, meaning everything you write should be inside a class.

---

## Components of Java

Java consists of several components, each serving a specific purpose:

| Component  | Percentage Usage |
|------------|------------------|
| Class      | 90%              |
| Interface  | 7%               |
| Enum       | 2%               |
| Record     | 1%               |

---

## Explanation of Components

### Class

A **class** is a blueprint used to create objects. It consists of properties (attributes) and methods (functions).  
Example:  
- Object: Person  
- Properties: personName, age, gender  
- Methods: behaviors or actions the person can perform

### Interface

An **interface** is like a contract that defines what methods a class should implement, but not how they should be implemented.  
Example:  
- Sockets with 3 holes (like a contract specifying the shape and number of holes)  
- Person interface might specify properties like age (number), name (text), gender (text)

### Enum

An **enum** (enumeration) is a special data type that defines a set of fixed constants.  
Example:  
- Colors: RED, BLUE, GREEN  
- Traffic lights

### Record

A **record** is a data carrier that stores immutable data. It is a concise way to create data classes.

---

## Tokens

Tokens are the smallest elements in a program, such as keywords, identifiers, literals, and operators. They are generated line by line during compilation.

---

## Java Syntax Overview

Basic structure of a Java class:

```java
AccessModifier class ClassName {
    signature {
        System.out.print("Hi this is karunakar");
    }
}
```

Example files:

**Greet.java**

```java
private class Greet {
    signature {
        System.out.print(2 + 2);
    }
}
```

**Greet2.java**

```java
class Greet2 {
    signature {
        System.out.print(2 + 2);
        CreateObj createObj = new CreateObj();
    }
}
```

---

## Class Loading and Syntax Explanation

- Signature: `AccessModifier static void main(String[] args) {}`  
- `main()` is the entry point of a Java application.

---

## Object and Keywords Explanation

- **static**: Belongs to the class, not to instances (objects).  
- **void**: Return type indicating the method returns nothing.  
- **main()**: The entry point method where the program starts execution.  
- **String[] args**: Command-line arguments passed to the program.

---

## Access Modifiers

Access modifiers control the visibility of classes, methods, and variables:

1. **public**: Accessible from anywhere.  
2. **private**: Accessible only within the declared class.  
3. **default** (no modifier): Accessible within the same package.  
4. **protected**: Accessible within the same package and subclasses.

---

## Example: Printing Statements in Java

If you want to print statements in Java, you follow a specific structure or boilerplate:

```java
class Greet {
    public static void main(String[] args) {
        System.out.print("Hi this is karunakar");
    }
}
```

This structure ensures your program runs correctly and prints the desired output.


