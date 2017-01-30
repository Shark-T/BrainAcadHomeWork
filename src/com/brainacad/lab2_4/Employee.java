package com.brainacad.lab2_4;

/**
 * Created by SHARK on 18.01.2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    static int numberOfEmployee;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployee++;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public static void setNumberOfEmployee(int numberOfEmployee) {
        Employee.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee ("Anatoliy","Boyko", "master", "0631436393");
        System.out.println(employee);
        Employee employee1 = new Employee ("Vasya","Pupkin", "student", "80631436393");
        System.out.println(employee1);
        Employee employee2 = new Employee ("Anatoliy","Boyko", "master", "380631436393");
        System.out.println(employee2);
        System.out.println("Number of employee " + Employee.getNumberOfEmployee());

    }
}
