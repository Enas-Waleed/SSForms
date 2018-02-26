package it.starksoftware.ssform.model;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import it.starksoftware.ssform.adapter.FormAttachAdapter;


public class FormElementToken implements FormObject {


    // private variables
    private int mTag; // unique tag to identify the object
    private int mType; // type for the form element
    private String mTitle; // title to be shown on left
    private ArrayList<TokesTags> mValue; // value to be shown on right
    private ArrayList<FormTokenObject> mOptions; // list of options for single and multi picker
    private List<String> mOptionsSelected; // list of selected options for single and multi picker
    private Context mCtx;
    private boolean visibility = true;

    public FormElementToken() {
    }


    public static FormElementToken createInstance() {
        return new FormElementToken();
    }

    public FormElementToken setVisibility(boolean visibility) {
        this.visibility = visibility;
        return this;
    }
    public boolean getVisibility() {
        return visibility;
    }


    // getters and setters
    public FormElementToken setTag(int mTag) {
        this.mTag = mTag;
        return this;
    }

    public FormElementToken setContext(Context ctx) {
        this.mCtx = ctx;
        return this;
    }

    public FormElementToken setType(int mType) {
        this.mType = mType;
        return this;
    }

    public FormElementToken setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }

    public FormElementToken setValue(ArrayList<TokesTags> mValue) {
        this.mValue = mValue;
        return this;
    }

    public ArrayList<TokesTags> getValue() {
        return mValue;
    }

    public FormElementToken setOptionsSelected(List<String> mOptionsSelected) {
        this.mOptionsSelected = mOptionsSelected;
        return this;
    }

    public int getTag() {
        return mTag;
    }

    public int getType() {
        return mType;
    }

    public String getTitle() {
        return mTitle;
    }



    public ArrayList<FormTokenObject> getTokensObject() {
        return mOptions;
    }

    public FormElementToken setTokensObject(ArrayList<FormTokenObject> mOptions) {
        this.mOptions = mOptions;
        return this;
    }




    public List<String> getOptionsSelected() {
        return (mOptionsSelected == null) ? new ArrayList<String>() : mOptionsSelected;
    }

    @Override
    public boolean isHeader() {
        return false;
    }

    @Override
    public String getElementType() {

        return "Token";
    }

    @Override
    public String toString() {
        return "TAG: " + String.valueOf(this.mTag) + ", TITLE: " + this.mTitle + ", VALUE: " + this.mValue ;
    }
}
