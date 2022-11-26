# Design Patterns 2

## Decorator Design Pattern

Allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class. We use inheritance to extend the behavior of the class. This takes place at compile-time, and all the instances of that class get the extended behavior.

Implementing the Task UI so that we can add colors or other features when task is urgent or important

## Flyweight Design Pattern

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.

We implemented this on the account creation so it checks if the account already exists before creating one.

## Template Method Design Pattern

In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.

We implemented the Reward system so that all the rewards can be used the same.

## How to run

### **Requirements**

- Java OpenJDK 17+ (or similar)
- Gradle 7.5.1+

### **Manipulation**

Copy this repository (or unzip the zipped file):

```bash
git clone https://github.com/hectellian/design-patterns-2
```

Then for a build with tests run:

```bash
gradle clean build
```

To see output run:

```bash
gradle run
```