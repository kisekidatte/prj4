public class task12 {
    public static void m(String str, double numb){
        if (str==null) {
            throw new IllegalArgumentException("Строчка введена неверно");
        }
        if (numb>0.001) {
            throw new IllegalArgumentException("Неверное число");
        } }

    public static void main(String[] args) {
        m(null,0.000001);
    }
}
