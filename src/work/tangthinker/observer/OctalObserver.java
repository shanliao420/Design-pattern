package work.tangthinker.observer;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 12:03 星期二
 * @file OctalObserver
 * @project Design-pattern
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(this.subject.getState()));
    }
}
