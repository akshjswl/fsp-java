## use of sleep method
The sleep method is used to momentiarily pause the execution of thread.
The Sleep methods accept values in terms of milisecond.
the sleep method has a tendency to generate an exception. and that exception is called Interupted exception.

<!-- wap to display use of sleep method -->

 <!-- wap to accept two numbers from user and display their sumafter 10 sec -->


 ## various states of a thread 
 A thread consists of folllowing 5 states:
 1. New
 2. Active
 3. Running
 4. Blocked
 5. Terminated


New:- This is the state where the thread is first created. e.g.- thread ob = newThread()
Active:- This is the step where the thread is ready to run. e.g.- calling the start method
Running-  It is the state where the thread is actually executing. e.g.- execution of the run method
Blocked- in this state the execution of thread is blocked momentarily. e.g. use of sleep.
terminated- It is the state where the thread has completed its execution. 

### Synchronization Of Thread

When multiple threads works with a common code than the output can be ambigous in nature. To prevent this to hapeening we need to synchronize the common code. Once we Synchronize the common code until one thread has completed its operation with it no other threads are allowed to use the common code

<!-- wap to display Synchronization of thread -->





## strings in java
String: A string class is defined as collection of character which is terminated by null character.

String is devided into two parts:
1. String
2. StringBuffer

1. String-  A String class is an immutable class (i.e. any changes made through the values of a particular string object creates a separate string object. The values of the original string object is not altered).

The String class contains some inbuilt method using which we can manipulate a given string. 
1. Length() method- The Length method is used to determine the total no. of character is present in a given string.
 <!-- wap to display the use of length method -->
2. concat() method- the concat method is used to display the two strings together.
<!-- wap to display the use of concat method -->
3. charAt () method- this method is used to extract a particular character from the string based on the index position
 <!-- wap to display the use of charAt method -->
4. compareTo () method - this method is used to compare two strings and return an integer value. If both the strings are equal than its return zero otherwise a +ve or -ve number.
5. endsWith () method - the endsWith is used to check whether on string ends with another string or not. It displays an boolean value.
6. startsWith () method - the startsWith is used to check whether one string starts with another string or not.  
7. equals ()- The equals method used to compare two string and return a boolean value.

8. replace () method:  the replace method is used to replace a particular character in a stri ng with another character.



9. substring
A substring method is used toextract a particular string from a given string based on the index position.

10. toLowerCase -  this method is used to convert a upper string to the corresponding lower string.
11. toUpperCase -  this method is used to convert a lower string to the corresponding upper string.
12. trim - this is used to remove any leading and trailing spaces in a string.


2. StringBuffer:
A string buffer class is a mutable class. That means any changes made to a particular string object doesnot create a seperates object but the original string buffer object is affected. 
The string buffer class also contains a certain method using which we can maipulate a string
1. Append: this method is used to concatinate two strings together.
2. insert: this method is used to insert a particular string in a given string at a particular index position.
3. replace: this method is used to replace sequence of a character in a string based on a index position.
4. delete: this is used to delete a sequence of character from a string based on a index pos.
5. reverse: this is used to reverse the content of a particular string.

<!-- wap to accept a string from a user and check whether the string is palindrome or not -->



## Applet

It is a type of java program using which java implements graphics. The main diffrence between a normal program and that of an applet is that a normal program contains a main method but an applet program  doesnot contain any main method.
An applet program is created by extending a class called Applet.
hierarchy:
java.lang.object
    |
    +...java.awt.Component
        |
        +.... java.awt.Panel
            |
            +....java.applet.Applet
                |
                +....javax.swing.JApplet



## wap to create a blank applet
1. create a Trivial.Applet.java
import java.awt.*;
import java.applet.Applet;
public class TrivialApplet extends Applet{}
2. create an html file 
<html>
	<applet code="TrivialApplet.class"
	height ="300" width="400">
	</applet>
</html>
