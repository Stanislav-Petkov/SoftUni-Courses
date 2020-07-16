public class InvalidFieldCause {
    private String fieldName;
    private String failReason;

    public InvalidFieldCause(String fieldName, String failReason) {
        this.fieldName = fieldName;
        this.failReason = failReason;
    }

    @Override
    public String toString() {
        return "InvalidFieldCause{" +
                "fieldName='" + fieldName + '\'' +
                ", failReason='" + failReason + '\'' +
                '}';
    }
}
