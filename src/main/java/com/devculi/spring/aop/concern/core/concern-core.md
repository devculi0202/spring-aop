#### Concern Core?
1. What is concern core?
 * That stuff that you want to do in lots of places, which doesn't have an awful (awful = very bad) lot to do with the real meat (real meat: noi dung that su) of that piece of code.
 * Example:
    The standard "hello world" example for crosscutting is logging: You have an error in your production system and you have no clue what is going on. To solve it, you really need to see which functions in your code are called and what parameters they get and what they return.
    This is a simple task that can be fully automated: Locate all functions (or a subset using a filter of some kind) and add a logging call to them which prints the name and the parameters. Since the code contains all the information you need to complete this task,
 * AOP helps you decouple cross-cutting concerns from the objects that they affect.
 * Spring AOP module provides interceptors to intercept an application. For example, when a method is executed, you can add extra functionality before or after the method execution.