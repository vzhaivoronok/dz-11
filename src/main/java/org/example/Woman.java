package org.example;

public class Woman extends Person{
    private String maidenName;

    public Woman(String firstName, String lastName, int age, Person partner) {
        super(firstName, lastName, age, partner);
        this.setRetirementThreshold(60);
        this.maidenName = lastName;
    }

    @Override
    public void registerPartnership(Person partner) {
        super.registerPartnership(partner);
        this.setLastName(partner.getLastName());
    }

    @Override
    public void deregisterPartnership(boolean returnToPreviousLastName) {
        super.deregisterPartnership(returnToPreviousLastName);
        if (returnToPreviousLastName){
            this.setLastName(maidenName);
        }
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }
}
