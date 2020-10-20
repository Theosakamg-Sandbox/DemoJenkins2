package com.tactfactory.demo;

import com.tactfactory.demo.commands.Addition;

/**
 * Main Application class.
 */
public class Application {
//
//    /**
//     * Default Constructor.
//     */
//    public Application() { /* Empty constructor */ }

    /**
     * Entry-point of application.
     */
    public static void main() {
        final Application app = new Application();
        app.run();
    }

    /**
     * Running application.
     */
    private void run() {
        System.out.println("Hello Java !");

        final Addition add = new Addition(2);
        final int result = add.redo(3);

        System.out.println(String.valueOf(result));
    }

}
