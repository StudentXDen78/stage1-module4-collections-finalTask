package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public static Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> e : timetable.entrySet()) {
            lessons.addAll(e.getValue());
        }

        return lessons;
    }

    public static void main(String[] args) {
        Map<String, List<String>> timetable = new LinkedHashMap<>();
        timetable.put("Modnay", List.of("English"));
        timetable.put("Tuesday", List.of("Mathematics"));
        timetable.put("Wednesday", List.of("English", "Chemistry"));
        timetable.put("Thursday", List.of("Literature", "Mathematics"));
        getLessons(timetable);
    }
}
