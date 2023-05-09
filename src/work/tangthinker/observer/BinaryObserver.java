package work.tangthinker.observer;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 12:01 星期二
 * @file BinaryObserver
 * @project Design-pattern
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(this.subject.getState()));
    }
}
