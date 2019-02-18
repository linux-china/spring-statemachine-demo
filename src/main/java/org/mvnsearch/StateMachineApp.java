package org.mvnsearch;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.util.EnumSet;

/**
 * state machine app
 *
 * @author linux_china
 */
public class StateMachineApp {

    public static StateMachine<States, Events> buildMachine() throws Exception {
        StateMachineBuilder.Builder<States, Events> builder = StateMachineBuilder.builder();

        builder.configureStates()
                .withStates()
                .initial(States.PowerON)
                .states(EnumSet.allOf(States.class));

        builder.configureTransitions()
                // transition1
                .withExternal()
                .source(States.PowerON).target(States.Started)
                .event(Events.TurnOn)
                .and()
                //transition1
                .withExternal()
                .source(States.Started).target(States.Halted)
                .event(Events.TurnOff);

        return builder.build();
    }
}
