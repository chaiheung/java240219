package ch06.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("NO GAS");
            return false;
        }
        System.out.println("GAS GAS GAS");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("RUN(잔량: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("STOP(잔량: " + gas + ")");
                return;
            }
        }
    }
}
