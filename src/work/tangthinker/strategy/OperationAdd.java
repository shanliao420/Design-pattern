package work.tangthinker.strategy;

/**
 * @author shanliao420@yeah.net
 * @date 2023/6/2 12:54 星期五
 * @file OperationAdd
 * @project Design-pattern
 */
public class OperationAdd implements Strategy{


    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}
