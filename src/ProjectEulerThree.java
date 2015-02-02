import java.util.ArrayList;

/**
 * Created by Eric on 2/1/2015.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    long num = 600851475143L;
    ArrayList<Long> factors = new ArrayList<Long>();
    long divider = 2;

    while (num > 1) {
      while ((num % divider) == 0) {
        factors.add(divider);
        num /= divider;
      }
      divider++;
    }
    System.out.println(factors.get(factors.size()-1));
  }
}
