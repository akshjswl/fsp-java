## What is the diffrence between the method overloading and method overriding?
method overloading:
1. in method overloading all the methods belongs to the same class
2. All the method differs in theire argument class.
3. using method overloading java supports compile time polymorphism(early binding).

method overriding:
1. in method overriding if one method belongs to its parents class than the other method belongs to its child class
2. The method of its parent and child class doesnot differ in their argument list.
3. using method overriding java supports run time polymorphism.(late binding)


## what is the use of THIS keyword?
If an instance have the same name as that of a local variable than the local variabloe tends tohide the instance variable.
In order to resolve this name space collison we require the help of THIS keyword this is because the this keyword always reffers to the instance variable of the class.


wap to display the use of THIS keyword


## garbage collection in java
when no refrence to an object exist than that object is considered in no longer in use. Such kind of unrefrenced objects are called garbage in java
JVM keeps tracks of such kind of unrefrence object and remove them from memory automatically when required. This mechanism of automatic removal of unrefrenced object by JVM is called garbage collection

note: the time for garbage collection cannot be predicted in advance

An object can have more than one refrences  but a single refrence variable cannot point to two object at the same time



![alt text](<WhatsApp Image 2025-04-18 at 10.58.48_a78bf531.jpg>)







wap to display creation of garbage in java.


## what do you mean by abstract class in java?
1. An abstract class is a class which has abstract keyword applied to it.
2. It may contain normal method as well as abstract method. 
3. An abstract method is a method which doesnot have any body.
4. we cannot create an object of an abstract class. it always acts as a super class.
5. the class which inherits an abstract class has to provide body to all the abstract method of an abstract class
6. It is used to create a blue print of a code

wap to display use of abstract class.



Disadvantage: 
1. An abstract class doesnot create a pure blue print of a code because in an abstract class we can keep method definition also.

## what do you mean by dynamic method dispatch?
A parent class refrence variable can refer to any of the child class object but the vice versa is not.
dynamic method dispatch is a mechanism by which calls to overidded methods are resolved at run time using dynamic method  dispatch java supports the concept of run time polymorphism.

## Interface in java
An interface is special kind of class which may contain variables as wellas methods where the variables are by default static and final.
The method in an interface are by deault public and abstract like an abstract class we cannot create an object of an interface.
Interface syntax:
        interface interfacename{
            static and final varible declaration
            public and abstract methods 
        }
        syntax for a class implementing an interface
        class classname implements interfacename1, interfacename2,......
        {
            body of the class
        }

wap to display use of interface


upto v7 which contains only one abstract method is called single abstract method interface. but from v8 this same concept renamed as functional interface.


## Types of interface:
An interface can be classified into mainly three types 
1. normal interface
2. single abstract method interface/ functional interface
3. marker interface

1. normal interface
An interface that consist of more than one abstract method is called a normal interface

2. functional interface:
the interface which contain ony one abstract method is called a functional interface
3. marker interface- an interface which doesnot contain any abstract method is called a marker interface

### Packages

A package is used to store classes,interfaces as well as other packages. In java package is nothing but a folder
In java we use package for two reason:
1. to perform code reusablity.
2. to provide data security.


![alt text](<WhatsApp Image 2025-04-18 at 14.53.09_d5acc30a.jpg>)



in order to get all the six classes in my application i need to import these 3 commands:
import abc.*;
import abc.xyz*;
import abc.xyz.mno.*;

types of package access in java:
In java there are 5 ways to access a package:
1. same package same class
2. same package sub class
3. same package non-sub class
4. diffrent package sub class
5. diffrent package non-sub class





Same package same class:

![alt text](<WhatsApp Image 2025-04-18 at 15.08.37_5eb64f2a.jpg>)

In case of same package same class all the four variables are accesible irrespective of their access specifier




same package sub class



![alt text](<WhatsApp Image 2025-04-18 at 15.46.05_66a1d413.jpg>)



same package non sub class


in diffrent package sub class private variable and default variable are not accesible 