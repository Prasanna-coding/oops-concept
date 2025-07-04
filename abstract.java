abstract class animal{
    abstract void run();
}
class elephant extends animal{
    void run(){
        System.out.println("i am elephant");
    }

}
public class Main{
    public static void main (String[] args) {
    animal obj=new elephant();
    obj.run();
    }
}