package com.mycompany.score.service.implement;

import com.mycompany.score.mock.RuleData;
import com.mycompany.score.model.Rule;
import com.mycompany.score.service.RuleService;

/**
 *
 * @author mbk_i
 */
public class RuleServiceImpl implements RuleService {

    @Override
    public Rule findRule(Integer id) {
        RuleData data = new RuleData();
        return data.getRules().stream()
                .filter(rule -> rule.getId().equals(id))
                .findAny()
                .orElse(null);
    }

}
