import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        String choice;
        String answer="Yes";
        String asnwer1="Yes";
        String answer2="yes";
        int foodMenu=0;
        int saldMenu=0;
        int drinkmenu=0;
        int foodPrice=0;
        int saladprice=0;
        int drinkprice = 0;

        do {
            // We make four scanner. for each switch.
            Scanner input=new Scanner(System.in);
            System.out.println("***Do you want to continue in our page***  ");
            answer=input.nextLine();
            String foodbking ="";

            // if og else is statement
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Welcome to our page ");
                System.out.println("Choice food from our food Menu");
                foodMenu = input.nextInt();
                switch (foodMenu) {
                    case 1:
                        System.out.println("Pizza");
                        foodbking = "Pizza";
                        System.out.println(foodPrice+150);
                        foodPrice=150;
                        break;
                    case 2:
                        System.out.println("Tomato Soup");
                        foodbking = "Tomato Soup";
                        System.out.println(foodPrice+130);
                        foodPrice=130;
                        break;
                    case 3:
                        System.out.println("Chicken Soup ");
                        foodbking = "Chicken Soup";
                        System.out.println(foodPrice+120);
                        foodPrice=120;
                        break;
                    case 4:
                        System.out.println("Crispy Corn");
                        foodbking = "Crispy Corn";
                        System.out.println(foodPrice+130);
                        foodPrice=130;
                        break;
                }

            } else {
                System.out.println("You choice no.Thank you for your time");
                break;

            }
            Scanner input2=new Scanner(System.in);
            System.out.println("*** Do you want to choice som salad form the menu?");
            asnwer1=input2.nextLine();
            String saladbooking="";
            if(asnwer1.equalsIgnoreCase("yes")){
                System.out.println("Choice som salad from the salad menu");
                saldMenu=input2.nextInt();
                switch (saldMenu){
                    case 1:
                        System.out.println("You choice Guacamole Salad ");
                        saladbooking="Guacamole Salad";
                        System.out.println(saladprice+120);
                        saladprice=120;

                        break;
                    case 2:
                        System.out.println("Chicken salad");
                        saladbooking="Chicken salad";
                        System.out.println(saladprice+130);
                        saladprice=130;
                        break;
                    case 3:
                        System.out.println("normal sald");
                        saladbooking="normal sald";
                        System.out.println(saladprice+120);
                        saladprice=120;
                        break;
                }

            } else{
                System.out.println("No sald for you today");

            }
            Scanner input4= new Scanner(System.in);
            System.out.println("Do you want to choice som drink from the drink menu?");
            answer2=input4.nextLine();
            String drinkbookin="";
            if(answer2.equalsIgnoreCase("Yes")){
                System.out.println("Choice som drin from the drink menu");
                drinkmenu=input4.nextInt();
                switch (drinkmenu){
                    case 1:
                        System.out.println("Mineral Wate");
                        drinkbookin="Mineral Wate";
                        System.out.println(drinkprice+20);
                        drinkprice=20;
                        break;
                    case 2:
                        System.out.println("Fresh Fruit Juice");
                        drinkbookin="Fresh Fruit Juice";
                        System.out.println(drinkprice+40);
                        drinkprice=40;
                        break;
                    case 3:
                        System.out.println("Coffin");
                        drinkbookin="Coffin";
                        System.out.println(drinkprice+60);
                        drinkprice=60;
                        break;
                    case 4:
                        System.out.println("Tea");
                        drinkbookin="Tea";
                        System.out.println(drinkprice+90);
                        drinkprice=90;
                        break;
                    case 5:
                        System.out.println("Wines");
                        drinkbookin="Wines";
                        System.out.println(drinkprice+80);
                        drinkprice=80;
                        break;
                }
            }else{
                System.out.println("No drink for you today");
            }
            System.out.println("You choice the following order"+" "+"Food: "+foodbking +" salad: "+saladbooking
                    +" drink: " +drinkbookin);
            System.out.println();
            int total= (foodPrice+saladprice+drinkprice);
            System.out.println("The total number to pay is: "+total+" kr.");
            System.out.println();
            Scanner input3=new Scanner(System.in);
            System.out.println("Do you want to counties or not ");
            choice=input3.nextLine();
        }while (choice.equalsIgnoreCase("yes"));
    }
}
