package com.company;

public class SelectionSort {
    void sort (Person arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j].compareTo(arr[min_index]) < 0 )
                    min_index = j;

            Person temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
   void printArray(Person arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
   }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        Person arr[] = Person.getPersons();
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
        System.out.println();
    }
}
