public class Executor {
    public void executeIf(int input, Conditional conditional, Action action){
        if (conditional.check(input)) {
            action.run();
        }
    }
}
