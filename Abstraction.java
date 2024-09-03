public class Abstraction {
    public static void main(String[] args) {
        RBI obj = new SBI();
        obj.roi();
        
    }
}

abstract class RBI{
    abstract void roi();
}

class SBI extends RBI{
    @Override
    void roi(){

    }
}