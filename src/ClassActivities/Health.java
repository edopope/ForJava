package ClassActivities;

public class Health {
    private String firstName;
    private String lastName;
    private String gender;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private int height;
    private int weight;

    public Health(String firstName, String lastName, String gender, int monthOfBirth, int dayOfBirth, int yearOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        if (monthOfBirth > 0) {
            this.monthOfBirth = monthOfBirth;
        }
        if (dayOfBirth > 0) {
            this.dayOfBirth = dayOfBirth;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        }
        if (height > 0) {
            this.height = height;
        }
        if (weight > 0) {
            this.weight = weight;
        }


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    int age = 0;


    }
