package com.example.victoriawest.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    String[] Colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#f470ee",
            "#ffc977",
            "#80d6d6",
            "#77a9dd",
            "#534cb5",
            "#e98ef9",
            "#89b593",
            "#77afa2"
    };

    int getColor() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(Colors.length);
        int color = Color.parseColor(Colors[randomNumber]);
        return color;
    }
}