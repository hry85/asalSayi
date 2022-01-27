public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2 ; i <= 100 ; i++){
            int n = 0;
            for (int j =2 ; j < i ; j++){
                if (i % j == 0){
                    n = 1;
                    break;
                }
            }
            if (n == 0){
                System.out.print(i+ " ");
                count++;
            }
        }
    }
}
