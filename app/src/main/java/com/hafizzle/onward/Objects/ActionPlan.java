package com.hafizzle.onward.Objects;

public class ActionPlan {

    private String actionName;
    private int updateLength;
    private Boolean termination;
    private int actionLength;

    public ActionPlan(String actionName, int updateLength, Boolean termination, int actionLength) {
        this.actionName = actionName;
        this.updateLength = updateLength;
        this.termination = termination;
        this.actionLength = actionLength;
    }

    public ActionPlan(String actionName, int updateLength, int actionLength) {
        this.actionName = actionName;
        this.updateLength = updateLength;
        this.actionLength = actionLength;
        this.termination = false;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setUpdateLength(int updateLength) {
        this.updateLength = updateLength;
    }

    public void setTermination(Boolean termination) {
        this.termination = termination;
    }

    public void setActionLength(int actionLength) {
        this.actionLength = actionLength;
    }
}
