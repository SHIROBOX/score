package com.mycompany.score.service;

/**
 *
 * @author mbk_i
 */
public interface AssessmentService {

    public int findGroupByHsub(String hcode);

    public int calculate(int count3, int count2, int count1, int count0, int count8);

}
