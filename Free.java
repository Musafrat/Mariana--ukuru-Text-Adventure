import java.util.Scanner;
public class Free {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hourlyRate = 0;
        int belondHour = 0;
        int enternumber;
        int free = 0;
        System.out.println("choose one thing (1-Motorcycle 2-Car 3-Minibus)");
        enternumber = input.nextInt();
        switch (enternumber) {
            case 1:hourlyRate = 10;break;
            case 2:hourlyRate = 20;break;
            case 3:hourlyRate = 30;break;
            default: hourlyRate = -1;
        }
        int minutes;
        System.out.println("enter a minutes: ");
        minutes = input.nextInt();
        if (hourlyRate != -1) {


            if (enternumber == 1) {
                belondHour = (minutes / 60);
                if (belondHour <= 3) {
                    free = belondHour * hourlyRate;
                } else if (4 <= belondHour && belondHour <= 8) {
                    free = (3 * hourlyRate) + ((belondHour - 3) * hourlyRate) / 2;
                } else {
                    free = 6 * hourlyRate;
                }
            }

            if (enternumber == 2) {
                belondHour = (minutes / 12);
                if (belondHour <= 3) {
                    free = belondHour * hourlyRate;
                } else if (4 <= belondHour && belondHour <= 8) {
                    free = (3 * hourlyRate) + ((belondHour - 3) * hourlyRate) / 2;
                } else {
                    free = 6 * hourlyRate;
                }
            }
            if (enternumber == 3) {
                belondHour = (minutes / 15) + 1;
                if (belondHour <= 3) {
                    free = belondHour * hourlyRate;
                } else if (4 <= belondHour && belondHour <= 8) {
                    free = (3 * hourlyRate) + ((belondHour - 3) * hourlyRate) / 2;
                } else {
                    free = 6 * hourlyRate;
                }

            }


            System.out.println("belondHour: " + belondHour);
            System.out.println("free: " + free);
        } else {
            System.out.println("inidivaled peoblem");
        }
        input.close();
    }
}
