interface Month {
    void mon();
}

interface Name {
    void nm();
}

class Student1 implements Month, Name {
    public void nm() {
        System.out.println("hari");
    }

    public void mon() {
        System.out.println("August");
    }
}

class Batman implements Month, Name {
    public void nm() {
        System.out.println("batman name is hari");
    }

    public void mon() {
        System.out.println("batman born month August");
    }
}

public class Main {
    public static void main(String[] args) {
        Student1 student = new Student1();
        Batman bat = new Batman();

        student.nm();
        student.mon();
        bat.nm();
        bat.mon();
    }
}
