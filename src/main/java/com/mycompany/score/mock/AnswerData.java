package com.mycompany.score.mock;

import com.mycompany.score.model.Answer;
import com.mycompany.score.service.QuestionService;
import com.mycompany.score.service.implement.QuestionServiceImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class AnswerData {

    QuestionService service = new QuestionServiceImpl();

    private List<Answer> answers = new ArrayList<>();

    public AnswerData() {
        answers.add(new Answer(1, service.findQuestion(1), 0));
        answers.add(new Answer(2, service.findQuestion(1), 1));
        answers.add(new Answer(3, service.findQuestion(1), 2));
        answers.add(new Answer(4, service.findQuestion(1), 3));
        answers.add(new Answer(1, service.findQuestion(2), 0));
        answers.add(new Answer(2, service.findQuestion(2), 1));
        answers.add(new Answer(3, service.findQuestion(2), 2));
        answers.add(new Answer(1, service.findQuestion(3), 0));
        answers.add(new Answer(2, service.findQuestion(3), 1));
        answers.add(new Answer(3, service.findQuestion(3), 2));
        answers.add(new Answer(4, service.findQuestion(3), 3));
        answers.add(new Answer(1, service.findQuestion(4), 0));
        answers.add(new Answer(2, service.findQuestion(4), 1));
        answers.add(new Answer(3, service.findQuestion(4), 2));
        answers.add(new Answer(1, service.findQuestion(5), 0));
        answers.add(new Answer(2, service.findQuestion(5), 1));
        answers.add(new Answer(3, service.findQuestion(5), 2));
        answers.add(new Answer(4, service.findQuestion(5), 3));
        answers.add(new Answer(1, service.findQuestion(6), 0));
        answers.add(new Answer(2, service.findQuestion(6), 1));
        answers.add(new Answer(3, service.findQuestion(6), 2));
        answers.add(new Answer(4, service.findQuestion(6), 3));
        answers.add(new Answer(1, service.findQuestion(7), 0));
        answers.add(new Answer(2, service.findQuestion(7), 1));
        answers.add(new Answer(3, service.findQuestion(7), 2));
        answers.add(new Answer(4, service.findQuestion(7), 3));
        answers.add(new Answer(1, service.findQuestion(8), 0));
        answers.add(new Answer(2, service.findQuestion(8), 1));
        answers.add(new Answer(3, service.findQuestion(8), 2));
        answers.add(new Answer(4, service.findQuestion(8), 3));
        answers.add(new Answer(1, service.findQuestion(9), 0));
        answers.add(new Answer(2, service.findQuestion(9), 1));
        answers.add(new Answer(3, service.findQuestion(9), 2));
        answers.add(new Answer(4, service.findQuestion(9), 3));
        answers.add(new Answer(1, service.findQuestion(10), 0));
        answers.add(new Answer(2, service.findQuestion(10), 1));
        answers.add(new Answer(3, service.findQuestion(10), 2));
        answers.add(new Answer(4, service.findQuestion(10), 3));
        answers.add(new Answer(1, service.findQuestion(11), 0));
        answers.add(new Answer(2, service.findQuestion(11), 1));
        answers.add(new Answer(3, service.findQuestion(11), 2));
        answers.add(new Answer(4, service.findQuestion(11), 3));
        answers.add(new Answer(1, service.findQuestion(12), 1));
        answers.add(new Answer(2, service.findQuestion(12), 2));
        answers.add(new Answer(3, service.findQuestion(12), 3));
        answers.add(new Answer(4, service.findQuestion(12), 8));
        answers.add(new Answer(1, service.findQuestion(13), 0));
        answers.add(new Answer(2, service.findQuestion(13), 1));
        answers.add(new Answer(3, service.findQuestion(13), 2));
        answers.add(new Answer(4, service.findQuestion(13), 3));
        answers.add(new Answer(1, service.findQuestion(14), 0));
        answers.add(new Answer(2, service.findQuestion(14), 1));
        answers.add(new Answer(3, service.findQuestion(14), 2));
        answers.add(new Answer(4, service.findQuestion(14), 3));
        answers.add(new Answer(1, service.findQuestion(15), 0));
        answers.add(new Answer(2, service.findQuestion(15), 1));
        answers.add(new Answer(3, service.findQuestion(15), 2));
        answers.add(new Answer(4, service.findQuestion(15), 3));
        answers.add(new Answer(1, service.findQuestion(16), 0));
        answers.add(new Answer(2, service.findQuestion(16), 1));
        answers.add(new Answer(3, service.findQuestion(16), 2));
        answers.add(new Answer(4, service.findQuestion(16), 3));
        answers.add(new Answer(1, service.findQuestion(17), 0));
        answers.add(new Answer(2, service.findQuestion(17), 1));
        answers.add(new Answer(3, service.findQuestion(17), 2));
        answers.add(new Answer(4, service.findQuestion(17), 3));
        answers.add(new Answer(1, service.findQuestion(18), 0));
        answers.add(new Answer(2, service.findQuestion(18), 1));
        answers.add(new Answer(3, service.findQuestion(18), 2));
        answers.add(new Answer(4, service.findQuestion(18), 3));
        answers.add(new Answer(1, service.findQuestion(19), 0));
        answers.add(new Answer(2, service.findQuestion(19), 1));
        answers.add(new Answer(3, service.findQuestion(19), 2));
        answers.add(new Answer(4, service.findQuestion(19), 3));
        answers.add(new Answer(5, service.findQuestion(19), 8));
        answers.add(new Answer(1, service.findQuestion(21), 0));
        answers.add(new Answer(2, service.findQuestion(21), 1));
        answers.add(new Answer(3, service.findQuestion(21), 2));
        answers.add(new Answer(4, service.findQuestion(21), 3));
        answers.add(new Answer(1, service.findQuestion(22), 0));
        answers.add(new Answer(2, service.findQuestion(22), 1));
        answers.add(new Answer(3, service.findQuestion(22), 2));
        answers.add(new Answer(4, service.findQuestion(22), 3));
        answers.add(new Answer(1, service.findQuestion(23), 0));
        answers.add(new Answer(2, service.findQuestion(23), 1));
        answers.add(new Answer(3, service.findQuestion(23), 2));
        answers.add(new Answer(4, service.findQuestion(23), 3));
        answers.add(new Answer(5, service.findQuestion(23), 8));
        answers.add(new Answer(1, service.findQuestion(24), 0));
        answers.add(new Answer(2, service.findQuestion(24), 1));
        answers.add(new Answer(3, service.findQuestion(24), 2));
        answers.add(new Answer(4, service.findQuestion(24), 3));
        answers.add(new Answer(5, service.findQuestion(24), 8));
        answers.add(new Answer(1, service.findQuestion(25), 0));
        answers.add(new Answer(2, service.findQuestion(25), 1));
        answers.add(new Answer(3, service.findQuestion(25), 2));
        answers.add(new Answer(4, service.findQuestion(25), 3));
        answers.add(new Answer(5, service.findQuestion(25), 8));
        answers.add(new Answer(1, service.findQuestion(26), 0));
        answers.add(new Answer(2, service.findQuestion(26), 1));
        answers.add(new Answer(3, service.findQuestion(26), 2));
        answers.add(new Answer(4, service.findQuestion(26), 3));
        answers.add(new Answer(5, service.findQuestion(26), 8));
        answers.add(new Answer(1, service.findQuestion(27), 0));
        answers.add(new Answer(2, service.findQuestion(27), 1));
        answers.add(new Answer(3, service.findQuestion(27), 2));
        answers.add(new Answer(4, service.findQuestion(27), 8));
        answers.add(new Answer(1, service.findQuestion(41), 0));
        answers.add(new Answer(2, service.findQuestion(41), 1));
        answers.add(new Answer(3, service.findQuestion(41), 2));
        answers.add(new Answer(4, service.findQuestion(41), 3));
        answers.add(new Answer(1, service.findQuestion(42), 0));
        answers.add(new Answer(2, service.findQuestion(42), 1));
        answers.add(new Answer(3, service.findQuestion(42), 2));
        answers.add(new Answer(4, service.findQuestion(42), 3));
        answers.add(new Answer(1, service.findQuestion(43), 0));
        answers.add(new Answer(2, service.findQuestion(43), 1));
        answers.add(new Answer(3, service.findQuestion(43), 2));
        answers.add(new Answer(4, service.findQuestion(43), 3));
        answers.add(new Answer(1, service.findQuestion(44), 0));
        answers.add(new Answer(2, service.findQuestion(44), 1));
        answers.add(new Answer(3, service.findQuestion(44), 2));
        answers.add(new Answer(4, service.findQuestion(44), 3));
        answers.add(new Answer(1, service.findQuestion(45), 0));
        answers.add(new Answer(2, service.findQuestion(45), 1));
        answers.add(new Answer(3, service.findQuestion(45), 2));
        answers.add(new Answer(4, service.findQuestion(45), 3));
        answers.add(new Answer(1, service.findQuestion(46), 0));
        answers.add(new Answer(2, service.findQuestion(46), 1));
        answers.add(new Answer(3, service.findQuestion(46), 2));
        answers.add(new Answer(4, service.findQuestion(46), 3));
        answers.add(new Answer(1, service.findQuestion(47), 0));
        answers.add(new Answer(2, service.findQuestion(47), 1));
        answers.add(new Answer(3, service.findQuestion(47), 2));
        answers.add(new Answer(4, service.findQuestion(47), 3));
        answers.add(new Answer(1, service.findQuestion(48), 0));
        answers.add(new Answer(2, service.findQuestion(48), 1));
        answers.add(new Answer(3, service.findQuestion(48), 2));
        answers.add(new Answer(4, service.findQuestion(48), 3));
        answers.add(new Answer(1, service.findQuestion(49), 0));
        answers.add(new Answer(2, service.findQuestion(49), 1));
        answers.add(new Answer(3, service.findQuestion(49), 2));
        answers.add(new Answer(4, service.findQuestion(49), 3));
        answers.add(new Answer(1, service.findQuestion(50), 0));
        answers.add(new Answer(2, service.findQuestion(50), 1));
        answers.add(new Answer(3, service.findQuestion(50), 2));
        answers.add(new Answer(4, service.findQuestion(50), 3));
        answers.add(new Answer(1, service.findQuestion(51), 0));
        answers.add(new Answer(2, service.findQuestion(51), 1));
        answers.add(new Answer(3, service.findQuestion(51), 2));
        answers.add(new Answer(4, service.findQuestion(51), 3));
        answers.add(new Answer(1, service.findQuestion(52), 0));
        answers.add(new Answer(2, service.findQuestion(52), 1));
        answers.add(new Answer(3, service.findQuestion(52), 2));
        answers.add(new Answer(4, service.findQuestion(52), 3));
        answers.add(new Answer(1, service.findQuestion(53), 0));
        answers.add(new Answer(2, service.findQuestion(53), 1));
        answers.add(new Answer(3, service.findQuestion(53), 2));
        answers.add(new Answer(4, service.findQuestion(53), 3));
        answers.add(new Answer(1, service.findQuestion(54), 0));
        answers.add(new Answer(2, service.findQuestion(54), 1));
        answers.add(new Answer(3, service.findQuestion(54), 2));
        answers.add(new Answer(4, service.findQuestion(54), 3));
        answers.add(new Answer(1, service.findQuestion(55), 0));
        answers.add(new Answer(2, service.findQuestion(55), 1));
        answers.add(new Answer(3, service.findQuestion(55), 2));
        answers.add(new Answer(4, service.findQuestion(55), 3));
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

}
