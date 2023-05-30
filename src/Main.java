public class Main {
    public static void main(String[] args) {

        System.out.println("1 example");

        double[] weight = new double[3];
        weight[0] = 1.57;
        weight[1] = 7.654;
        weight[2] = 9.986;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);


        System.out.println("2 example");
        weight = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i] + ",");

        }

        System.out.println("");
        System.out.println("3 example");
        weight = new double[]{9.986, 7.654, 1.57};
        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i] + ",");


        }
    }
}