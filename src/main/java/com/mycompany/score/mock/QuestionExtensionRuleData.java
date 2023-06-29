package com.mycompany.score.mock;

import com.mycompany.score.model.QuestionExtensionRule;
import com.mycompany.score.model.Rule;
import com.mycompany.score.service.QuestionService;
import com.mycompany.score.service.implement.QuestionServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class QuestionExtensionRuleData {

    QuestionService questionService = new QuestionServiceImpl();

    private List<QuestionExtensionRule> questionExtensionRules = new ArrayList<>();

    public QuestionExtensionRuleData() {
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(3), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(5), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(6), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(7), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(8), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(9), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(10), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(13), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(14), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(15), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(16), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(17), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(49), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(50), Rule.NOTZERO));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(53), Rule.NOTZERO));
    }

    public List<QuestionExtensionRule> getQuestionExtensionRules() {
        return questionExtensionRules;
    }

    public void setQuestionExtensionRules(List<QuestionExtensionRule> questionExtensionRules) {
        this.questionExtensionRules = questionExtensionRules;
    }

}
