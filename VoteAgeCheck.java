public class VoteAgeCheck {
    public static void main(String[] args){
        int age = 20;
        //with terminal
        String adult = (age >= 18)?"Eligible":"not Eligible";
        System.out.println(adult);


        // with if else
        if(age > 18) {
            System.out.println("Eligible for voting");
        }else{
            System.out.println("Not Eligible for vote");
        }


    }
}
