package HW5;

public class HW5_2 {

    public static void main(String[] args) {
     /*   for (int i = 9; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--){
            for (int j = i; j < 9; j++){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
*/
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
