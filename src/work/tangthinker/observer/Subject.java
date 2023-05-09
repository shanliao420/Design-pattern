package work.tangthinker.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 11:56 星期二
 * @file Subject
 * @project Design-pattern
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }




}
