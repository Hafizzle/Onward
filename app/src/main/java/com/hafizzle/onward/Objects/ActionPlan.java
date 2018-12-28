package com.hafizzle.onward.Objects;

public class ActionPlan {

    private String actionName;
    private int updateLength;
    private Boolean termination;
    private int actionLength;
    public String participant1;
    public String participant2;

    public ActionPlan(String actionName, int updateLength, Boolean termination, int actionLength, String participant1, String participant2) {
        this.actionName = actionName;
        this.updateLength = updateLength;
        this.termination = termination;
        this.actionLength = actionLength;
        this.participant1 = participant1;
        this.participant2 = participant2;
    }

    public ActionPlan(String actionName, int updateLength, int actionLength) {
        this.actionName = actionName;
        this.updateLength = updateLength;
        this.actionLength = actionLength;
        this.termination = false;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getUpdateLength() {
        return updateLength;
    }

    public void setUpdateLength(int updateLength) {
        this.updateLength = updateLength;
    }

    public Boolean getTermination() {
        return termination;
    }

    public void setTermination(Boolean termination) {
        this.termination = termination;
    }

    public int getActionLength() {
        return actionLength;
    }

    public void setActionLength(int actionLength) {
        this.actionLength = actionLength;
    }

    public String getParticipant1() {
        return participant1;
    }

    public void setParticipant1(String participant1) {
        this.participant1 = participant1;
    }

    public String getParticipant2() {
        return participant2;
    }

    public void setParticipant2(String participant2) {
        this.participant2 = participant2;
    }
}
