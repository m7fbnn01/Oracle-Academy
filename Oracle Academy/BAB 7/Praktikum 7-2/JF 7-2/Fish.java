
public class Fish {

    String typeOfFish;
    int friendliness;

    // Constructor tanpa parameter
    public Fish() {
        typeOfFish = "Unknown";
        friendliness = 3;
    }

    // Constructor dengan parameter
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Getter
    public int getFriendliness() {
        return friendliness;
    }

    // Membandingkan dua ikan
    public static Fish nicestFish(Fish fish1, Fish fish2) {

        if (fish1.getFriendliness() > fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Variable argument method
    public static Fish nicestFish(Fish... fish) {

        if (fish.length == 0) {
            return null;
        }

        Fish temp = fish[0];

        for (int i = 1; i < fish.length; i++) {

            if (fish[i].getFriendliness() > temp.getFriendliness()) {
                temp = fish[i];
            }
        }

        return temp;
    }
}
