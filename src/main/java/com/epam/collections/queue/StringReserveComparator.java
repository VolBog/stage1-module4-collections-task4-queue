package com.epam.collections.queue;

import java.util.Comparator;

public class StringReserveComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}
