package main.java.templatemethod.examples;

/**
 * Created by Chalauri-G on 10/8/2017.
 */
public class Main {

    public static void main(String[] args) {
        Query query = new QueryPeople();
        executeQuery(query);

        query = new QueryCompany();
        executeQuery(query);
    }

    private static void executeQuery(Query q){
        Result r = q.execute();
        r.printOutput();
    }
}
