package main.java.templatemethod.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
public class Connection {

    public Result execute(String s) {
        return mockExecution(s);
    }

    public void close() {

    }

    private Result mockExecution(String s){
        if(s.contains("PEOPLE")){
            List<String> people = Arrays.asList("Giga","Giorgi","Ana","Nestani");
            return new Result(people);
        }

        if(s.contains("COMPANY")){
            List<String> people = Arrays.asList("IBM","GOOGLE","LUXOFT","MICROSOFT");
            return new Result(people);
        }

        return new Result(new ArrayList<>());
    }
}
