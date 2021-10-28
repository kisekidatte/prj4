public class task2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 "+ e );
        }
        System.out.println("3");
    }
}
