package work.tangthinker.strategy;

/**
 * @author shanliao420@yeah.net
 * @date 2023/6/2 12:55 星期五
 * @file OperationMinus
 * @project Design-pattern
 */
public class OperationMinus implements Strategy{


    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
