package org.mvnsearch;

import org.junit.jupiter.api.Test;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import reactor.core.publisher.Mono;

/**
 * Reactive State Machine test
 *
 * @author linux_china
 */
public class ReactiveStateMachineTest {

    @Test
    public void testSateMachine() throws Exception {
        StateMachine<States, Events> stateMachine = StateMachineApp.buildMachine();
        Message<Events> event = MessageBuilder.withPayload(Events.TurnOn).build();
        stateMachine.sendEvent(Mono.just(event))
                .doOnComplete(() -> {
                    System.out.println("Event handling complete");
                })
                .subscribe();
        Thread.sleep(1000);

    }
}
