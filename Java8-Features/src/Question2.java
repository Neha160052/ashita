//Q2 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication
//        method for the functional interface created


interface MethodReferenceInterface {
    int display(int a, int b);
}

public class Question2 {

    int instanceMethodAdd(int a, int b){
        return a+b;
    }

    int instanceMethodSubtract(int a, int b){
        return a-b;
    }

    static int staticMethodMultiply(int a, int b){
       return a*b;
    }

    public static void main(String[] args) {

        MethodReferenceInterface sm =Question2::staticMethodMultiply;
        System.out.println(sm.display(2,3));
        MethodReferenceInterface imAdd =new Question2()::instanceMethodAdd;
        System.out.println(imAdd.display(2,2));
        MethodReferenceInterface imSubtract =new Question2()::instanceMethodSubtract;
        System.out.println(imSubtract.display(4,2));

    }
}
