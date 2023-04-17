package com.github.siberianintegrationsystems;

import java.util.Arrays;

public class Unit1 {

    private static final String INPUT_STRING = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
            + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";


    public static void main(String[] args) {
        String result = revertString();
        checkResult(result);
    }

    /**
     * При реализации метода нельзя использовать метод reverse() из класса StringBuilder
     *
     * @return
     */
    private static String revertString() {
        // Сама себе нашла проблем и изобретала велосипед.
        int j = 0;
        String[] input = new String[INPUT_STRING.length()];
        for (int i = INPUT_STRING.length()-1; i >= 0; i--) {
            if (INPUT_STRING.charAt(i) != 0){
                input[j] = String.valueOf(INPUT_STRING.charAt(i));
                j++;
            } else {
                input[j] = " ";
            }
        }
        String output = String.join("", input);
        System.out.println(output);
        return output;
        /* Изначально боле верный вариант, но загугленный
        char rev[] = INPUT_STRING.toCharArray();
        String reverse = "";
        for (int i = rev.length - 1; i >= 0; i--) {
            reverse += rev[i];
        }
        System.out.println(reverse);
        return reverse;
    }*/
    }

    private static void checkResult(String result) {
        if (INPUT_STRING.equals(new StringBuilder(result).reverse().toString())) {
            System.out.println("Строка изменена корректно");
        } else {
            throw new RuntimeException("Ошибка, строка изменена неверно");
        }
    }

}
