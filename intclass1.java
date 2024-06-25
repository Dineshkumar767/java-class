interface intexample {
    int add(int a, int b);
}

class intclass1 implements intexample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        intclass1 obj = new intclass1();
        System.out.println("Sum = " + obj.add(4, 6));
    }
}