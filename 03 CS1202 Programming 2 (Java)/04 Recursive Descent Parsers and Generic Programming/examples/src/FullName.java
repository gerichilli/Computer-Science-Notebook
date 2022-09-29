public class FullName implements Comparable<FullName> {
    private String firstName, lastName;  // Non-null first and last names.

    public FullName(String first, String last) {  // Constructor.
        if (first == null || last == null)
            throw new IllegalArgumentException("Names must be non-null.");
        firstName = first;
        lastName = last;
    }

    public boolean equals(Object obj) {
        try {
            FullName other = (FullName)obj;  // Type-cast obj to type FullName
            return firstName.equals(other.firstName)
                    && lastName.equals(other.lastName);
        }
        catch (Exception e) {
            return false;  // if obj is null or is not of type FullName
        }
    }

    public int compareTo(FullName other) {
        int compareLast = lastName.compareTo(other.lastName);
        if(compareLast < 0) {
            return  -1;
        } else if(compareLast > 0) {
            return  1;
        } else {
            return firstName.compareTo(other.firstName);
        }
    }
}
