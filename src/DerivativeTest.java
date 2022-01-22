    import java.util.*;

    class DerivateTest{
        public static void main(String args[]){
            int coefficient, potency, x, xc, xp;

            Scanner input = new Scanner(System.in);

            System.out.println("Simple calculator to derive functions of type ax^b\n");

            do{
                System.out.println("Coefficient a: ");
                coefficient = input.nextInt();
                System.out.println("Potency b: ");
                potency = input.nextInt();
                xc = coefficient * potency;
                xp = potency - 1;
                System.out.println("Result: " + xc + "x^" +
                        xp + "\n");
                System.out.println("Derive one more? Yes (1) / No (2)");
                x = input.nextInt();
            }while(x == 1);
        }
    }


