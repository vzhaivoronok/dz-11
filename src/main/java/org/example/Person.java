package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;
    private int retirementThreshold;


    public Person(String firstName, String lastName, int age, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;

    }

    public void registerPartnership(Person partner) {
        this.partner = partner;
    }

    public void setRetirementThreshold(int retirementThreshold) {
        this.retirementThreshold = retirementThreshold;
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        this.partner = null;
    }

    public boolean isRetired() {
        return age > retirementThreshold;
    }

    public String getPersonData() {
        return String.format("Name: %s, LastName: %s, Age: %d, Partner: %s", firstName, lastName, age, partner != null ? partner.getLastName() : "No partner");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRetirementThreshold() {
        return retirementThreshold;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}
