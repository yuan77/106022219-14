import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        x=in.nextInt();
        y=in.nextInt();
        if(x*x+y*y<=100*100)
            System.out.println("inside");
        else
            System.out.println("outside");
    }
}
