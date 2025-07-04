class month{
    void mon(){
    System.out.print("Born month is : August");
    }
}
class year extends month{
    void yr(){
    System.out.println("Born year is : 2003");
    }
}
class name extends year{
    void nm(){
    System.out.println("the name is : hari ");
    }
}
public class Main{
    public static void main (String args[]){
        name bat=new name();
        bat.nm();
        bat.yr();
        bat.mon();
    }
}