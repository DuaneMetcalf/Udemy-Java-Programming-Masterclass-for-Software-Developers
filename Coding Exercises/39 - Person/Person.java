public class Person {
   private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
        }else{
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        return ((this.getAge() > 12) && (this.getAge() < 20));
    }

    public String getFullName(){

        String fullName = "";

        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty()){
            return fullName;
        }

        if(this.getFirstName().isEmpty()){
            fullName = this.getLastName();
        }else if(this.getLastName().isEmpty()){
            fullName = this.getFirstName();
        }
        else {
            fullName = this.getFirstName() + " " + this.getLastName();
        }
        return fullName;
    }
}