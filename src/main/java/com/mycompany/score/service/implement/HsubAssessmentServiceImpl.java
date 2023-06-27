package com.mycompany.score.service.implement;

import com.mycompany.score.service.AssessmentService;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author mbk_i
 */
public class HsubAssessmentServiceImpl implements AssessmentService {

    @Override
    public int calculate(int count3, int count2, int count1, int count0, int count8) {
        int totalQustion = count3 + count2 + count1 + count0 + count8;
        BigDecimal percentOfAnswer23 = (BigDecimal.valueOf(count3 + count2).divide(new BigDecimal(totalQustion), 5, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        BigDecimal percentOfAnswer0 = (BigDecimal.valueOf(count0).divide(new BigDecimal(totalQustion), 5, RoundingMode.HALF_UP)).multiply(new BigDecimal(100));
        int gruopResult;
        if (count0 > 0) {
            if (percentOfAnswer0.compareTo(new BigDecimal(10)) == 1) {
                gruopResult = 5;
            } else {
                gruopResult = 4;
            }
        } else {
            if (count3 >= 1 && count1 == 0) {
                gruopResult = 1;
            } else if (percentOfAnswer23.compareTo(new BigDecimal(80)) >= 0) {
                gruopResult = 2;
            } else if (percentOfAnswer23.compareTo(new BigDecimal(50)) >= 0 && percentOfAnswer23.compareTo(new BigDecimal(80)) < 0) {
                gruopResult = 3;
            } else {
                gruopResult = 4;
            }
        }
        return gruopResult;
    }

}
