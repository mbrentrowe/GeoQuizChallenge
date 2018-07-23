package com.bignerdranch.android.geoquiz;

public class Question {

    private int mTextResID;
    private Boolean mAnswerTrue;

    public Question(int textResId,boolean answerTrue) {
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public Boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(Boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
