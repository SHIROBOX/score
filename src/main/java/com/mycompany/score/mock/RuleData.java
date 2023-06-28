package com.mycompany.score.mock;

import com.mycompany.score.model.Rule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class RuleData {

    private List<Rule> rules = new ArrayList<>();

    public RuleData() {
        rules.add(new Rule(1, "หากเลือกคะแนนเป็น 0 จะอยู่กลุ่ม 5 ทันที"));
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

}
