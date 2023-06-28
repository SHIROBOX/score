package com.mycompany.score.mock;

import com.mycompany.score.model.QuestionExtensionRule;
import com.mycompany.score.service.QuestionService;
import com.mycompany.score.service.RuleService;
import com.mycompany.score.service.implement.QuestionServiceImpl;
import com.mycompany.score.service.implement.RuleServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class QuestionExtensionRuleData {

    QuestionService questionService = new QuestionServiceImpl();

    RuleService ruleService = new RuleServiceImpl();

    private List<QuestionExtensionRule> questionExtensionRules = new ArrayList<>();

    public QuestionExtensionRuleData() {
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(3), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(5), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(6), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(7), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(8), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(9), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(10), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(13), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(14), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(15), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(16), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(17), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(49), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(50), ruleService.findRule(1)));
        questionExtensionRules.add(new QuestionExtensionRule(questionService.findQuestion(53), ruleService.findRule(1)));
    }

    public List<QuestionExtensionRule> getQuestionExtensionRules() {
        return questionExtensionRules;
    }

    public void setQuestionExtensionRules(List<QuestionExtensionRule> questionExtensionRules) {
        this.questionExtensionRules = questionExtensionRules;
    }

}
