package com.mycompany.score.service.implement;

import com.mycompany.score.mock.QuestionExtensionRuleData;
import com.mycompany.score.model.Question;
import com.mycompany.score.model.Rule;
import com.mycompany.score.service.QuestionExtensionRuleService;

/**
 *
 * @author mbk_i
 */
public class QuestionExtensionRuleServiceImpl implements QuestionExtensionRuleService {

    @Override
    public boolean IsQuestionNotZero(Question question) {
        QuestionExtensionRuleData questionExtensionRuleData = new QuestionExtensionRuleData();
        return questionExtensionRuleData.getQuestionExtensionRules().stream()
                .anyMatch(questionExtensionRule -> questionExtensionRule.getQuestion().equals(question) 
                        && questionExtensionRule.getRule().equals(Rule.NOTZERO));
    }

}
