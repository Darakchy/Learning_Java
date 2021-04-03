package Arrays;

public class Ev5 {
    public static void main(String[] args) {
        String [] ar1 = {"Шabc", "defkjh"};
        for(String ele : ar1)
        System.out.println(ele);

        for(int i = 0; i < ar1.length; i++){
            System.out.println(ar1[i]);
            char [] yuo = ar1[i].toCharArray();
            for (int j = 0; j < yuo.length; j++){
                System.out.println(yuo[j]);
            }
        }
    }
}
