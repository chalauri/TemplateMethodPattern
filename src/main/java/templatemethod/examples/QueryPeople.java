package main.java.templatemethod.examples;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
public class QueryPeople  extends AbstractQuery {

    @Override
    protected String getQueryString() {
        return "SELECT * FROM PEOPLE";
    }
}
