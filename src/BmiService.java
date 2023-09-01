public class BmiService {
    public int calculate (int heightInKg, double weightInM) {
        int result = (int)(heightInKg / (weightInM * weightInM));
        return result;
    }
}
