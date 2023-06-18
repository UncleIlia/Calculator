public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        // Ошибка деления на ноль. Для её обрабоки можно создать блок try/catch непосредственно в main
        // или выкинуть исключение в классе Calculator

//        try {
//            int c = calc.devide.apply(a, b);
//            calc.println.accept(c);
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль.");
//        }
    }
}
