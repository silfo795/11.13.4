import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=1;
        int pass=0;
        int grade;
        while(c<=10)
        {
            grade=in.nextInt();
            if(grade==1)
            pass+=1;
            c+=1;
        }
        System.out.println("Pass:"+pass);
        System.out.println("Fail:"+(10-pass));
        if(pass>8)
            System.out.println("Bounus！！");
    }
}
