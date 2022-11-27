import com.qbw.algorithm.AlgorithmApplication;
import com.qbw.algorithm.util.PrintUtil;
import javafx.util.Pair;
import org.apache.logging.log4j.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author qiubw
 * @description
 * @since 2022/10/18 23:35
 */
@SpringBootTest(classes = {AlgorithmApplication.class})
@RunWith(SpringRunner.class)
public class AlgorithmTest {

    @Autowired
    private PrintUtil printUtil;
    private int mod = (int) (10e9 + 7);

    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(a, b % a);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long lcm = a / gcd(a, b) * b;   // 最小公倍数 = a * b / 最大公约数
        long l = 0;
        long r = (long) Math.max(a, b) * n;
        while (l + 1 < r) {
            long m = l + (r - l) / 2;
            if (m / a + m / b - m / lcm >= n) {
                r = m;
            } else {
                l = m;
            }
        }

        return (int) (r % mod);
    }

    public int countBalls(int lowLimit, int highLimit) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; ++i) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp;
                temp /= 10;
            }
            int count = map.containsKey(sum) ? map.get(sum) + 1 : 1;
            res = res > count ? res : count;
            map.put(sum, count);
        }
        return res;
    }

    @Test
    public void test() {
        int[] a = new int[5];
        Arrays.fill(a, 1);
    }
}
