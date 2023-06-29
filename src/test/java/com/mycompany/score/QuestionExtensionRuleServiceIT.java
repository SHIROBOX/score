package com.mycompany.score;

import com.mycompany.score.service.QuestionExtensionRuleService;
import com.mycompany.score.service.QuestionService;
import com.mycompany.score.service.implement.QuestionExtensionRuleServiceImpl;
import com.mycompany.score.service.implement.QuestionServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 *
 * @author mbk_i
 */
public class QuestionExtensionRuleServiceIT {

    public static QuestionExtensionRuleService questionExtensionRuleService = new QuestionExtensionRuleServiceImpl();

    public static QuestionService questionService = new QuestionServiceImpl();

    @Test
    public void IsQuestionNotZero() {
        Assertions.assertThat(questionExtensionRuleService.IsQuestionNotZero(questionService.findQuestion(3))).isEqualTo(true);
    }

}
