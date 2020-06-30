package de.stfsy.twitter.jdk.fourteen;

public class CustomerRelations {

    public enum CustomerMood {
        SATISFIED, ANGRY
    }

    public boolean sendGift(final CustomerMood mood) {
        return switch (mood) {
            case SATISFIED -> false;
            case ANGRY -> true;
        };
    }

    public static void main(final String[] args) {
        final CustomerRelations customerRelations = new CustomerRelations();
        System.out.println(customerRelations.sendGift(CustomerMood.SATISFIED)); // false
        System.out.println(customerRelations.sendGift(CustomerMood.ANGRY)); // false
    }
}