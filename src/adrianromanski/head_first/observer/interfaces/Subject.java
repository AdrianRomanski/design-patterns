package adrianromanski.head_first.observer.interfaces;

public interface Subject {

    public void registerObservers(Observer o);
    public void deleteObservers(Observer o);
    public void notifyObservers();
}
