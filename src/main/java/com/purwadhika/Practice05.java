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

        int length = lengthNewArrayNumberType(numbers, numberType);

        if(length == 0) {
            throw new ArrayStoreException("length new array is 0");
        }

        int[] newArray = new int[length];
        int i = 0;
        if(numberType.equals("ODD")) {
            for(int num : numbers) {
                if(num % 2 == 0) {
                    newArray[i++] = num;
                }
            }
        } else {
            for(int num : numbers) {
                if(num % 2 != 0) {
                    newArray[i++] = num;
                }
            }
        }

        return newArray;
    }

    public int[] removeAllNumberType(int[] numbers) {
        return removeAllNumberType(numbers, "ODD");
    }

    private int lengthNewArrayNumberType(int[] numbers, String numberType) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        if(numbers.length == 0) {
            throw new IllegalArgumentException("numbers length is 0");
        }

        if(numberType == null || numberType.isEmpty()) {
            throw new IllegalArgumentException("numberType is null or numberType is empty string");
        }

        int length = 0;
        if(numberType.equals("ODD")) {
            for(int num : numbers) {
                if(num % 2 == 0) {
                    length++;
                }
            }
        } else {
            for(int num : numbers) {
                if(num % 2 != 0) {
                    length++;
                }
            }
        }

        return length;
    }

    public void printFizzBuzz(int n) {
        if(n == 0) {
            System.out.println();
            return;
        }

        if(n % 15 == 0) {
            System.out.print("FizzBuzz");
        } else if(n % 3 == 0) {
            System.out.print("Fizz");
        } else if(n % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(n);
        }

        if(n > 1) {
            System.out.print(", ");
        }

        printFizzBuzz(n - 1);
    }

    public int[] addUpToTotal(int[] numbers, int total) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        int length = lengthAddUp(numbers, total);

        if(length == 0) {
            throw new NullPointerException("No pair exist");
        }

        int[] newArray = new int[length];
        int i = 0;
        for(int num : numbers) {
            if(i < length) {
                newArray[i++] = num;
            }
        }

        return newArray;
    }

    public int lengthAddUp(int[] numbers, int total) {
        if(numbers == null) {
            throw new IllegalArgumentException("numbers is null");
        }

        int length = 0;
        long tempTotal = 0;
        for(int num : numbers) {
            tempTotal += num;
            length++;
            if(tempTotal >= total) {
                break;
            }
        }
        if(tempTotal < total) {
            throw new NullPointerException("No pair exist");
        }
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
        System.out.println("]");
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
        System.out.println("]");
    }

    public static void main(String[] args) {
        Practice05 practice05 = new Practice05();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        numbers = practice05.removeAllNumberType(numbers);
        practice05.printArray(numbers);
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        numbers = practice05.removeAllNumberType(numbers);
        practice05.printArray(numbers);
        practice05.printFizzBuzz(15);
        numbers = new int[]{2,7,11,15};
        int[] testNumbers1 = practice05.addUpToTotal(numbers, 9);
        practice05.printArray(testNumbers1);
        int[] testNumbers2 = practice05.addUpToTotal(numbers, 10);
        practice05.printArray(testNumbers2);
        testNumbers2 = practice05.addUpToTotal(numbers, 1);
        practice05.printArray(testNumbers2);
        try {
            testNumbers2 = practice05.addUpToTotal(numbers, 100);
            practice05.printArray(testNumbers2);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

    }
}
