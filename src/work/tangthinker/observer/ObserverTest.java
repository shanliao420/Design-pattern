package work.tangthinker.observer;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/9 12:06 星期二
 * @file ObserverTest
 * @project Design-pattern
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new DecimalObserver(subject);
        new HexObserver(subject);

        System.out.println("1. set state to 3:");
        subject.setState(3);
        System.out.println("\n2. set state to 10:");
        subject.setState(10);
    }

}
