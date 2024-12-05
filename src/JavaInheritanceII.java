public class JavaInheritanceII {

    public static void main(String[] args) {

        Adder adderObject = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.print(adderObject.add(17, 25) + " " + adderObject.add(0, 13) + " " + adderObject.add(7, 13));

    }
}


class Arithmetic {

//    int integer1;
//    int integer2;

    public int add(int paramInteger1, int paramInteger2) {

       return paramInteger1 + paramInteger2;

    }
}

class Adder extends Arithmetic {
}
