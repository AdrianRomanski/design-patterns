package adrianromanski.pluralsight.bryan_hansen.behavioral.chain_of_responsability.company;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
