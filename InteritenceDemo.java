public class InteritenceDemo extends GrandParent{
    public static  void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();


    }
}
class Parent extends GrandParent{
    void parentMethod(){
        System.out.println("Parent Method");
    }

}
class GrandParent{
    void grandParentMethod(){
        System.out.println("GrandParent Method");
    }
}
