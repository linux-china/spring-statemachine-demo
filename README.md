Spring Statemachine
==================
Spring Statemachine is a framework for application developers to use state machine concepts with Spring applications.


### Vocabulary

* State(状态): 一个标准的状态机最少包含两个状态：初始和终态。初态是状态机初始化后所处的状态，而终态顾名思义就是状态机结束时所处的状态。其他的状态都是一些流转中停留的状态。标准的状态机还会涉及到一些中间态，存在中间态的状态机流程就会比较复杂（用处也不是特别大，而且可以通过其他方式实现），所以在目标实现的状态机里不会引入这个概念。
* Event(事件): 还有中描述叫Trigger，表达的意思都一样，就是要执行某个操作的触发器或口令：当状态机处于某个状态时，只有外界告诉状态机要干什么事情的时候，状态机才会去执行具体的行为，来完成外界想要它完成的操作。比如出去吃饭，说“点菜”，服务员才会拿着小本过来记录你要吃的菜，说的那句“点菜”，就相当于Event。
* Action(行为): 状态变更索要执行的具体行为。还是拿上面点菜的例子，服务员拿小本记录你定的菜的过程就是Action
* Transition(转换，变更): 一个状态接收一个事件执行了某些行为到达了另外一个状态的过程就是一个Transition。定义Transition就是在定义状态机的运转流程。

![State Machine](http://projects.spring.io/spring-statemachine/img/statechart0.png)

### References

* Spring Statemachine Goes Reactive with 3.0.0.M1: https://spring.io/blog/2019/08/08/spring-statemachine-goes-reactive-with-3-0-0-m1
* Spring State Machine: http://projects.spring.io/spring-statemachine/
* 状态机： https://baike.baidu.com/item/%E7%8A%B6%E6%80%81%E6%9C%BA/6548513
* 有限状态机实现-状态机介绍: https://www.jianshu.com/p/d48e0d565618
* 有限状态机通常在什么地方被用到？https://www.zhihu.com/question/31634405
* State Diagram: http://plantuml.com/en/state-diagram
* A Guide to the Spring State Machine Project: https://www.baeldung.com/spring-state-machine
