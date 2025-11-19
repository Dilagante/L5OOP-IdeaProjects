package librarycentre_package;

public class Magazine extends Item{

    private int issueNumber;
    private PublicationFrequency publicationFrequency;
    private String editor;

    public Magazine(String title, String ISBN) {
        super(title, ISBN);
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setPublicationFrequency(PublicationFrequency publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    public PublicationFrequency getPublicationFrequency(){
        return publicationFrequency;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getEditor() {
        return editor;
    }

    @Override
    public String toString() {
        return super.toString() + ",Issue Number: " + issueNumber +
                ", Publication Frequency: " + publicationFrequency +
                ", Editor: " + editor;
    }

}
