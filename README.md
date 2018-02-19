[![CircleCI](https://circleci.com/gh/venkaDaria/java-patterns.svg?style=svg)](https://circleci.com/gh/venkaDaria/java-patterns)

### Links
- GoF - Design Patterns: Elements of Reusable Object-Oriented Software
- [Java core libraries](https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries)
- [Cheat sheets](https://habrahabr.ru/post/210288/)

### Patterns
- **Creational patterns**
    - *Abstract factory* (recognizeable by creational methods returning the factory itself which in turn can be used to create another abstract/interface type)
    - *Builder* (recognizeable by creational methods returning the instance itself)
    - *Factory method* (recognizeable by creational methods returning an implementation of an abstract/interface type)
    - *Prototype* (recognizeable by creational methods returning a different instance of itself with the same properties)
    - *Singleton* (recognizeable by creational methods returning the same instance (usually of itself) everytime)

- **Structural patterns**
    - *Adapter* (recognizeable by creational methods taking an instance of different abstract/interface type and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
    - *Bridge* (recognizeable by creational methods taking an instance of different abstract/interface type and returning an implementation of own abstract/interface type which delegates/uses the given instance)
    - *Composite* (recognizeable by behavioral methods taking an instance of same abstract/interface type into a tree structure)
    - *Decorator* (recognizeable by creational methods taking an instance of same abstract/interface type which adds additional behaviour)
    - *Facade* (recognizeable by behavioral methods which internally uses instances of different independent abstract/interface types)
    - *Flyweight* (recognizeable by creational methods returning a cached instance, a bit the "multiton" idea)
    - *Proxy* (recognizeable by creational methods which returns an implementation of given abstract/interface type which in turn delegates/uses a different implementation of given abstract/interface type)

- **Behavioral patterns**
    - *Chain of responsibility* (recognizeable by behavioral methods which (indirectly) invokes the same method in another implementation of same abstract/interface type in a queue)
    - *Command* (recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type which has been encapsulated by the command implementation during its creation)
    - *Interpreter* (recognizeable by behavioral methods returning a structurally different instance/type of the given instance/type; note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is)
    - *Iterator* (recognizeable by behavioral methods sequentially returning instances of a different type from a queue)
    - *Mediator* (recognizeable by behavioral methods taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance)
    - *Memento* (recognizeable by behavioral methods which internally changes the state of the whole instance)
    - *Observer* (or Publish/Subscribe) (recognizeable by behavioral methods which invokes a method on an instance of another abstract/interface type, depending on own state)
    - *State* (recognizeable by behavioral methods which changes its behaviour depending on the instance's state which can be controlled externally)
    - *Strategy* (recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a different abstract/interface type which has been passed-in as method argument into the strategy implementation)
    - *Template method* (recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type)
    - *Visitor* (recognizeable by two different abstract/interface types which has methods definied which takes each the other abstract/interface type; the one actually calls the method of the other and the other executes the desired strategy on it)
