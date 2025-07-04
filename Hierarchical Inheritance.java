class name{
    void nm(){
    System.out.println("the name is : hari");
    }
}
class year extends name{
    void yr(){
    System.out.println("Born year is : 2003");
    }
}
class month extends name{
    void mon(){
    System.out.println("Born month is : August ");
    }
}
public class Main{
    public static void main (String args[]){
        month bat=new month();
        bat.nm();
        bat.mon();
    }
}