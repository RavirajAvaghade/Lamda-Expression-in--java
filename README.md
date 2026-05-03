📌 Lambda Expressions in Java

This repository contains simple and practical examples of Lambda Expressions in Java, introduced in Java 8. These examples help in understanding how to write clean, concise, and modern Java code using functional programming concepts.

🚀 What is a Lambda Expression?

A Lambda Expression is a short block of code that takes input parameters and returns a result. It is mainly used to implement functional interfaces (interfaces with a single abstract method).

👉 Syntax:
(parameters) -> expression
👉 Example:
// Without Lambda
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Hello World");
    }
};

// With Lambda
Runnable r2 = () -> System.out.println("Hello World");
💡 Features Covered
✔️ Basic Lambda Syntax
✔️ Functional Interfaces
✔️ Lambda with Collections
✔️ Sorting using Lambda
✔️ Using forEach() method
✔️ Method References (Basic)
📂 Example Use Cases
🔹 1. Sorting a List
List<String> list = Arrays.asList("Banana", "Apple", "Mango");

Collections.sort(list, (a, b) -> a.compareTo(b));
System.out.println(list);
🔹 2. Using forEach()
list.forEach(item -> System.out.println(item));
🔹 3. Runnable Interface
Thread t = new Thread(() -> {
    System.out.println("Thread is running...");
});
t.start();
🔧 Technologies Used
☕ Java (JDK 8 or above)
💻 IDE: Eclipse / IntelliJ / VS Code
🎯 Advantages of Lambda Expressions
✨ Reduces code length
✨ Improves readability
✨ Enables functional programming
✨ Eliminates boilerplate code
✨ Works well with Streams API
📖 Learning Outcome

After going through this repository, you will be able to:

Understand Lambda Expressions
Write concise Java code
Use functional interfaces effectively
Apply Lambda in real-world scenarios
📌 Conclusion

Lambda Expressions are a powerful feature in modern Java that simplify coding and improve efficiency. These examples are designed for beginners to quickly understand and start using Lambdas in their projects.
