public class NestedLoopPractise {
    public static void main(String[] args) {
        NestedLoopPractise n = new NestedLoopPractise();
    }

    public NestedLoopPractise() {
        //pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern75();
    }

    public void pattern4() {

        for (int i = 1; i <= 6; i++) {
            System.out.print(i * i + "\t");
        }
    }

    public void pattern5() {
        for (int i = 1; i <= 4; i++) {
            for (int x = 1; x <= 4; x++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int x = 1; x <i; x++) {
                System.out.print(" ");
            }

            System.out.println(i);
        }
    }
    public void pattern7(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<= i; j++){
                System.out.print (i);
            }
            System.out.println();
        }
    }
    public void pattern75(){
        for (int i = 5; i <= 5; i++) {
            for (int j = 5; j >= i; j++) {
                System.out.print (i);
            }
            System.out.println();
        }
    }
}
