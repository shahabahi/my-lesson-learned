package com.api.assignment;

public class UserInput {
    public static class TextInput {
        String s="" ;
        public void add(char c) {
            s+=c;
        }

        public String getValue() {
            return s;
        }
    }

    public static class NumericInput extends TextInput {
        private int curVal = 0;

        @Override
        public void add(char c) {
                if (Character.isDigit(c)) {
                    super.add(c);
                }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
