import java.util.Scanner;
public class Watermelon {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        try{
            int weight = input.nextInt();

        if (weight%2==1) {
            System.out.printf("NO");
        }else{
            if (weight==2) {
                System.out.println("NO");
            }else
            System.out.println("YES");
        }
    }finally{
        input.close();
    }
}
}