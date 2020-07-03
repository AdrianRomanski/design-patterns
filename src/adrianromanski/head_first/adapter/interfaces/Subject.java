package adrianromanski.head_first.adapter.interfaces;

public interface Subject {

    public void registerObservers(Observer o);
    public void deleteObservers(Observer o);
    public void notifyObservers();
}
