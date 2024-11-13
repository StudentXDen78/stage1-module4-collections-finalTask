package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) projectList.add(e.getKey());
        }
        Collections.sort(projectList);
        Collections.reverse(projectList);
        return projectList;
    }
}
