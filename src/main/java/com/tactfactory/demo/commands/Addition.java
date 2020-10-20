package com.tactfactory.demo.commands;

/**
 * Addition command.
 */
public class Addition implements Command {

    /** Current value (to add a other) */
    private transient int value;

    /** Value to add at current */
    private transient int addValue;

    /**
     * Default Constructor.
     * @param a the current value.
     */
    public Addition(final int value) {
        this.value = value;
    }

    @Override
    public int redo(final int addValue) {
        this.addValue = addValue;

        this.value += this.addValue;
        return this.value;
    }

    @Override
    public int undo() {
        this.value -= this.addValue;
        return this.value;
    }

}
