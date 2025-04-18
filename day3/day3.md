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
