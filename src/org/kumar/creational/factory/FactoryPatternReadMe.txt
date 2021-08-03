Use Case : 
The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.

Property : 
 1) A base "Java class"/Interface/"Abstract class" which gets extended/implemented by multiple classes.
 2) A factory class which based on property passed, return the new instantiated object.
 3) A factory class can be of singleton type or a simple class with the static method.
 
 Advantages : 
1) Factory pattern removes the instantiation of actual implementation classes from client code. 
2) Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation 
	because client program is unaware of this.
3) Factory pattern provides abstraction between implementation and client classes through inheritance. 