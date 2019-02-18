Spring Statemachine
==================
Spring Statemachine is a framework for application developers to use state machine concepts with Spring applications.


### Vocabulary

* 现态(Current State)：是指当前所处的状态。
* 事件(Event)：事件会触发一个动作，或者执行一次状态的迁移。
* 动作(behaviour)：条件满足后执行的动作。动作执行完毕后，可以迁移到新的状态，也可以仍旧保持原状态。动作不是必需的，当条件满足后，也可以不执行任何动作，直接迁移到新状态。

![State Machine](http://projects.spring.io/spring-statemachine/img/statechart0.png)

### References

* Spring State Machine: http://projects.spring.io/spring-statemachine/
* 状态机： https://baike.baidu.com/item/%E7%8A%B6%E6%80%81%E6%9C%BA/6548513
* State Diagram: http://plantuml.com/en/state-diagram