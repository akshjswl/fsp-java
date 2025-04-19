## which access specifier to be used when?
If a variable has private access than that variable is only accesible is only accesible by the method which belongs to the same class if the variable had protected access than it is accesible by the method if any one of the two conditions are true:
1. The class which contains the variable and the class which contains the method both belongsto the same package.
2. If there is a parent child relationship between the class which contains the variables and the class which contains the method
If avariable has public acces than that variable can be accesible from anywhere in the program
if it doensot specify any access specifier before any variable declaration then that variable is said tp have a default access or a package access.

A default access variable is accessable by the methods if the class which contains the variables and the class which contains the method both belong to the same package.



### Exception handling

symantic error:-it is the error which occurs due to unncessarily waste of resource
syntatic error = compilation error


In java a run time error is called an exception when an exception occurs in java it is the jvm which by default handles the exception.
The jvm stops the executuion of the program at that line which generate the exception. To stop this from happening we as a coder need to handle the exception on our own and that is why it is termed as exception handling.

In java an exception can be handeled by using 5 keywords:
1. try
2. catch
3. throw
4. throws
5. finally


use of try and catch 
A try is an block which contains those statements which may or may not generate an exception.
A try block is always followed by atleast one catch block. When an exception occurs in the try block than the program control comes out of the try block and goes to the matching catch block. It is inside the catch block where we have to write the exception handling code.

wap to display use of try and catch


![alt text](<WhatsApp Image 2025-04-19 at 11.05.45_f100351a.jpg>)

 note: A  single try block can have multiple catch block. Bases on the nature of the exception appropriate catch block are called 

 <!-- program to display multiple catch against a single try block -->


 In case of multiple catch against a single try block the parent catch block should not be placed above the child catch block because that will result in the syntactical error



## nested try catch block
in java it is possible to have an enter a try and catch block inside another try and catch block this mechanism is called as nesting of try and catch block



![alt text](<WhatsApp Image 2025-04-19 at 11.35.34_613f0f08.jpg>)

the  try block is handled both by inner catch  and outer catch block but the outer catch block is hold by catch blocks


## Use of throw keyword

A throw keyword is used if we want to manually generate an exception 


syntax:
throw new any_exception_class_name();


<!-- wap to display use of throw keyword -->