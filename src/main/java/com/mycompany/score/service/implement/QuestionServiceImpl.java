package com.mycompany.score.service.implement;

import com.mycompany.score.mock.QuestionData;
import com.mycompany.score.model.Question;
import com.mycompany.score.service.QuestionService;

/**
 *
 * @author mbk_i
 */
public class QuestionServiceImpl implements QuestionService {

    @Override
    public Question findQuestion(Integer id) {
        QuestionData data = new QuestionData();
        return data.getQuestions().stream()
                .filter(question -> question.getId().equals(id))
                .findAny()
                .orElse(null);
    }

}
