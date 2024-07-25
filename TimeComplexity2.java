import java.lang.Math;
class GFG {
    public static void main(String args[]){
        int i, n = 8;
        for (i = 2; i <= n; i=(int)Math.pow(i,2)) {
            System.out.println("Hello World !!!");
        }
        //n = 8 ,iteration = 2
        //n = 12 ,iteration =2
        //n=16,iteraton = 3
        //time complexity (loglogn)
    }
}


