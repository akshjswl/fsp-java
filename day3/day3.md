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