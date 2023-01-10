public class App {
    public static void main(String[] args) {
        var number = 7;
        System.out.println("\nTabela de multiplicação de " + number);

        for (int i = 1; i < 11; i++) {
            var result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
