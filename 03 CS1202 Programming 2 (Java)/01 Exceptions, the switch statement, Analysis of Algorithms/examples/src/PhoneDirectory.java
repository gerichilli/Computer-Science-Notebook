public class AssociationListsReview {
    private PhoneEntry[] data;
    private int dataCount;
    private static class PhoneEntry {
        String name;
        String number;
    }

    public PhoneDirectory() {
        data = new PhoneEntry[1];
        dataCount = 0;
    }

}
