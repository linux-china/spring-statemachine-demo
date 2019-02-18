package org.mvnsearch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.statemachine.StateMachine;

/**
 * Unit test for state machine
 *
 * @author linux_china
 */
public class StateMachineTest {
    /**
     * Transition test
     */
    @Test
    public void testStateMachine() throws Exception {
        StateMachine<States, Events> stateMachine = StateMachineApp.buildMachine();
        stateMachine.start();
        stateMachine.sendEvent(Events.EVENT1);
        Assertions.assertEquals(stateMachine.getState().getId(), States.STATE2);
        stateMachine.sendEvent(Events.EVENT2);
        Assertions.assertEquals(stateMachine.getState().getId(), States.STATE1);
    }
}
