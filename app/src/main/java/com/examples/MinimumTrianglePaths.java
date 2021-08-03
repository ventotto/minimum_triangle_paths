package com.examples;

import java.util.Arrays;
import java.util.List;

public class MinimumTrianglePaths {

    public static int getMinimumSumPatch(String[] inputs) {
        int[] result = extractValues(inputs[inputs.length - 1]);

        int deepOfTringle = inputs.length - 2;

        for (int row = deepOfTringle; row >= 0; row--) {
            int[] rowValues = extractValues(inputs[row]);

            for (int column = 0; column < rowValues.length; column++) {
                result[column] = rowValues[column] + (int) Math.min(result[column], result[column + 1]);
            }
        }

        return result[0];
    }

    private static int[] extractValues(String row) {
        return Arrays.stream(row.trim().split(" "))
                .map(e -> Integer.parseInt(e))
                .mapToInt(el -> el)
                .toArray();
    }
}
