package com.epam.collections.queue;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> results = new PriorityQueue<>(new StringReserveComparator());
        results.comparator();
        results.addAll(firstList);
        results.addAll(secondList);
        return results;
    }
}
