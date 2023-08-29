package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        printValues(first, second);
    }

    private void printValues(int first, int second) {
        System.out.println(first);
        System.out.println(second);
    }
}

