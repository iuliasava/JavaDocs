package exercise.exercise3;

import java.util.*;

/**
 * Created by Radu.Hoaghe on 04/20/2015.
 *
 * Exercise 3: Fill three Set implementations that you know (Hint: they were described during
 *             the earlier presentation) with the List<String> that is given to this class by
 *             its constructor.
 *
 *             Check out the elements that the list mentioned above contains and then, add them
 *             to your three Sets. After this check out the elements of your Sets. What do you
 *             remark? What could be the reason?
 *
 *             Finally, add to the one of the three Sets some elements
 *             that already exist in the Set (e.g add("that") and add("collection"))
 *
 *             To run your implementation, run the Exercise3Test class.
 */
public class Exercise3 {

    // List containing some elements that need to be added into the Set
    private List<String> listToAdd;

    public Exercise3(List<String> l) {
        listToAdd = l;
    }

    public void addElementsToSets(){

        TreeSet<String> tree = new TreeSet<String>();
        TreeSet<String> trees = new TreeSet<String>(new Comp());
        HashSet<String> hash = new HashSet<String>();
        LinkedHashSet<String> link = new LinkedHashSet<String>();


        System.out.println("The elements that will be added to the Sets: " + listToAdd);
        // TODO Exercise #3 a) Check the content of the elements you will add into the Set

        // TODO Exercise #3 b) add the elements from listToAdd to the Sets

        // TODO Exercise #3 c) Check the content of the Sets
        for(String s : listToAdd) {
            tree.add(s);
            trees.add(s);
        }

        System.out.println("\nThe elements contained in the first Set: " + tree);
        System.out.println("\nThe elements contained in the first Set: " + trees);

        for(String s : listToAdd)
            hash.add(s);

        System.out.println("\nThe elements contained in the second Set: " + hash);

        for(String s : listToAdd)
            link.add(s);

        System.out.println("\nThe elements contained in the third Set: " + link);

        tree.add("collection");
        tree.add("no");
        System.out.println("\nThe elements contained in the TreeSet after inserting two duplicates: " + link);

        // TODO Exercise #3 d) Add to the TreeSet two elements that already exist in the Set
        // TODO Exercise #3 d) and print again the TreeSet. What do you see?
    }
}

class Comp implements Comparator<String>{

    public int compare(String o1, String o2) {
        if(o1.length()<o2.length())
            return -1;
        if(o1.length()>o2.length())
            return 1;
        return 0;
    }
}
