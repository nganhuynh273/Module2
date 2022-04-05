package com.company;


import java.time.LocalTime;
public class Main {

    public static void main(String[] args) {
        StopWatch n = new StopWatch();
        System.out.println(n.getStartTime());
        /////
        double[] arr = initArray();
        ////
        System.out.println(n.getEndTime());
        System.out.println(n.getElapsedTime());

    }

    public static double[] initArray() {
        double[] array = new double[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = Math.round((Math.random() * 100000));
        }
        return array;
    }

    public static double[] sortArray(double[] array) {
        double temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    }
