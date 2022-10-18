package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int elem = sourceList.get(i);
            if (elem % 2 != 0) {
                result.addFirst(elem);
            } else {
                result.addLast(elem);
            }
        }
        return result;
    }
}
