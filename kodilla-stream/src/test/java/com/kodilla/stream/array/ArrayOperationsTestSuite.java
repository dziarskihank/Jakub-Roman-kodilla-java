package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {5, 5, 5, 5, 5, 5, 5, 5, 10, 0, 5, 5, 5, 5, 5, 5};
        double averageExpected = 5.0;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}