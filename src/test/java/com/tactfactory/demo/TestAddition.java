package com.tactfactory.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tactfactory.demo.commands.Addition;

public class TestAddition {

    private Addition add;

    @Before
    public void setUp() throws Exception {
        this.add = new Addition(2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testApply() {
        int result = this.add.redo(3);

        Assert.assertEquals(5, result);
    }

    @Test
    public void testUndo() {
        int result = this.add.redo(3);

        result = this.add.undo();
        Assert.assertEquals(2, result);
    }

}
