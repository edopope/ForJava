package Chapter7;

public class ForArray {
    public static void main(String[] args) {
        String[] [] hotels = {{"golden tulip", "radisson blue", "intercontinental hotel"},{"revlon","rose of sharon"}, {"Silver walls", "Five-star"}};
        for (int counter = 0; counter < hotels.length; counter++) {
            String[] hotelsInnerArray = hotels[counter];

            for (int i = 0; i < hotelsInnerArray.length ; i++) {
                System.out.println(hotelsInnerArray[i]);
            }

        }
    }
}