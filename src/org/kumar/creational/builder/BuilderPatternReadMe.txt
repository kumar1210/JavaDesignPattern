Use Case : 
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot 
of attributes.

Property : 
1) First of all we need to create a static nested class and then copy all the arguments from the outer class to the Builder class. 
2) Java Builder class should have a public constructor with all the required attributes as parameters.
3) Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting 
	the optional attribute.
4) The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this 
	we need to have a private constructor in the Class with Builder class as argument.
	
Advantages : 
1) It saves the immutability property of the Object by not introducing the setters method in the Object class itself.
2) Also solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step. 