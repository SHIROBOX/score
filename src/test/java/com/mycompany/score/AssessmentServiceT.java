package com.mycompany.score;

import com.mycompany.score.mock.HsubAnswerData;
import com.mycompany.score.mock.QuestionExtensionRuleData;
import com.mycompany.score.model.HsubAnswer;
import com.mycompany.score.service.AssessmentService;
import com.mycompany.score.service.implement.HsubAssessmentServiceImpl;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.assertj.core.api.Assertions;

/**
 *
 * @author mbk_i
 */
public class AssessmentServiceT {

    public static AssessmentService service = new HsubAssessmentServiceImpl();

    @Test
    public void calculatGroupReturn1() {
        Assertions.assertThat(service.calculate(32, 16, 0, 0, 0)).isEqualTo(1);
        Assertions.assertThat(service.calculate(1, 47, 0, 0, 0)).isEqualTo(1);
        Assertions.assertThat(service.calculate(1, 0, 0, 0, 47)).isEqualTo(1);
        Assertions.assertThat(service.calculate(24, 24, 0, 0, 0)).isEqualTo(1);
    }

    @Test
    public void calculatGroupReturn2() {
        Assertions.assertThat(service.calculate(0, 80, 20, 0, 0)).isEqualTo(2);
        Assertions.assertThat(service.calculate(1, 80, 19, 0, 0)).isEqualTo(2);
        Assertions.assertThat(service.calculate(0, 80, 0, 0, 20)).isEqualTo(2);
        Assertions.assertThat(service.calculate(1, 80, 1, 0, 18)).isEqualTo(2);
        Assertions.assertThat(service.calculate(1, 80, 1, 0, 19)).isEqualTo(2);
        Assertions.assertThat(service.calculate(80, 1, 19, 0, 0)).isEqualTo(2);
        Assertions.assertThat(service.calculate(80, 1, 1, 0, 18)).isEqualTo(2);
        Assertions.assertThat(service.calculate(80, 0, 1, 0, 10)).isEqualTo(2);
    }

    @Test
    public void calculatGroupReturn3() {
        Assertions.assertThat(service.calculate(0, 80, 21, 0, 0)).isEqualTo(3);
        Assertions.assertThat(service.calculate(79, 1, 21, 0, 0)).isEqualTo(3);
        Assertions.assertThat(service.calculate(0, 51, 50, 0, 0)).isEqualTo(3);
        Assertions.assertThat(service.calculate(1, 50, 50, 0, 0)).isEqualTo(3);
        Assertions.assertThat(service.calculate(0, 80, 0, 0, 21)).isEqualTo(3);
        Assertions.assertThat(service.calculate(79, 1, 1, 0, 20)).isEqualTo(3);
        Assertions.assertThat(service.calculate(0, 51, 0, 0, 50)).isEqualTo(3);
        Assertions.assertThat(service.calculate(1, 50, 1, 0, 49)).isEqualTo(3);
    }

    @Test
    public void calculatGroupReturn4() {
        Assertions.assertThat(service.calculate(0, 49, 51, 0, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(1, 48, 51, 0, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(0, 30, 60, 10, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(1, 29, 60, 10, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(0, 49, 41, 10, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(1, 48, 41, 10, 0)).isEqualTo(4);
        Assertions.assertThat(service.calculate(0, 49, 0, 0, 51)).isEqualTo(4);
        Assertions.assertThat(service.calculate(1, 48, 0, 0, 51)).isEqualTo(1);
        Assertions.assertThat(service.calculate(20, 60, 10, 10, 10)).isEqualTo(4);
        Assertions.assertThat(service.calculate(0, 0, 30, 10, 60)).isEqualTo(4);
        Assertions.assertThat(service.calculate(0, 49, 0, 10, 41)).isEqualTo(4);
        Assertions.assertThat(service.calculate(1, 48, 0, 10, 41)).isEqualTo(4);

    }

    @Test
    public void calculatGroupReturn5() {
        Assertions.assertThat(service.calculate(40, 40, 9, 11, 0)).isEqualTo(5);
        Assertions.assertThat(service.calculate(25, 25, 39, 11, 0)).isEqualTo(5);
        Assertions.assertThat(service.calculate(24, 25, 40, 11, 0)).isEqualTo(5);
        Assertions.assertThat(service.calculate(40, 40, 0, 11, 9)).isEqualTo(5);
        Assertions.assertThat(service.calculate(25, 25, 0, 11, 39)).isEqualTo(5);
        Assertions.assertThat(service.calculate(24, 25, 0, 11, 40)).isEqualTo(5);
        Assertions.assertThat(service.calculate(0, 0, 80, 11, 9)).isEqualTo(5);
        Assertions.assertThat(service.calculate(0, 0, 50, 11, 39)).isEqualTo(5);
        Assertions.assertThat(service.calculate(0, 0, 49, 11, 40)).isEqualTo(5);
    }

    @Test
    public void haveQuestionExtensionRule() {
        QuestionExtensionRuleData questionExtensionRuleData = new QuestionExtensionRuleData();
        HsubAnswerData hsubAnswerData = new HsubAnswerData();
        int count0WhenQusetionNot0 = hsubAnswerData.getHsubAnswers().stream().filter(hsubAns -> questionExtensionRuleData.getQuestionExtensionRules().stream()
                .anyMatch(question -> question.getQuestion().equals(hsubAns.getQuestion())
                && hsubAns.getAnswer().getValue().equals(0)
                && question.getRule().getId().equals(1)))
                .collect(Collectors.toList()).size();
        Assertions.assertThat(count0WhenQusetionNot0 > 0).isEqualTo(true);
    }

}
