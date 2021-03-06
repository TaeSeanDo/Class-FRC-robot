package com.teamcautionrobotics.autonomous.commands;

import java.lang.reflect.Method;

import com.teamcautionrobotics.autonomous.Command;

public class CommandFactory {

    public Command delay(double time) {
        return new DelayCommand(time);
    }

    public Command listCommands() {
        return new Command() {
            @Override
            public boolean run() {
                for (Method method : CommandFactory.this.getClass().getMethods()) {
                    System.out.println(method.toString());
                }
                return true;
            }

            @Override
            public void reset() {}
        };
    }
}
