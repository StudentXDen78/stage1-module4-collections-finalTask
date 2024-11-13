package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public static List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) projectList.add(e.getKey());
        }
        Collections.sort(projectList);
        // Collections.reverse(projectList);
        return projectList;
    }

    public static void main(String[] args) {
        Map<String, Set<String>> projects = new LinkedHashMap<>();
        projects.put("CSO", Set.of("Ivan", "Anna", "Lidia", "Antony"));
        projects.put("VVaS", Set.of("Mary", "Ben", "Max"));
        projects.put("LJA", Set.of("Oleg", "Ivan", "Alex"));

        findDeveloperProject(projects, "Ivan");
    }
}
