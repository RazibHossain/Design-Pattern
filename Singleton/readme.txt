How to make a class singleton
1. Need a static member/variable/instance which ensure memory allocation and single instance of a class
2. Making Constructor private
3. A public static method which return the object to another

Note:
Eager Initialization = Keu use koruk ba na koruk. memory allocation niye object create kore boshe thake
Lazy Initialization = Synchronized na thakle thread safe na + synchronized thakle multi-thread a slow perfor kore.

Best way to make singleton in multithreaded environment is

Bill Pugh Singleton Implementation - Through Java Inner Class.

benefits: private inner static class that contains the instance of the singleton class. When the singleton class is loaded,
 SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method

 (
  i.Classes are loaded only one time in memory by JDK.
  ii.Inner classes in java are loaded in memory by JDK when it comes into scope of usage. It means that if we are not performing any action with inner class in our codebase, JDK will not load that inner class into memory. It is loaded only when this is being used somewhere.
  )

 without using synchronized we can use singleton lazily and thread safe


✅When to Use Singleton?
    Shared Resources
        When you need to manage shared resources such as database connections, logging, configuration settings, or caching mechanisms.
        Example: A database connection pool where multiple instances would cause conflicts.

    Global Access Point
        When you need a centralized control over a resource.
        Example: A configuration manager that loads settings once and provides global access.

    Thread Safety
        When multiple threads need access to a single instance to avoid inconsistencies.
        Example: Logging framework that writes logs from multiple threads.

    Costly Object Creation
        When object creation is expensive in terms of resources (CPU, memory).
        Example: Factory classes that create complex objects but need to be initialized only once.
    Coordination Between Components
        When multiple components need to share state or communicate without passing around instances.
        Example: A singleton event bus that facilitates communication between different parts of an application.

❌ When Not to Use Singleton?
    When different instances are required (e.g., multi-tenant applications).
    When unit testing is needed since singletons can make mocking and testing harder.
    When using dependency injection frameworks like Spring, which can handle shared instances efficiently.

Cons:

Global State Can Make Code Hard to Test
Components depending on a singleton class become tightly coupled, making the system harder to modify and extend.
Can Lead to Performance Issues in Multi-threaded Environments
If not implemented properly, synchronization can lead to performance bottlenecks.
Violates SOLID Principles
Violates the Single Responsibility Principle (SRP) because it controls both instantiation and behavior.
Not Suitable for Large-Scale Applications
