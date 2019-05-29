package models;

public class Admin implements Model {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdmin;
    private boolean isSuspended;

    public Admin(String firstName, String lastName, String email, int age, boolean isSuspended) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdmin = true;
        this.isSuspended = isSuspended;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public boolean getIsSuspended() {
        return isSuspended;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", email: " + email + " age: " + age + ", isSuspended: " + isSuspended;
    }
}
