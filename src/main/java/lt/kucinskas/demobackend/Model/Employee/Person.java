package lt.kucinskas.demobackend.Model.Employee;

import lt.kucinskas.demobackend.Model.Picture.Picture;

public class Person {

    private String personId;
    private String firstName;
    private String lastName;
    private String sex;

    private Picture picture;
    private String phoneNumber;
    private String email;

//    Constructors

    public Person(String personId, String firstName, String lastName, String sex,Picture picture, String phoneNumber, String email) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.picture = picture;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    //    Getters and Setters

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    Override

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", picture=" + picture +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
