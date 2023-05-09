package work.tangthinker.observer;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 12:04 星期二
 * @file HexaObserver
 * @project Design-pattern
 */
public class HexObserver extends Observer{

    public HexObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Hex String: " +  Integer.toHexString(this.subject.getState()));
    }
}
