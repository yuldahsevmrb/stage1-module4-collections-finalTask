package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> lessons = new HashSet<>();

        for (List<String> lessonsOfTheDay:timetable.values()) {
            for (int i = 0; i < lessonsOfTheDay.size(); i++) {
                lessons.add(lessonsOfTheDay.get(i));
            }
        }
        return lessons;
    }
}
