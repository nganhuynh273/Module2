package com.company;
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>() ;
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList.indexOf(3));
        System.out.println(myList.add(6, 4));
        System.out.println(myList.size());
        System.out.println(myList.contains(7));
        System.out.println(myList.get(5));
        System.out.println(myList.remove(1));
        System.out.println(myList);

        MyList<Integer> list = myList.clone();
        System.out.println(list);



    }
}