package com.mycompany.score.service.implement;

import com.mycompany.score.mock.HsubAnswerData;
import com.mycompany.score.mock.QuestionExtensionRuleData;
import com.mycompany.score.model.HsubAnswer;
import com.mycompany.score.service.AssessmentService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mbk_i
 */
public class HsubAssessmentServiceImpl implements AssessmentService {

    @Override
    public int findGroupByHsub(String hcode) {
        HsubAnswerData hsubData = new HsubAnswerData();
        List<HsubAnswer> hsubAnswers = hsubData.getHsubAnswers().stream()
                .filter(hsubAmswer -> hsubAmswer.getHcode().equals(hcode))
                .collect(Collectors.toList());
        Integer resultGroup = checkQuestionExtensionRule(hsubAnswers);
        if (resultGroup != null) {
            return resultGroup;
        }
        int count3 = hsubAnswers.stream()
                .filter(ans -> ans.getAnswer().getValue().equals(3))
                .collect(Collectors.toList()).size();
        int count2 = hsubAnswers.stream()
                .filter(ans -> ans.getAnswer().getValue().equals(2))
                .collect(Collectors.toList()).size();
        int count1 = hsubAnswers.stream()
                .filter(ans -> ans.getAnswer().getValue().equals(1))
                .collect(Collectors.toList()).size();
        int count0 = hsubAnswers.stream()
                .filter(ans -> ans.getAnswer().getValue().equals(0))
                .collect(Collectors.toList()).size();
        int count8 = hsubAnswers.stream()
                .filter(ans -> ans.getAnswer().getValue().equals(0))
                .collect(Collectors.toList()).size();
        return calculate(count3, count2, count1, count0, count8);
    }

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

    private Integer checkQuestionExtensionRule(List<HsubAnswer> hsubAnswers) {
        QuestionExtensionRuleData questionExtensionRuleData = new QuestionExtensionRuleData();
        int count0WhenQusetionNot0 = hsubAnswers.stream()
                .filter(hsubAnswer -> questionExtensionRuleData.getQuestionExtensionRules().stream()
                .anyMatch(question -> question.getQuestion().equals(hsubAnswer.getQuestion())
                && hsubAnswer.getAnswer().getValue().equals(0)
                && question.getRule().getId().equals(1)))
                .collect(Collectors.toList()).size();
        if (count0WhenQusetionNot0 > 0) {
            return 5;
        }
        return null;
    }

}
