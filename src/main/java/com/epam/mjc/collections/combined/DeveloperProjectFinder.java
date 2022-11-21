package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for(Map.Entry<String, Set<String>> project : projects.entrySet()){
            if(project.getValue().contains(developer)) result.add(project.getKey());
        }
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        });
        Collections.reverse(result);
        return result;
    }
}
