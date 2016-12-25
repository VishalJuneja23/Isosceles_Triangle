/**
 * Created by jvishal on 12/25/16.
 */
public class IsoscelesTriangle {
    int size;

    public IsoscelesTriangle(int size) {
        this.size = size;

    }

    public String displayIsoscelesTriangle() {

        StringBuilder itriangle = new StringBuilder();
        for (int i = 1; i <= size; i++) {

            addSpace(itriangle,i);
            addAsterik(itriangle,i);

            if (i != size) itriangle.append("\n");
        }

        return itriangle.toString();
    }


    private void addSpace(StringBuilder itriangle, int i) {
        for (int space = size - 1; space >= i; space--)
            itriangle.append(" ");
    }

    private void addAsterik(StringBuilder itriangle, int i)
    {
        for (int j = 1; j <= (i * 2) - 1; j++)
            itriangle.append("*");
    }

    public static void main(String[] args) {

        System.out.println(new IsoscelesTriangle(10).displayIsoscelesTriangle());
    }

}