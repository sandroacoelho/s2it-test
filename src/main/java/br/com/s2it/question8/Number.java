package br.com.s2it.question8;

public class Number {

    public Integer c(int a, int b) {

        StringBuilder builder = new StringBuilder();

        char[] arrayA = Integer.valueOf(a).toString().toCharArray();
        char[] arrayB = Integer.valueOf(b).toString().toCharArray();

        int max = arrayA.length >= arrayB.length ? arrayA.length : arrayB.length;

        for (int i = 0; i < max; i++) {

            if (arrayA.length > i) {
                builder.append(arrayA[i]);
            }

            if (arrayB.length > i) {
                builder.append(arrayB[i]);
            }
        }

        Integer merge = Integer.valueOf(builder.toString());

        if (merge > 1000000) {
            return -1;
        }

        return merge;
    }

}
