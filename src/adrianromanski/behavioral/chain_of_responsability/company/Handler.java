package adrianromanski.behavioral.chain_of_responsability.company;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) { this.successor = successor; }

    public abstract void handleRequest(Request request);
}
