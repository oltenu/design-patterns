package structural.adapter;

public class OldDatabaseAdapterService extends NewDatabaseService{
    private final OldDatabaseService oldDatabaseService;

    public OldDatabaseAdapterService(){
        oldDatabaseService = new OldDatabaseService();
    }

    @Override
    public void executeQuery(String query){
        oldDatabaseService.executeQuery(query);
    }
}
