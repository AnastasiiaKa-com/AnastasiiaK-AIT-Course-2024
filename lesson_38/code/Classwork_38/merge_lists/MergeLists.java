package Classwork_38.merge_lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>(List.of(3,5,1,9,3));
        ArrayList<Integer> List2 = new ArrayList<>(List.of(8,2,5,3));

        //Merging Lists
        ArrayList<Integer> mergeList = new ArrayList<>(List1); // odd list1 to mergeList
        mergeList.addAll(List2);//add list2 to mergeList

        //Remove duplication
        Set<Integer> uniqueNumbers = new HashSet<>(mergeList);

        System.out.println(uniqueNumbers);

        //Put Set into List
        mergeList = new ArrayList<>(uniqueNumbers);
        mergeList.sort(Integer::compareTo);
        //print result
        System.out.println(mergeList);
    }
}
