
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PC order = null;
        boolean orderOpen = false;

        boolean ramAdded = false;
        boolean gpuAdded = false;

        while (true) {
            System.out.println("\nPress 'O' to open New Order, 'E' to close order, 'X' to exit:");
            char choice = sc.next().charAt(0);

            if (choice == 'O' || choice == 'o') {
                if (orderOpen) {
                    System.out.println("Error! \nOrder already in progress. Close current order first.");
                    continue;
                }
                orderOpen = true;

                ramAdded = false;
                gpuAdded = false;

                System.out.println("Select PC Type: Base(70000BDT) \n(1) Core i5(20000BDT)+CPU cooler (36000 BDT) \n(2) Core i7(37000BDT)+liquid cooler(17000 BDT) \n(3) Core i9(65000BDT)+DVD drive (6000 BDT)");
                int pcType = sc.nextInt();
                order = PCFactory.createPC(pcType);

                if (order == null) {
                    System.out.println("Invalid PC type! \nOrder canceled.");
                    orderOpen = false;
                    continue;
                }

                while (true) {
                    System.out.println("\nAdd Components:");
                    System.out.println("1. Add 8GB RAM 2666MHz(+2620 BDT)");
                    System.out.println("2. Add 8GB RAM 3200MHz(+2950 BDT)");
                    System.out.println("3. Add 2GB Graphics Card(+6500 BDT)");
                    System.out.println("4. Add 4GB Graphics Card(+7600 BDT)");
                    System.out.println("5. Finish Customizing");
                    int c = sc.nextInt();

                    if (c == 1) {
                        if (ramAdded) {
                            System.out.println("Error! You cannot add more than one RAM.");
                        } else {
                            order = new RAM2666(order);
                            ramAdded = true;
                            System.out.println("RAM 2666MHz added.");
                        }
                    }
                    else if (c == 2) {
                        if (ramAdded) {
                            System.out.println("Error! You cannot add more than one RAM.");
                        } else {
                            order = new RAM3200(order);
                            ramAdded = true;
                            System.out.println("RAM 3200MHz added.");
                        }
                    }
                    else if (c == 3) {
                        if (gpuAdded) {
                            System.out.println("Error! You cannot add more than one Graphics Card.");
                        } else {
                            order = new Graphics2GB(order);
                            gpuAdded = true;
                            System.out.println("2GB Graphics Card added.");
                        }
                    }
                    else if (c == 4) {
                        if (gpuAdded) {
                            System.out.println("Error! You cannot add more than one Graphics Card.");
                        } else {
                            order = new Graphics4GB(order);
                            gpuAdded = true;
                            System.out.println("4GB Graphics Card added.");
                        }
                    }
                    else break;
                }

            } else if (choice == 'E' || choice == 'e') {
                if (!orderOpen) {
                    System.out.println("No order is open!");
                } else {
                    System.out.println("\n===== ORDER SUMMARY =====");
                    System.out.println("Ordered PC: " + order.getDescription());
                    System.out.println("Total Price: " + order.cost() + " BDT");
                    System.out.println("=========================");
                    orderOpen = false;
                    order = null;
                }

            } else if (choice == 'X' || choice == 'x') {
                System.out.println("Exiting Program...");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }

        sc.close();
    }
}