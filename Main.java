import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333


      do{
          String desiredDate2 = "";
          String returnDate = "";
          String desiredDate = "";
          int desiredDestination3 = 0;
          int desiredDestination = 0;
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
                  desiredDate = input.next();
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
                  System.out.println("[7] Manila --> Tuguegarao");
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
                  desiredDestination = input.nextInt();
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

                      case 3:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Iloilo City");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 4:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Cagayan de Oro");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 5:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Siargao");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;


                      case 6:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Zamboanga");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;


                      case 7:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Tuguegarao");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 8:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Bohol");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 9:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Bacolod");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 10:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Tacloban");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 11:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Batanes");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 12:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Davao");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 13:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Baguio");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 14:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Boracay");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 15:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> El Nido");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 16:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Kalibo");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 17:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Butuan");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 18:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Coron");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 19:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> Legazpi");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 20:
                          System.out.println("\n");
                          System.out.println("------------------------------------------------");
                          System.out.println("Manila --> General Santos");
                          System.out.println("------------------------------------------------");
                          System.out.println("\n");
                          break;

                      default:
                          System.out.println("Your desired flight/destination isn't available at the moment.");
                          break;





                  }
                  break;


              case 2:
                  System.out.println("**************************************************************************************");
                  System.out.print("Kindly enter your desired date (e.g 12/20/2023): ");
                  desiredDate2 = input.next();
                  System.out.println("Date: " + desiredDate2);
                  System.out.print("Kindly enter your desired date of return (e.g 12/25/2023): ");
                  returnDate = input.next();
                  System.out.println("Date of Return: " + returnDate);

                  System.out.println("**************************************************************************************");
                  System.out.println("\n");
                  System.out.println("**************************************************************************************");
                  System.out.println("=======================================================Available flights=======================================================");
                  System.out.println("[1] Manila --> Mactan-Cebu International Airport || Mactan-Cebu International Airport --> Manila" );
                  System.out.println("[2] Manila --> Puerto Princesa || Puerto Princesa --> Manila");
                  System.out.println("[3] Manila --> Iloilo City || Iloilo City --> Manila");
                  System.out.println("[4] Manila --> Cagayan de Oro || Cagayan de Oro --> Manila");
                  System.out.println("[5] Manila --> Siargao || Siargao --> Manila");
                  System.out.println("[6] Manila --> Zamboanga || Zamboanga --> Manila");
                  System.out.println("[7] Manila --> Tuguegarao || Tuguegarao --> Manila");
                  System.out.println("[8] Manila --> Bohol || --> Bohol --> Manila");
                  System.out.println("[9] Manila --> Bacolod || Bacolod --> Manila");
                  System.out.println("[10] Manila --> Tacloban || Tacloban --> Manila");
                  System.out.println("[11] Manila --> Batanes --> Batanes --> Manila");
                  System.out.println("[12] Manila --> Davao || Davao --> Manila");
                  System.out.println("[13] Manila --> Baguio || Baguio --> Manila");
                  System.out.println("[14] Manila --> Boracay || Boracay --> Manila ");
                  System.out.println("[15] Manila --> El Nido || El Nido --> Manila");
                  System.out.println("[16] Manila --> Kalibo || Kalibo --> Manila");
                  System.out.println("[17] Manila --> Butuan || Butuan --> Manila");
                  System.out.println("[18] Manila --> Coron || Coron --> Manila");
                  System.out.println("[19] Manila --> Legazpi || Legazpi --> Manila");
                  System.out.println("[20] Manila --> General Santos || General Santos --> Manila");
                  System.out.print("Enter your desired destination: ");
                   desiredDestination3 = input.nextInt();
                  System.out.println("**************************************************************************************");
                  System.out.println("\n");
                  switch (desiredDestination3){

                      case 1:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Mactan-Cebu International Airport || Mactan-Cebu International Airport --> Manila" );
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 2:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println(" Manila --> Puerto Princesa || Puerto Princesa --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 3:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Iloilo City || Iloilo City --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 4:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Cagayan de Oro || Cagayan de Oro --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 5:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Siargao || Siargao --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;


                      case 6:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Zamboanga || Zamboanga --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;


                      case 7:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Tuguegarao || Tuguegarao --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 8:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Bohol || --> Bohol --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 9:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Bacolod || Bacolod --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 10:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Tacloban || Tacloban --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 11:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Batanes --> Batanes --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 12:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Davao || Davao --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 13:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Baguio || Baguio --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 14:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Boracay || Boracay --> Manila ");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 15:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> El Nido || El Nido --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 16:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Kalibo || Kalibo --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 17:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Butuan || Butuan --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 18:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Coron || Coron --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 19:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> Legazpi || Legazpi --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      case 20:
                          System.out.println("\n");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("Manila --> General Santos || General Santos --> Manila");
                          System.out.println("--------------------------------------------------------------------------------------------------------");
                          System.out.println("\n");
                          break;

                      default:
                          System.out.println("Your desired flight/destination isn't available at the moment.");
                          break;

                  }
                  break;


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
                          System.out.println("\n");
                          break;


                      case 2:  System.out.println("Enter your Maya number (9999053440): ");
                          String maya = input.next();
                          System.out.println("Enter your pin (4 digits): ");
                          int pin = input.nextInt();
                          System.out.println("Payment successful! Details will be sent to your email (" + emailAdd + ")");
                          System.out.println("**************************************************************************************");
                          System.out.println("\n");
                          break;



                  }
                  break;


              case 2:
                  System.out.println("**************************************************************************************");
                  System.out.println("VISA | Master Card | American Express");
                  System.out.println("First Name: " + firstNameCapital);
                  System.out.println("Last Name: " + lastNameCapital);
                  System.out.println("Email Address: " + emailAdd);
                  System.out.print("Card Number (1353 6548 9673 6539): ");
                  String cardNum = input.next();
                  System.out.print("MM/YY: 09/2025");
                  String mmYY = input.next();
                  System.out.print("CVC: 123/1234");
                  int cvc = input.nextInt();
                  System.out.println("**************************************************************************************");
                  System.out.println("\n");
                  System.out.println("**************************************************************************************");
                  System.out.println("-----------------------------------------");
                  System.out.println("             CARD DETAILS");
                  System.out.println("-----------------------------------------");
                  System.out.println("First Name: " + firstNameCapital);
                  System.out.println("Last Name: " + lastNameCapital);
                  System.out.println("Email Address: " + emailAdd);
                  System.out.println("Card Number: " + cardNum + " " + mmYY + " " + cvc);
                  System.out.println("**************************************************************************************");
                  System.out.println("\n");


                  break;

              case 3:
                  System.out.println("**************************************************************************************");
                  System.out.println("Please do an on-site payment. Thank you for patronizing BANGSamoro Airlines.");
                  System.out.println("**************************************************************************************");
                  break;



          }

          if (flightType == 1){
              System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("                                                                                                           FLIGHT DETAILS");
              System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("\n");
              System.out.println("**************************************************************************************");
              System.out.println("First Name: " + firstNameCapital);
              System.out.println("Last Name: " + lastNameCapital);
              System.out.println("Date of Birth: " + dateOfBirth);
              System.out.println("Travel Type: One Way");
              if(paymentMethod == 1){
                  System.out.println("Payment Method: E-Wallet");
              }

              if(paymentMethod == 2){
                  System.out.println("Payment Method: Credit/Debit Card");

              }

              if(paymentMethod == 3){
                  System.out.println("Payment Method: Over the Counter");
              }
              if (desiredDestination == 1){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Mactan-Cebu International Airport");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 2) {

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Puerto Princesa");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 3){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Iloilo City");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 4){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Cagayan de Oro");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3== 5){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Siargao");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 6){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Zamboanga");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 7) {

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Tuguegarao");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 8){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Bohol");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 9){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Bacolod");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 10){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Tacloban");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 11){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Batanes");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination == 12){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Davao");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 13){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Baguio");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 14){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Boracay");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 15){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> El Nido");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 16){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Kalibo");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 17){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Butuan");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 18){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Coron");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 19){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Legazpi");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination == 20){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> General Santos");
                  System.out.println("--------------------------------------------------------------------------------------------------------");
              }
              System.out.println("Departure: " + desiredDate);
              System.out.println("Enjoy your flight!");
              System.out.println("**************************************************************************************");
              System.out.println("\n");

          }


          if (flightType == 2){
              System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("                                                                                                           FLIGHT DETAILS");
              System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("\n");
              System.out.println("**************************************************************************************");
              System.out.println("First Name: " + firstNameCapital);
              System.out.println("Last Name: " + lastNameCapital);
              System.out.println("Date of Birth: " + dateOfBirth);
              System.out.println("Travel Type: Round Trip");
              if(paymentMethod == 1){
                  System.out.println("Payment Method: E-Wallet");
              }

              if(paymentMethod == 2){
                  System.out.println("Payment Method: Credit/Debit Card");

              }

              if(paymentMethod == 3){
                  System.out.println("Payment Method: Over the Counter");
              }
              if (desiredDestination3 == 1){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Mactan-Cebu International Airport || Mactan-Cebu International Airport --> Manila" );
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 2) {

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Puerto Princesa || Puerto Princesa --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 3){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Iloilo City || Iloilo City --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 4){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Cagayan de Oro || Cagayan de Oro --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 5){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Siargao || Siargao --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 6){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Zamboanga || Zamboanga --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 7) {

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Tuguegarao || Tuguegarao --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 8){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Bohol || --> Bohol --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 9){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Bacolod || Bacolod --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 10){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Tacloban || Tacloban --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 11){

                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Batanes --> Batanes --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");


              } else if (desiredDestination3 == 12){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Davao || Davao --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 13){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Baguio || Baguio --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 14){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Boracay || Boracay --> Manila ");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 15){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> El Nido || El Nido --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 16){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Kalibo || Kalibo --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 17){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Butuan || Butuan --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 18){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Coron || Coron --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 19){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> Legazpi || Legazpi --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");

              } else if (desiredDestination3 == 20){
                  System.out.println("--------------------------------------------------------------------------------------------------------");
                  System.out.println("Destination: Manila --> General Santos || General Santos --> Manila");
                  System.out.println("--------------------------------------------------------------------------------------------------------");
              }



              System.out.println("Departure: " + desiredDate2);
              System.out.println("Return: " + returnDate);
              System.out.println("Enjoy your flight!");
              System.out.println("**************************************************************************************");
              System.out.println("\n");


          }


          System.out.println("**************************************************************************************");
          System.out.println("Would you like to book another flight? (Y - Yes | N - No): ");
          String yn = input.next();
          System.out.println("**************************************************************************************");

          if(yn.equalsIgnoreCase("n")){
              break;
          }



      } while(true);
            System.out.println("Thank you for choosing BANGSamoro Airlines.");


            //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333
        //irun nyo po sa compiler na naka full screen <3333



    }
}