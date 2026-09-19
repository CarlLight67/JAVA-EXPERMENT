import java.util.Scanner;
public class training {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String ask = "";
        String confirmationId = "";
        String finalAct = "";

        while (true){
            System.out.print("ARE YOU A STUDENT?: ");
            ask = input.nextLine().trim();

            if(ask.equalsIgnoreCase("Y")){
                System.out.println("PROCESSS.........");

                while(true){

                    System.out.print("DO YOU HAVE AN STUDENT ID?|| Y OR N: ");

                    confirmationId = input.nextLine().trim();

                    if(confirmationId.equalsIgnoreCase("Y")){

                        System.out.print("WELCOME!!!");
                        break;

                    }

                    else if(confirmationId.equalsIgnoreCase("n")){

                        System.out.println("YOU ARE NOT ALLOWED HERE");
                        break;

                    }
                    else{
                        System.out.println("INVALID ANSWER!!");
                        continue;
                    }
                }
                    break;
            } else if(ask.equalsIgnoreCase("N")){
                System.out.print("GET OUT NIGGER");
                break;
            } else{
                System.out.print("ENTER THE RIGHT VALUE || Y or N ?");
                continue;
            }

        }
        input.close();
    }
}
