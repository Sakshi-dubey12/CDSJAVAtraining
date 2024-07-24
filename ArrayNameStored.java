public class ArrayNameStored {
    public static void main(String[] args){
        String[] friendNames = {"Ram","Lakshman","Krishna","Vishnu","hamuman"};
        System.out.println(friendNames.length);
        System.out.println(friendNames[2]);
        System.out.println(friendNames[3]="Rini");
        for(int i = 0; i < friendNames.length; i++){
            System.out.print(friendNames[i]+" ");
        }
    }
}
