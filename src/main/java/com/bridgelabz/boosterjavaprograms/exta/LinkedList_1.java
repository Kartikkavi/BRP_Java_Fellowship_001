package com.bridgelabz.boosterjavaprograms.exta;

import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        //create linked list
       LinkedList<String> animals = new java.util.LinkedList<>();

        animals.add("Dog");
        animals.add("cat");
        animals.add("mouse");
        animals.add("camel");
        animals.add("Dog");
        animals.add("Lion");
        System.out.println(animals);
        animals.addLast("Hourse");
        System.out.println(animals);
        animals.add(0,"pig");
        System.out.println(animals);

        animals.removeLast();
        System.out.println(animals);
        animals.clone();
        System.out.println(animals);

        System.out.println( animals.peek());
        System.out.println(animals.contains(8));
        System.out.println(animals.peekLast());
        System.out.println(animals.removeFirstOccurrence(2));
         //System.out.println("Updated linked list=======" + animals);

//        //Access Linkedlist element
//
//        System.out.println("Element at positio 1======" + animals.get(1));
//
//        //Updating an element at last
//
//        animals.addLast("Elefent");
//        System.out.println("Updated linked list after add element at last=======" + animals);
//
//        //updating an element at first
//          animals.addFirst("Snake");
//        System.out.println("Updated linked list after add element at first element=======" + animals);
//




//        //Change the elements of a linkedlist (Update an new element at position 2)
//        animals.set(2, "Tiger");
//        System.out.println("Update linklisted======" + animals);
//
//        //Remove the Element
//        System.out.println("Remove Elements===" + animals.remove(1));
//        System.out.println("Updated linkedlist after remove element at position 1=========" + animals);
//        System.out.println(animals.size());
//

    }
}
