import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                      Welcome to BANGSamoro Airines");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                         Flight Ticket Booking");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("**************************************************************************************");
        System.out.println("Select Travel Type");
        System.out.println("[1]. One Way");
        System.out.println("[2]. Roundtrip");
        System.out.print("Choose your Travel type: ");
        int flightType = input.nextInt();
        System.out.println("**************************************************************************************");
        System.out.println("\n");
        switch (flightType){
            case 1:System.out.println("**************************************************************************************");
                System.out.print("Kindly enter your desired date (e.g 12/20/2023): ");
            String desiredDate = input.next();
            System.out.println("Date: " + desiredDate);
                System.out.println("**************************************************************************************");
            System.out.println("\n");
                System.out.println("**************************************************************************************");
            System.out.println("============================Available flights============================");
            System.out.println("[1] Manila --> Mactan-Cebu International Airport");
            System.out.println("[2] Manila --> Puerto Princesa");
            System.out.println("[3] Manila --> Iloilo City");
            System.out.println("[4] Manila --> Cagayan de Oro");
            System.out.println("[5] Manila --> Siargao");
            System.out.println("[6] Manila --> Zamboanga");
            System.out.println("[8] Manila --> Bohol");
            System.out.println("[9] Manila --> Bacolod");
            System.out.println("[10] Manila --> Tacloban");
            System.out.println("[11] Manila --> Batanes");
            System.out.println("[12] Manila --> Davao");
            System.out.println("[13] Manila --> Baguio");
            System.out.println("[14] Manila --> Boracay");
            System.out.println("[15] Manila --> El Nido");
            System.out.println("[16] Manila --> Kalibo");
            System.out.println("[17] Manila --> Butuan");
            System.out.println("[18] Manila --> Coron");
            System.out.println("[19] Manila --> Legazpi");
            System.out.println("[20] Manila --> General Santos");
            System.out.print("Enter your desired destination: ");
            int desiredDestination = input.nextInt();
            System.out.println("\n");
            System.out.println("**************************************************************************************");
            switch (desiredDestination){
                case 1:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------");
                    System.out.println("Manila --> Mactan-Cebu International Airport");
                    System.out.println("------------------------------------------------");
                    System.out.println("\n");
                break;

                case 2:
                    System.out.println("\n");
                    System.out.println("------------------------------------------------");
                    System.out.println("Manila --> Puerto Princesa");
                    System.out.println("------------------------------------------------");
                    System.out.println("\n");
                break;




                            }
                System.out.println("**************************************************************************************");
                System.out.println("\n");

        }

        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                         Passenger's Details");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");

        System.out.print("Salutation (Ms./Mr./Mrs.): ");
        String salutation = input.next();
        salutation = salutation.trim();
        String salutationCapital = salutation.substring(0,1) . toUpperCase() + salutation.substring(1);
        System.out.print("Enter your First Name: ");
        String firstName = input.next();
        firstName = firstName.trim();
        String firstNameCapital = firstName.substring(0,1). toUpperCase() + firstName.substring(1);
        System.out.print("Enter your Middle Name (if none, put N/A): ");
        String middleName = input.next();
        middleName = middleName.trim();
        String middleNameCapital = middleName.substring(0,1). toUpperCase() + middleName.substring(1);
        System.out.print("Enter your Last Name (Attach a suffix if available): ");
        String lastName = input.next();
        lastName = lastName.trim();
        String lastNameCapital = lastName.substring(0,1). toUpperCase() + lastName.substring(1);
        System.out.print("Date of Birth (e.g 01/29/2005): ");
        String dateOfBirth = input.next();
        System.out.print("Nationality: ");
        String nationality = input.next();
        nationality = nationality.trim();
        String nationalityCapital = nationality.substring(0,1). toUpperCase() + nationality.substring(1);
        System.out.print("Contact Number (9634225475): ");
        String contactNum = input.next();
        System.out.print("Email Address: ");
        String emailAdd = input.next();
        System.out.println("**************************************************************************************");
        System.out.println("\n");
        System.out.println("**************************************************************************************");
        System.out.println("KINDLY CHECK YOUR DETAILS");
        System.out.println("\n");
        if(middleName.equalsIgnoreCase("n/a")){
            System.out.println("Name: " + salutationCapital + "." + " " + firstNameCapital + " " + lastNameCapital);
        } else if (middleName.equalsIgnoreCase("na")) {
            System.out.println("Name: " + salutationCapital + "." + " " + firstNameCapital + " " + lastNameCapital);
        } else  System.out.println("Name: " + salutationCapital + "." + " " + firstNameCapital + " " + middleNameCapital + " " +lastNameCapital);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Nationality: " + nationalityCapital);
        System.out.println("Contact: +63 " + contactNum);
        System.out.println("Email: " + emailAdd);
        System.out.println("**************************************************************************************");
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                                                           Payment Method");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("-----------------------------------------");
        System.out.println("!!!!!STRICTLY NO CANCELLATIONS!!!!!");
        System.out.println("-----------------------------------------");
        System.out.println("\n");
        System.out.println("**************************************************************************************");
        System.out.println("Choose your payment method");
        System.out.println("[1] E-Wallet");
        System.out.println("[2] Credit/Debit Card");
        System.out.println("[3] Over the Counter");
        int paymentMethod = input.nextInt();
        System.out.println("**************************************************************************************");
        System.out.println("\n");
        switch (paymentMethod){
            case 1:
                System.out.println("**************************************************************************************");
                System.out.println("[1] Gcash");
                System.out.println("[2] Maya");
                int pay = input.nextInt();
                switch (pay) {
                    case 1:  System.out.println("Enter your Gcash number (9999053440): ");
                    String gcash = input.next();
                        System.out.println("Enter your mpin (4 digits): ");
                        int mpin = input.nextInt();
                        System.out.println("Payment successful! Details will be sent to your email (" + emailAdd + ")");
                        System.out.println("**************************************************************************************");
                        break;

                }
        }





    }
}