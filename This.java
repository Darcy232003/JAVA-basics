public class This {
    
    static int n1;
    static int n2;// instance variable has more priority than local variable
    public static void main(String[] args) {
        This obj = new This(23, 24);
        obj.show();
        int result = n1+n2;
        System.out.println(result);
    }
    @SuppressWarnings("static-access")
    This(int n1, int n2){// local variable n1 and n2
        this.n1 = n1;// ambiguity is created since both variables have same name
        this.n2 = n2;// this denotes that n1 and n2 on LHS are instance variable
    }

    @SuppressWarnings("static-access")
    void show(){
        this.n1 = this.n1 + n1;
        this.n2 = this.n2 + n2;
    }
}
