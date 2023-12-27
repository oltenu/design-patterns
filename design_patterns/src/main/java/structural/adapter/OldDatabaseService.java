package structural.adapter;

public class OldDatabaseService {
    public void executeQuery(String query) {
        System.out.println("Old type query: " + query);
    }
}
