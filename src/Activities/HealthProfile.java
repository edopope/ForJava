package Activities;
import ClassActivities.Health;

import java.util.Scanner;
public class HealthProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Health health1 = new Health("jerry", "stanley", "male", 12, 30, 1994, 60, 49);
        int age = 2022 - health1.getYearOfBirth();
int heartRate = health1.getWeight() *1000 * age / 100 * age;
        System.out.printf("firstname--> %s%%n, lastname --> %s%n, age-->%d%n, gender-->%s%n, and your heartrate is --> %d%n",health1.getFirstName(),health1.getLastName(),age,health1.getGender(),heartRate);

    }
}