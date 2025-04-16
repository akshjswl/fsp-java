### part-1


Object Oriented Programming:- A program that deals with the concept of object.


An object maybe defined as representation of real world entity with unique identity embedded properties and the ability to interact with other objects


For a programming language to be object oriented it should follow  the following for features -
1. Encapsulation
2. Data abstraction and data handling
3. Polymorphism
4. Inheritance


1. Encapsulation- It is the mechanism, by which the variables which contains the data and the functions which access those data or variables(methods) are group together as a single unit.
In an object oriented programming the class is used to support the concept of encapsulation.


2. Data abstraction- Data abstraction means hiding the working complexity of data. Encapsulation is the mechanism and its outcome is Data abstraction


3. Polymorphism- The term poly means many and the term morph means false. It is a mechanism by which same interface can be used in order to achieve multiple task. In an object oriented programming Polymorphism is achieved using concept like method overloading,  Constructor overloading, method overriding etc.

4. Inheritance- Inheritance is the mechanism by which one class acquires the features of another class. Through Inheritance an object oriented programming supports the concept of code reusability.


If a programming language doesn't support any one of these four features than that programming language is not at all an object oriented programming language.
 
## Types of object oriented programming-
1. Partial object oriented
2. Fully object oriented
3. Complete object oriented

Partial object oriented- In case of Partial object oriented all the four features of oops are supported but any one or three features are partially supported.
 e.g.-C++ because encapsulation is partially supported

Fully object oriented- In case of Fully object oriented all the four features of oops are supported fully. E.g.-Java

Complete object oriented- A programming language is called a complete object oriented if it is a fully object oriented programming language and  it does not have any support for primitive data types. E.g.- Small Talk.








### Introduction to Java


## Java language is developed by James gosling and Patrick Naughton at sun microsystem. It was initially termed as oak language but was renamed java later.

Features of Java-
Platform independent
Fully object oriented
Case Sensitive
compilated and interpreted
Strongly typed 
Very much secure
Support multitasking
Do not support Pointers and Multiple inheritance



## Why Java is called a platform independent programming language?
When we compile a java program it creates a highly optimisable code which is called a byte code. This byte code can run on any computer with different hardware or software architecture.
This is the reason why  Java is called a platform independent programming language.

## Why Java is called a compilated as well as interpreted language?
In Java both compiler and interpreter are require in order to compile  and run a java program. The java Compiler accepts the source code as input and translate it into the corresponding byte code. The java interpreter accepts byte code as input and translate it onto the corresponding executable code .As compiler and interpreter both required hence java is called a compilated and interpreted language 

## Why java is called Strongly typed language?
For a language to be Strongly typed it must follows two rules-
1.Every variable should be declared before they can be used in a program 
2.We cant assign a mismatched data typed to one another.
As java follows this two rule strictly hence it is called a Strongly typed language.

## Why java language is very much secured?
All java programs runs in a close environment which is called java runtime environment(JRE). No other program which is outside the environment can access the program running inside it.
This is why all java program is very much secured.

In java the concept of multitasking is supported using the mechanism called thread.



## Why in java it does not support the concept of pointer?
In Java the memory management is done automatically by JVM as a result of this pointer concept for memory management is not required.




##
JDK- It stands for java development kit. JDK is a software which contains the compiler and interpreter which are require compile run and debug a java program.


JVM- JVM stands for java virtual machine it is the interpreter for byte. JVM accepts byte code as input and converts it into corresponding machine level code. JVM is platform dependent in it. 



## Structure of a java program:
A java program consists of following section-
1. Comment Section
2. Package Section
3.Import Section
4.Interface Section
5.Class Definition section
6.main method class definition


Comment Section: The comment section is responsible for providing comments in java. 
In java there are three types of commits:
1. single line comment- //
2.Multiline comment- /*   */
3.Documentation comment- /* *...................
			   *................... */

2. Package Section- declares package in java. in java package are used to represent java library

3. Import Section- it is responsible for importing packages into the current java programming. 

4. Interface Section- defining interfaces in java.

5. Class Definition section- this section is responsible for defining class in java. Using class java supports the concept of encapsulation

In java the class which contains the main method should be define in this section as it denotes the starting point 


### part-2


## Class

A class in java is used in order to group variable and input using class java supports the comncept of encapsulation.

## Object 
In java an object is called an instance of a class 


## steps for creating an object of a class


creating an objecto f a class is a two steps process:
1. create a refrence variable of the class
2. create an object of a class using the mnew keywords and assign it to the refrence variable of the class


## constructor in java

A constructor is a special method which has the same name is that of the class within which it resides.
A constructor doesnt have any return type not even void. A constructor is called  automatically when we create an objectr of the class.
A constructor is used to initialise an object of the class



## In java a constructor is classified into two parts:
1. Default constructor
2. paramaterized constructor

Default constructor: A constructor which doesnot take any argument is called  Default constructor.


Paramaterized constructor: The constructor which acceptrs arguments is callled a  paramaterized constructor

## why a non Paramaterized constructor is called a default constructor?
When we as a coder doesnot provide any constructor in our program it is the compiler automatically provides a non Paramaterized constructor by default. That is why a non Paramaterized constructor is often reffered top as a default constructor. The purpose of this default constructot is to provide the deafult values to the instance variables of the class based on the data types. If the data types is int than 0 is assigned if the data type is float or double than 0.0 is assigned.


## Why the main method in java declared as public static and void?
The main method is declared as public so that it is accessable by any outside code. Here the outside code is JVM. 

The main method is declared as static so that jvm doesnot have to create an object of the class within which main resides


The main method is declared as void becuse it doesnot return any value to jvm.

note: In java the postion static and public can be interchanged 



## Command Line Argument
In java it is possible to pass values to a program through command line. This can be achieved using the concept of command line argument. When values are passed using command lines they are accepted in the form of array of string.

