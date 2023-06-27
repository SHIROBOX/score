package com.mycompany.score.service.implement;

import com.mycompany.score.mock.AnswerData;
import com.mycompany.score.model.Answer;
import com.mycompany.score.service.AnswerService;

/**
 *
 * @author mbk_i
 */
public class AnswerServiceImpl implements AnswerService {

    @Override
    public Answer findAnswer(Integer id) {
        AnswerData datas = new AnswerData();
        return datas.getAnswers().stream()
                .filter(question -> question.getId().equals(id))
                .findAny()
                .orElse(null);
    }

}
