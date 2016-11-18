package com.previsto.model;

public class TermsOfPayment {

    private int offset;
    private DueType dueType;
    private String description;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public DueType getDueType() {
        return dueType;
    }

    public void setDueType(DueType dueType) {
        this.dueType = dueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
