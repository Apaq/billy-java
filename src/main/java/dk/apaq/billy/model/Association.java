package dk.apaq.billy.model;

public class Association {

    private String subjectReference;

    public Association() {
    }

    public Association(String subjectReference) {
        this.subjectReference = subjectReference;
    }

    public String getSubjectReference() {
        return subjectReference;
    }

    public void setSubjectReference(String subjectReference) {
        this.subjectReference = subjectReference;
    }
}
