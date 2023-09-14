// User Define Exception exercise

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less then 5000";
    }
}

public class UserDefineException {
    static void fun1() throws LowBalanceException {
        throw new LowBalanceException();
    }

    static void fun2() {
        try {
            fun1();
        } catch (LowBalanceException e){
            System.out.println(e);
        }
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
