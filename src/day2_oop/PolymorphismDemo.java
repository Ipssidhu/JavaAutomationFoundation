package day2_oop;

public class PolymorphismDemo {

    public static void main(String[] args) {

        TestExecution uiTest = new UITest();
        TestExecution apiTest = new APITest();

        TestExecution[] tests = { uiTest, apiTest };

        for (TestExecution test : tests) {
            test.runTest();
        }
    }
}
