public class BonusMilesService {

    public int calculate(int price) {
        int bonus;
        if (price >= 20) {
            bonus = (price / 20);
        } else {
            bonus = 0;
        }
        return bonus;
    }

}
