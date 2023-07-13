import java.util.Scanner;

import static java.lang.System.exit;

public class VideoLauncher {

    public static void main(String[] args) {
        int choice;
        VideoStore apnaStore = new VideoStore();
        do {
            System.out.println("MAIN MENU");
            System.out.println("---------");
            System.out.println("1.Add Videos \n 2.Check out Video \n 3.Return video \n 4.Receive Rating \n 5.List Inventory \n 6.Exit");
            System.out.println("Enter your choice(1..6): ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the vedio you want to add: ");
                    apnaStore.addVideo(scan.next());
                    break;
                case 2:
                    System.out.println("Enter the name of the vedio you want to checkout: ");
                    apnaStore.doCheckOut(scan.next());
                    break;
                case 3:
                    System.out.println("Enter the name of the vedio you want to return: ");
                    apnaStore.doReturn(scan.next());
                    break;
                case 4:
                    System.out.println("Enter the name of the vedio you want to Rating: ");
                    String name = scan.next();
                    int rating = scan.nextInt();
                    apnaStore.receiveRating(name,rating);
                    break;
                case 5:
                    //System.out.println("Enter the name of the vedio you want to add: ");
                    apnaStore.listInventory();
                    break;

            }
        } while(choice!=6);


    }
}
