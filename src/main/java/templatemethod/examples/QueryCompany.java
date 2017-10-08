package main.java.templatemethod.examples;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
public class QueryCompany implements Query {
    @Override
    public Result execute() {
        Connection c = new Connection();
        Result r = c.execute("SELECT * FROM COMPANY");
        c.close();
        return r;
    }
}
