package adrianromanski.behavioral.chain_of_responsability.company;

public class VP extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            System.out.println("VPs can approve purchases below 1500");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
