public class MethodeOverLoading {
    public static void main(String[] args) {
        Calculatore calc = new Calculatore();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)2.5,(float) 3.5));
        System.out.println(calc.sum(1, 2,3));
    }
}

class Calculatore {
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    float sum(int a,int b,int c){
        return a+b+c;
    }
}