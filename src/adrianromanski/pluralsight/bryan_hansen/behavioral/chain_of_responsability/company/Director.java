package adrianromanski.pluralsight.bryan_hansen.behavioral.chain_of_responsability.company;

public class Director extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
