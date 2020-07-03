package adrianromanski.pluralsight.bryan_hansen.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
