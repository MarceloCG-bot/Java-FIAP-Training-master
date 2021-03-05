public class TestException1 {
    public static void main(String[] args) throws Divisaopor0 {

        try {
            int val = 10 / 0;
            System.out.println(val);
        } catch (Exception e) {

            throw new Divisaopor0();
        }
    }
}
