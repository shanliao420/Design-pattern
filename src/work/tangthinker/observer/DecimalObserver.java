package work.tangthinker.observer;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 12:10 星期二
 * @file DecimalObserver
 * @project Design-pattern
 */
public class DecimalObserver extends Observer{

    public DecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Decimal String: " + this.subject.getState());
    }
}
