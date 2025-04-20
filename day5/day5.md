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