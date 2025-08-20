package methodOverloading;
class Demo{
    void disp(int x){
        System.out.println("Int-arg method");
    }
    void add(float y){
        System.out.println("float-arg method");
    }
}

public class assigenment1 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.disp(10);
       // d.disp(10.5f);
        d.disp('A');
       // d.disp(100L);
       // d.disp(100.5);
       // d.disp(true);
        
    }
    
}
