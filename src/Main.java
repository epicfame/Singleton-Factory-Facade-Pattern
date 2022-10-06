import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    VehicleFacade v = new VehicleFacade();
    LoggingSingleton l = LoggingSingleton.getInstance();

    public Main(){
        while(true){
            int choice=0;
            System.out.println("Vehicle Tester");
            System.out.println("==============");
            System.out.println("1. Test Car");
            System.out.println("2. Test Bicycle");
            System.out.println("3. View Log");
            System.out.println("4. Exit");
            while(true){
                System.out.print(">> ");
                try {
                    choice = sc.nextInt();
                    sc.nextLine();
                    if(choice>=1 && choice<=3){
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }
            if(choice==1){
                v.runCar();
                l.addLog("User choose to run Car");
            }
            else if(choice==2){
                v.runBicycle();
                l.addLog("User choose to run Bicycle");
            }
            else if(choice==3){
                l.viewLog();
            }
            else{
                return;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
