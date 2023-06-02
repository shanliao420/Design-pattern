package work.tangthinker.strategy;

/**
 * @author shanliao420@yeah.net
 * @date 2023/6/2 12:56 星期五
 * @file Context
 * @project Design-pattern
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int process(int a, int b){
        return strategy.doOperation(a, b);
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 510;
        Context strategyAdd = new Context(new OperationAdd());
        System.out.println(strategyAdd.process(a, b));


        Context strategyMinus = new Context(new OperationMinus());
        System.out.println(strategyMinus.process(a, b));

        Context strategyMultiply = new Context(new OperationMultiply());
        System.out.println(strategyMultiply.process(a, b));
    }



}
