package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int one = Integer.parseInt(a);
        int two = Integer.parseInt(b);
        Integer resultOne = 5 * (int)(Math.pow(one, 2)) + 3;
        Integer resultTwo = 5 * (int)(Math.pow(two, 2)) + 3;
        if (resultOne.equals(resultTwo)) {
            return Integer.compare(one, two);
        }
        return resultOne.compareTo(resultTwo);
    }
}
