package main.java.templatemethod.examples;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
abstract public class AbstractQuery implements Query {
    @Override
    public Result execute() {
        Connection c = new Connection();

        Result r = c.execute(this.getQueryString());
        c.close();
        return r;
    }

    abstract protected String getQueryString();
}
