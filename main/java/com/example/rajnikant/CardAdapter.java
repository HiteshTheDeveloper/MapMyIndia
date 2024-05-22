package com.example.rajnikant;


import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter {

    private static List<String> result = new ArrayList<>();

    public static void setResult(List<String> shortestPath) {
        result.clear();
        result.addAll(shortestPath);
    }

    public static List<String> getResult() {
        return result;
    }
    private static MyStateData[] myStateData = new MyStateData[]{
            new MyStateData("Gujarat", "State Food: ખમણ-ઢોકળા, જલેબી, ઊંધિયું.. State Animal: એશિયન સિંહ", R.drawable.gj, R.drawable.m3, R.drawable.kl, R.drawable.m2, R.drawable.map, R.drawable.m2, R.drawable.m2, R.drawable.m3),
            new MyStateData("Haryana", "2022 film", R.drawable.gj, R.drawable.m3, R.drawable.kl, R.drawable.m2, R.drawable.map, R.drawable.m2, R.drawable.m2, R.drawable.m3),
            new MyStateData("Rajasthan", "2022 film", R.drawable.gj, R.drawable.m3, R.drawable.kl, R.drawable.m2, R.drawable.map, R.drawable.m2, R.drawable.m2, R.drawable.m3),
            new MyStateData("Bihar", "2022 film", R.drawable.gj, R.drawable.m3, R.drawable.kl, R.drawable.m2, R.drawable.map, R.drawable.m2, R.drawable.m2, R.drawable.m3),
            // Add data for other states as needed
    };

    public static void sendCardToActivity3(String stateName, Context context) {
        for (MyStateData data : myStateData) {
            if (data.getStateName().equals(stateName)) {
                // Create an Intent to launch Activity3
                Intent intent = new Intent(context, MainActivity3.class);
                // Pass the relevant data to Activity3
                intent.putExtra("stateName", data.getStateName());
                intent.putExtra("stateDescription", data.getStateinfo());
                intent.putExtra("stateImage", data.getStateImage());
                // Start Activity3
                context.startActivity(intent);
                return; // Exit the loop after finding the matching state
            }
        }
    }
}

