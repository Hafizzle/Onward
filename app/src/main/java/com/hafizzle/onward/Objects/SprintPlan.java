package com.hafizzle.onward.Objects;

public class SprintPlan extends ActionPlan {

    private String actionName;
    private int updateLength;
    private Boolean termination;
    private int actionLength;

    public SprintPlan(String actionName, int updateLength, Boolean termination, int actionLength) {
        super(actionName, updateLength, termination, actionLength);
    }


}
