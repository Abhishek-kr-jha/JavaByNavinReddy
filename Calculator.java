// Method overloading.

class Demo{

    public int add(int n1, int n2, int n3){
        
        return  n1+n2;
    }
    public int add1(int n1,int n2){
        return n1+n2;
    }
}

public class Calculator {
public static void main(String[] args) {
    Demo obj = new Demo();
    int r1 = obj.add1(5,7);
    System.out.println(r1);
}
    
}

