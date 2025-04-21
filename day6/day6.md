## Event handling in  java
What is an event?
An event maybe defined as an occurence of something. 

In java there are some listeners which are represented using a concept called interfaces and which contains some abstract methods based on the nautre of the event appropriate listeners are called and the methods inside them which we have defined are executed.

<!-- wap to display use of mouse event. -->
<!-- wap to display use of keyboard event. -->


the repaint method is used to manually called the paint method 

## Java collection framework
1. The Collection in Java is a framework that provides an architecture to store and manipulate group of objects.
2. Java Collections can achieve all the operations that we perform on a data such as searching, sorting, insertion, manipulation, and deletion.
3. Java Collection means a single unit of objects.
4. The java.util package contains all the classes and interfaces for the Collection framework.


![alt text](<WhatsApp Image 2025-04-21 at 12.21.33_91344193.jpg>)


the collection inerface is the backbone of entire collection framework this interface is extended by three interfaces;
1. list
2. queue
3. set


list: 
1. List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

2. List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

ArrayList:
The ArrayList class implements the List interface. 
It uses a dynamic array to store the duplicate elements of different data types.
The ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList class can be randomly accessed.


The size method is used to determine the number of objects present in the collection.
add method is used to insert object in an array list
remove method is used to remove object in an array list
the hasNext method of the iterator checks whether any element is present in the array list or not if elements are present in the array list than has next method returns 



linkedList:
linkedList class implements the collection interface.
it is not synchronise.
LinkedList implementation is faster in compare of arraylist.

<!-- wap to display use of linked list. -->


vector:
Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronised.

<!-- wap to display use of vector -->


Stack:
The stack is the subclass of Vector. It implements the last in first out data structure , i.e. Stack. The stack contain all of the method of vector class and provides its methods like boolean push(), pop() which defines its properties.



## Queue Interface

Queue interface maintains the first-in-first-out order.
It can be defined as an ordered list that is used to hold the elements which are about to be processed.
There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.


## priority queue
Priority queue class implements the queue interface . it holds the element or object which are to be processed by their priorities.
Priority Queue doesn't allow null values to be stored in the queue.
It is only ordered/sorted in the sence that the first element is the least.

program to display use of priority queue