package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        SortedSet<String> dp = new TreeSet<>(new ProjectComparator());

        for (Map.Entry<String, Set<String>> project:projects.entrySet()) {
            if(project.getValue().contains(developer)) {
                dp.add(project.getKey());
            }
        }
        return new LinkedList<>(dp);
    }

}

class ProjectComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() == o2.length()) {
            return -1*o1.compareTo(o2);
        }

        return -1 * (o1.length()-o2.length());
    }

}
