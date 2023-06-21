import java.util.Scanner;

public class FloatCalc extends Calculator implements Display {

    public void floatAddition() {
        getInput();
    }

    @Override
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first float: ");
        float float1 = scanner.nextFloat();
        System.out.println("Enter second float: ");
        float float2 = scanner.nextFloat();
        System.out.println(float1 + float2);
    }


}
