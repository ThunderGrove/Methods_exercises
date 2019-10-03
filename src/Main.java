import java.lang.invoke.SwitchPoint;

public class Main{
    public static void main(String[] args){
        System.out.println("The middle value of 6, 10, 8 is "+Main.findMidt(6,10,8));

        int[] incArray=Main.inc(new int[]{0,1,2,3,4});
        for(int i=0;i<incArray.length;i++){
            System.out.println(incArray[i]);
        }

        System.out.println(Main.math("add",5,2));
    }

    public static int findMidt(int a, int b, int c){
        //Exercises 3
        return Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));
    }

    public static int[] inc(int[] anArray){
        //Exercises 8
        for(int i=0;i<anArray.length;i++){
            anArray[i]++;
        }
        return anArray;
    }

    public static double math(String mode,double a, double b){
        //Exercises 14
        if(mode.equals("add")){
            return a+b;
        }else if(mode.equals("sub")){
            return a-b;
        }else if(mode.equals("multi")){
            return a*b;
        }else if(mode.equals("divi")){
            return a/b;
        }else if(mode.equals("mod")){
            return a%b;
        }else{
            return -1;
        }
    }
}