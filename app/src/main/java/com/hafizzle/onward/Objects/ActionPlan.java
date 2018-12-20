package com.hafizzle.onward.Objects;

public interface ActionPlan {
    //Name of the action
    void actionName(String action);

    //How often should user(s) update the action
    void progressUpdates(int updateLength);

    //Should the action be terminated if the progressUpdates are not on time?
    void actionTermination(boolean termination);

    //What is the total length the action should be?
    void actionLength(int actionLength);
}
