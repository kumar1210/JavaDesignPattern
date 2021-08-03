 Use Case : 
 Singleton Pattern, when we want to create single instance of an Object across the application
 
Property : 
1) Private constructor to restrict instantiation of the class from other classes.
2) Private static variable of the same class that is the only instance of the class.
3) Public static method that returns the instance of the class, this is the global access point for outer world 
   to get the instance of the singleton class.
   
   
Advantages :
1) For objects which needs only single instance across the application, like Logger, Database Object, Caching, Thread pools,
	 configuration settings, etc.
	 
	 
Note : There are different ways to implement the singleton, based on the usecase required.
  