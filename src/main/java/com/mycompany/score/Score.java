package com.mycompany.score;

import com.mycompany.score.service.implement.HsubAssessmentServiceImpl;
import com.mycompany.score.service.AssessmentService;

/**
 *
 * @author mbk_i
 */
public class Score {

    public static AssessmentService service = new HsubAssessmentServiceImpl();

    public static void main(String[] args) {
        System.out.println("===================================================================");
        System.out.println("======================== Training 1 ===============================");
        System.out.println("===================================================================");
        System.out.println("group : " + service.findGroupByHsub("13814"));
    }
}
