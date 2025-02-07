package com.purwadhika;

public class Practice05 {

    public int[] removeAllNumberType(int[] numbers, String numberType) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        if(numbers.length == 0) {
            throw new IllegalArgumentException("numbers length is 0");
        }

        if(numberType == null || numberType.isEmpty()) {
            throw new IllegalArgumentException("numberType is null or numberType is empty string");
        }

        // TODO start
        // check new array length based on number type
        int length = lengthNewArrayNumberType(numbers, numberType);

        if(length == 0) {
            throw new ArrayStoreException("length new array is 0");
        }

        int[] newArray = new int[length];
        // TODO end
    }

    public int[] removeAllNumberType(int[] numbers) {
        return removeAllNumberType(numbers, "ODD");
    }

    private int lengthNewArrayNumberType(int[] numbers, String numberType) {
        int length = 0;
        // TODO start
        // TODO end
        return length;
    }
}
