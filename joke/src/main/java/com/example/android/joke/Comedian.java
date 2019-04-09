package com.example.android.joke;

import java.util.Arrays;
import java.util.List;

public final class Comedian {
    private static final List<String> JOKES = Arrays.asList(
            "There are 30 coyotes and 28 cats. How many didn't?",
            "I just flew in from New York. Boy, are my arms tired!",
            "2 guys walked into a bar, the third one ducked.",
            "Why did the chicken cross the road?",
            "You have a peanut tree in a wind storm. The wind is blowing from east to west. " +
                    "Which way do the peanuts fall?"
    );

    private static int jokeIndex;

    private Comedian() {
    }

    public static String makeMeLaugh() {
        if (jokeIndex == JOKES.size()) {
            jokeIndex = 0;
        }

        return JOKES.get(jokeIndex++);
    }
}
