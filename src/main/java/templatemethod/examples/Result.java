package main.java.templatemethod.examples;

import java.util.List;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
public class Result<T> {

    private static final String COMMA = " , ";
    private static final  String  EMPTY = " ";

    List<T> result;

    public Result(List<T> result) {
        this.result = result;
    }

    public void printOutput() {
        StringBuilder builder = new StringBuilder();
        final String[] separator = {EMPTY};

        result.forEach(element -> {
            builder.append(separator[0]);
            builder.append(element);
            separator[0] = COMMA;
        });
        System.out.println(builder.toString());
    }
}
