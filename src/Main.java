import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String avg[]) {
        Basketball b1 = new Basketball();
        Basketball b2 = new Basketball();
        List<Sport> sportList = Arrays.asList(b1, b2);
        Benutzer ben1 = new Benutzer("Ionel","masca", sportList);
        System.out.println(ben1.kalkuliereDurchschnittszeit());
    }
}
