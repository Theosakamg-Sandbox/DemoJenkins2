package com.tactfactory.demo.commands;

/**
 * Command interface.
 */
public interface Command {

    /**
     * Apply command.
     * @param b value to operate.
     * @return the new value after command.
     */
    int redo(final int addValue);

    /**
     * Roll-back the value.
     * @return the old value.
     */
    int undo();

}
