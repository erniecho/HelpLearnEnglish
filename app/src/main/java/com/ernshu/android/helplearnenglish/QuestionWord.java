package com.ernshu.android.helplearnenglish;

/**
 * Created by erniecho on 4/15/16.
 */
public class QuestionWord {
    private String mWordStr;
    private String mWordPronStr;

    public QuestionWord (String textString)
    {
        StrHold[] tokens = textString.split(" , ");
        mWordStr = StrHold[0];
        mWordPronStr = StrHold[1];
    }

    public String getWordStr() {
        return mWordStr;
    }

    public void setWordStr(String wordStr) {
        mWordStr = wordStr;
    }

    public String getWordPronStr() {
        return mWordPronStr;
    }

    public void setWordPronStr(String wordPronStr) {
        mWordPronStr = wordPronStr;
    }
}
