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

        return newArray;
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

    public void printFizzBuzz(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("n must be integer positive value");
        }
        // TODO start
        // TODO end
    }

    public int[] addUpToTotal(int[] numbers, int total) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        // TOOO start
        int length = lengthAddUp(numbers, total);

        if(length == 0) {
            throw new NullPointerException("No pair exist");
        }

        int[] newArray = new int[length];
        // TODO end
        return newArray;
    }

    public int lengthAddUp(int[] numbers, int total) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        int length = 0;
        // TODO start
        // TODO end
        return length;
    }

    public void printArray(int[] numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        int length = numbers.length;
        System.out.print("[");
        for(int i = 0; i < length; i++) {
            System.out.print(numbers[i]);
            if(i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public void printArray(long[] numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        int length = numbers.length;
        System.out.print("[");
        for(int i = 0; i < length; i++) {
            System.out.print(numbers[i]);
            if(i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
