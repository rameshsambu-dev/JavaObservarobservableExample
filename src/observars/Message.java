package observars;

import java.util.Observable;
import java.util.Observer;

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBoard board = new MessageBoard();
        Student bob = new Student();
        Student joe = new Student();
        board.addObserver(bob);
        board.addObserver(joe);
        board.changeMessage("More Homework!");
        board.changeMessage("ABC!");

	}

}
class MessageBoard  extends Observable
{
    public void changeMessage(String message) 
    {
        setChanged();
        notifyObservers(message);
    }

}

class Student implements Observer 
{
    @Override
    public void update(Observable o, Object arg) 
    {
        System.out.println("Message board changed: " + arg);
    }
}