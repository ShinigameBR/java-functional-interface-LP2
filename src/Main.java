public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        
        // Exemplo 1: Condição de paridade (número par)
        Conditional isEven = (input) -> input % 2 == 0;
        Action printEven = () -> System.out.println("O número é par.");
        
        // Exemplo 2: Condição de maior que 10
        Conditional isGreaterThan10 = (input) -> input > 10;
        Action printGreaterThan10 = () -> System.out.println("O número é maior que 10.");
        
        // Exemplo 3: Condição de número positivo
        Conditional isPositive = (input) -> input > 0;
        Action printPositive = () -> System.out.println("O número é positivo.");
        
        // Testando a execução
        int input = 12;
        
        executor.executeIf(input, isEven, printEven); // Imprimi "O número é par."
        executor.executeIf(input, isGreaterThan10, printGreaterThan10); // Imprimi "O número é maior que 10."
        executor.executeIf(input, isPositive, printPositive); // Imprimi "O número é positivo."
        
        input = -5;
        
        executor.executeIf(input, isEven, printEven); // Não vai imprimir nada (não é par)
        executor.executeIf(input, isGreaterThan10, printGreaterThan10); // Não vai imprimir nada (não é maior que 10)
        executor.executeIf(input, isPositive, printPositive); // Não vai imprimir nada (não é positivo)
    }
}
