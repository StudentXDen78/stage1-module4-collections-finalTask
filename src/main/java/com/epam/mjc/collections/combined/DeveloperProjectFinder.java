package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public static List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();
        Comparator<String> projectComparator = new ProjectCompare();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) projectList.add(e.getKey());
        }
        projectList.sort(projectComparator.reversed());
        return projectList;
    }

    public static class ProjectCompare implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                return o1.charAt(0) - o2.charAt(0);
            }
            return o1.length() - o2.length();
        }
    }

    public static void main(String[] args) {
        Map<String, Set<String>> projects = new LinkedHashMap<>();
        projects.put("ASO", Set.of("Ivan", "Anna", "Lidia", "Antony"));
        projects.put("AVaS", Set.of("Mary", "Ivan", "Ben", "Max"));
        projects.put("SJAD", Set.of("Oleg", "Ivan", "Alex"));

        findDeveloperProject(projects, "Ivan");
    }
}
