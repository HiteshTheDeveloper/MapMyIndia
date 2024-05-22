package com.example.rajnikant;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import java.util.List;

public class InBetweenStates extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the source and destination from the Intent
        Intent intent = getIntent();
        String source = intent.getStringExtra("source");
        String destination = intent.getStringExtra("destination");

        // Create a list of all states and union territories in India.
        List<String> statesAndUnionTerritories = new ArrayList<>();
        statesAndUnionTerritories.add("Andhra Pradesh");
        statesAndUnionTerritories.add("Arunachal Pradesh");
        statesAndUnionTerritories.add("Assam");
        statesAndUnionTerritories.add("Bihar");
        statesAndUnionTerritories.add("Chhattisgarh");
        statesAndUnionTerritories.add("Goa");
        statesAndUnionTerritories.add("Gujarat");
        statesAndUnionTerritories.add("Haryana");
        statesAndUnionTerritories.add("Himachal Pradesh");
        statesAndUnionTerritories.add("Jharkhand");
        statesAndUnionTerritories.add("Karnataka");
        statesAndUnionTerritories.add("Kerala");
        statesAndUnionTerritories.add("Madhya Pradesh");
        statesAndUnionTerritories.add("Maharashtra");
        statesAndUnionTerritories.add("Manipur");
        statesAndUnionTerritories.add("Meghalaya");
        statesAndUnionTerritories.add("Mizoram");
        statesAndUnionTerritories.add("Nagaland");
        statesAndUnionTerritories.add("Odisha");
        statesAndUnionTerritories.add("Punjab");
        statesAndUnionTerritories.add("Rajasthan");
        statesAndUnionTerritories.add("Sikkim");
        statesAndUnionTerritories.add("Tamil Nadu");
        statesAndUnionTerritories.add("Telangana");
        statesAndUnionTerritories.add("Tripura");
        statesAndUnionTerritories.add("Uttar Pradesh");
        statesAndUnionTerritories.add("Uttarakhand");
        statesAndUnionTerritories.add("West Bengal");
        statesAndUnionTerritories.add("Andaman and Nicobar Islands");
        statesAndUnionTerritories.add("Chandigarh");
        statesAndUnionTerritories.add("Dadra and Nagar Haveli");
        statesAndUnionTerritories.add("Daman and Diu");
        statesAndUnionTerritories.add("Delhi");
        statesAndUnionTerritories.add("Jammu and Kashmir");
        statesAndUnionTerritories.add("Ladakh");
        statesAndUnionTerritories.add("Lakshadweep");
        statesAndUnionTerritories.add("Puducherry");

        // Create a map to represent the connections between states and union territories.
        Map<String, List<String>> connections = new HashMap<>();
        connections.put("Andhra Pradesh", Arrays.asList("Telangana", "Karnataka", "Tamil Nadu", "Odisha"));
        connections.put("Arunachal Pradesh", Arrays.asList("Assam"));
        connections.put("Assam", Arrays.asList("Arunachal Pradesh", "Meghalaya", "Tripura", "Nagaland", "Manipur", "West Bengal"));
        connections.put("Bihar", Arrays.asList("Jharkhand", "West Bengal", "Uttar Pradesh"));
        connections.put("Chhattisgarh", Arrays.asList("Madhya Pradesh", "Maharashtra", "Odisha", "Jharkhand", "Uttar Pradesh"));
        connections.put("Goa", Arrays.asList("Maharashtra", "Karnataka"));
        connections.put("Gujarat", Arrays.asList("Dadra and Nagar Haveli", "Daman and Diu", "Rajasthan", "Madhya Pradesh", "Maharashtra"));
        connections.put("Haryana", Arrays.asList("Punjab", "Delhi", "Himachal Pradesh", "Rajasthan", "Uttar Pradesh"));
        connections.put("Himachal Pradesh", Arrays.asList("Jammu and Kashmir", "Punjab", "Haryana", "Uttarakhand"));
        connections.put("Jammu and Kashmir", Arrays.asList("Himachal Pradesh", "Punjab"));
        connections.put("Jharkhand", Arrays.asList("Bihar", "Chhattisgarh", "West Bengal", "Odisha"));
        connections.put("Karnataka", Arrays.asList("Maharashtra", "Goa", "Kerala", "Tamil Nadu", "Andhra Pradesh", "Telangana"));
        connections.put("Kerala", Arrays.asList("Tamil Nadu", "Karnataka"));
        connections.put("Madhya Pradesh", Arrays.asList("Rajasthan", "Gujarat", "Maharashtra", "Chhattisgarh", "Uttar Pradesh"));
        connections.put("Maharashtra", Arrays.asList("Dadra and Nagar Haveli", "Gujarat", "Madhya Pradesh", "Chhattisgarh", "Telangana", "Karnataka", "Goa"));
        connections.put("Manipur", Arrays.asList("Nagaland", "Mizoram", "Assam"));
        connections.put("Meghalaya", Arrays.asList("Assam"));
        connections.put("Mizoram", Arrays.asList("Arunachal Pradesh", "Manipur", "Tripura"));
        connections.put("Nagaland", Arrays.asList("Arunachal Pradesh", "Manipur", "Assam"));
        connections.put("Odisha", Arrays.asList("Jharkhand", "Chhattisgarh", "Andhra Pradesh", "West Bengal"));
        connections.put("Punjab", Arrays.asList("Haryana", "Himachal Pradesh", "Rajasthan"));
        connections.put("Rajasthan", Arrays.asList("Punjab", "Haryana", "Uttar Pradesh", "Madhya Pradesh", "Gujarat", "Haryana"));
        connections.put("Sikkim", Arrays.asList("West Bengal"));
        connections.put("Tamil Nadu", Arrays.asList("Kerala", "Karnataka", "Andhra Pradesh"));
        connections.put("Telangana", Arrays.asList("Andhra Pradesh", "Karnataka", "Maharashtra", "Chhattisgarh"));
        connections.put("Tripura", Arrays.asList("Mizoram", "Assam"));
        connections.put("Uttar Pradesh", Arrays.asList("Bihar", "Madhya Pradesh", "Rajasthan", "Haryana", "Uttarakhand"));
        connections.put("Uttarakhand", Arrays.asList("Himachal Pradesh", "Haryana", "Uttar Pradesh"));
        connections.put("West Bengal", Arrays.asList("Sikkim", "Bihar", "Odisha", "Jharkhand", "Assam"));
        connections.put("Andaman and Nicobar Islands", Arrays.asList(""));
        connections.put("Chandigarh", Arrays.asList("Punjab", "Haryana"));
        connections.put("Dadra and Nagar Haveli", Arrays.asList("Gujarat", "Maharashtra"));
        connections.put("Daman and Diu", Arrays.asList("Gujarat"));
        connections.put("Delhi", Arrays.asList("Haryana", "Uttar Pradesh"));
        connections.put("Ladakh", Arrays.asList("Jammu and Kashmir"));
        connections.put("Lakshadweep", Arrays.asList(""));
        connections.put("Puducherry", Arrays.asList("Tamil Nadu"));

        // Use a shortest path algorithm to find the path between source and destination.
        List<String> shortestPath = findShortestPath(connections, source, destination);

        // Determine the destination state
        String destinationState = shortestPath.get(shortestPath.size() - 1);

        // Send the destination state to Activity3 using CardAdapter
        CardAdapter.sendCardToActivity3(destinationState, this); // 'this' is the current context


        // Pass the result to the CardAdapter class
        CardAdapter.setResult(shortestPath);
    }

    // Implementation of a shortest path algorithm (Breadth-First Search) to find the path between two states or union territories.
    public static List<String> findShortestPath(Map<String, List<String>> connections, String source, String destination) {
        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(Collections.singletonList(source));

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String currentState = path.get(path.size() - 1); // Corrected index

            if (currentState.equals(destination)) {
                return path; // Path found
            }

            for (String neighbor : connections.get(currentState)) {
                if (!visited.contains(neighbor)) {
                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                    visited.add(neighbor);
                }
            }
        }

        return Collections.emptyList(); // No path found
    }
}
