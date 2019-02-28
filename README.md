Questions and Exercises: Interfaces

Questions

1. At the beginning of this lesson, you learned that the core collection interfaces are organized into two distinct inheritance trees. One interface in particular is not considered to be a true Collection, and therefore sits at the top of its own tree. What is the name of this interface?

    Map is not a true collection.

2. Each interface in the collections framework is declared with the <E> syntax, which tells you that it is generic. When you declare a Collection instance, what is the advantage of specifying the type of objects that it will contain?

    The main advantage of specifying type is that allows compiler to verify at compile-time that type of the object we put in the collection is the right one.
    
3. What interface represents a collection that does not allow duplicate elements?

    Set is collection that does not allow duplicate elements.
    
4. What interface forms the root of the collections hierarchy?

    Collection interface is the root of the collections hierarchy.
    
5. What interface represents an ordered collection that may contain duplicate elements?

    List can contain duplicates.

6. What interface represents a collection that holds elements prior to processing?

    Queue holds elements prior to processing.
        
7. What interface repesents a type that maps keys to values?

    Map interface represents a type that maps keys to value.
    
8. What interface represents a double-ended queue?

    Deque represents a double-ended queue.
    
9. Name three different ways to iterate over the elements of a List.

    Using aggreagete operations, with for-each construct and by using Iterators.

10. True or False: Aggregate operations are mutative operations that modify the underlying collection.

    False
