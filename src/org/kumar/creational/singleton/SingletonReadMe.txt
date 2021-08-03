 --> To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

1) Private constructor to restrict instantiation of the class from other classes.
2) Private static variable of the same class that is the only instance of the class.
3) Public static method that returns the instance of the class, this is the global access point for outer world 
   to get the instance of the singleton class.
   
   
--> Usage of Singleton design pattern :
  -- Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, 
  	 configuration settings etc.
  