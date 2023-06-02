package work.tangthinker.strategy;

/**
 * @author shanliao420@yeah.net
 * @date 2023/6/2 12:56 星期五
 * @file OperationMultiply
 * @project Design-pattern
 */
public class OperationMultiply implements Strategy{


    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
