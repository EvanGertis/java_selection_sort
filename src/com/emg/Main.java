package com.emg;


public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        printArray(intArray);

        for(int i = 0; i < intArray.length; i++){
            int largest = intArray[i];
            for(int j = 0; j < intArray.length -1; j++){
                if(intArray[j] > largest){
                    swap(intArray, i, j);
                }
            }
        }

        printArray(intArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}