/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static com.examples.MinimumTrianglePaths.getMinimumSumPatch;

public class App extends Utils {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        String[] input = createInput();
        String result = input.length == 0 ?
                "Input missing!" :
                String.format("\nMinimum Triangle Paths: %d", getMinimumSumPatch(input));

        println(result);
    }

    private static String[] createInput() throws IOException {
        StringJoiner joiner = new StringJoiner("\n");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while( !(line = input.readLine()).equalsIgnoreCase("EOF") ) {
            joiner.add(line);
        }
        return joiner.toString().split("\n");
    }
}