package com.cyadehn;

public class TitlecaseConverter {
    public static String convertToTitleCase(String input) {
        StringBuilder builder = new StringBuilder();

        int i = 0;
        for (String word : input.split("\\s")) {
            if (word.length() < 4 && !(i < 1) ) {
                builder.append(word.toLowerCase());
            } else {
                builder.append(word.substring(0,1).toUpperCase());
                builder.append(word.substring(1).toLowerCase());
            }
            builder.append(" ");
            i ++;
        }

        return builder.toString();
    }
}
