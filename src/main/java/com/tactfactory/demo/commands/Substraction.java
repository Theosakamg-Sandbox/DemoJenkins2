package com.tactfactory.demo.commands;

/**
 * Subtraction command.
 */
public class Substraction implements Command {

    @Override
    public int redo(final int addValue) {
        throw new NoClassDefFoundError();
    }

    @Override
    public int undo() {
        throw new NoClassDefFoundError();
    }
}
