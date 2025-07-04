class year{
    int year=2003;
}
class name extends year{
   String name ="hari";

}
public class Main{
    public static void main (String[] args) {
    name h= new name();
    System.out.println("name of the student : "+h.name);
    System.out.println("born year : "+h.year);
    
    }
}