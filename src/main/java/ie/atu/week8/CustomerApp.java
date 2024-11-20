package ie.atu.week8;

public class CustomerApp {

    public static void main(String[] args) {
        Customer newCust = new Customer("Ben", "ATU", "0874044554", "ATU123", false );
        System.out.println(newCust.toString());

        PreferredCustomer newCust1 = new PreferredCustomer();
        newCust1.setName("Ben");
        newCust1.setAddress("ATU");
        newCust1.setPhone("0874044554");
        newCust1.setCust_num("ATU123");
        newCust1.setMailingList(false);
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1.toString());
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1.toString());
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1.toString());
        newCust1.setLoyaltyPoints(500);
        System.out.println(newCust1.toString());
    }

}
