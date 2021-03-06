package learninghashset;



import java.util.HashSet;

import java.util.LinkedList;



public class LearningHashSet {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        System.out.println("adding elements to hash set ...");

        hs.add(23);

        hs.add(252);

        hs.add(263);

        hs.add(833);

        System.out.println("printing the hashset");

        System.out.println(hs);

        System.out.println("the order in which the elements are not preserved.. ");

        System.out.println("hashset is therefore unordred collections");

        System.out.println("hashset discards the duplicate values or stores only unique values.. ");

        hs.add(252);

        hs.add(252);

        hs.add(252);

        System.out.println(hs);

        System.out.println("removing the element 252 from the set");

        hs.remove(252);

        System.out.println("printing the list after reomving 252 from the set");

        System.out.println(hs);

        

         LinkedList numbers = new LinkedList();

        

        numbers.add(34);

        numbers.add(34);

        numbers.add(784);

        numbers.add(784);

        numbers.add(784);

        numbers.add(342);

        numbers.add(34);

        System.out.println("printing the numbers list");

        System.out.println(numbers);

        System.out.println("creating hashset from other collection such as list");

        HashSet hs1 = new HashSet(numbers);

        System.out.println(hs1);

    }

}