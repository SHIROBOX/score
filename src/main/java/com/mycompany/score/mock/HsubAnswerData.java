package com.mycompany.score.mock;

import com.mycompany.score.model.HsubAnswer;
import com.mycompany.score.service.AnswerService;
import com.mycompany.score.service.QuestionService;
import com.mycompany.score.service.implement.AnswerServiceImpl;
import com.mycompany.score.service.implement.QuestionServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mbk_i
 */
public class HsubAnswerData {

    QuestionService questionService = new QuestionServiceImpl();

    AnswerService answerService = new AnswerServiceImpl();

    private List<HsubAnswer> hsubAnswers = new ArrayList<>();

    public HsubAnswerData() {
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(1), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(2), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(3), answerService.findAnswer(1)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(4), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(5), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(6), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(7), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(8), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(9), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(10), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(11), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(12), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(13), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(14), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(15), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(16), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(17), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(18), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(19), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(21), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(22), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(23), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(24), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(25), answerService.findAnswer(5)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(26), answerService.findAnswer(5)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(27), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(41), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(42), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(43), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(44), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(45), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(46), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(47), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(48), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(49), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(50), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(51), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(52), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(53), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(54), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("13814", questionService.findQuestion(55), answerService.findAnswer(4)));

        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(1), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(2), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(3), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(4), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(5), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(6), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(7), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(8), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(9), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(10), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(11), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(12), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(13), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(14), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(15), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(16), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(17), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(18), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(19), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(21), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(22), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(23), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(24), answerService.findAnswer(4)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(25), answerService.findAnswer(5)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(26), answerService.findAnswer(5)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(27), answerService.findAnswer(3)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(41), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(42), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(43), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(44), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(45), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(46), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(47), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(48), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(49), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(50), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(51), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(52), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(53), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(54), answerService.findAnswer(2)));
        hsubAnswers.add(new HsubAnswer("10660", questionService.findQuestion(55), answerService.findAnswer(2)));
    }

    public List<HsubAnswer> findByHcode(String hcode) {
        return hsubAnswers.stream()
                .filter(hsubAmswer -> hsubAmswer.getHcode().equals(hcode))
                .collect(Collectors.toList());
    }

    public List<HsubAnswer> getHsubAnswers() {
        return hsubAnswers;
    }

    public void setHsubAnswers(List<HsubAnswer> hsubAnswers) {
        this.hsubAnswers = hsubAnswers;
    }

}
