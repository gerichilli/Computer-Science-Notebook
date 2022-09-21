import java.util.Arrays;
public class PhoneDirectory {
    private PhoneEntry[] data; // all the phone entries in the directory
    private int dataCount; // counting of the phone entries

    /**
     * An object type PhoneEntry, hold name - number pair
     */
    private static class PhoneEntry {
        String name;
        String number;
    }

    /**
     * Constructor, create an empty phone directory
     */
    public PhoneDirectory() {
        data = new PhoneEntry[1];
        dataCount = 0;
    }

    /**
     * Get index of the name in the phone directory
     */
    private int getIndex(String name) {
        for (int i = 0; i < dataCount; i++) {
            if(data[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Get a number of the name in the phone directory
     */
    public String getNumber(String name) {
        int numberIndex = getIndex(name);

        if(numberIndex < 0) {
            return null;
        } else {
            return data[numberIndex].number;
        }
    }

    /**
     * Put a name - number pair in the phone directory
     */

    public void put(String name, String number) {
        if(name == null || number == null) {
            throw new IllegalArgumentException("Name and number can not be null");
        }

        int numberIndex = getIndex(name);

        // The name already exists
        if(numberIndex >= 0) {
            data[numberIndex].number = number;
        }
        // The name does not exist => add it to the end of the array
        else {
            if(dataCount == data.length) {
                data = Arrays.copyOf(data, data.length * 2);
            }

            PhoneEntry newPhone = new PhoneEntry();
            newPhone.name = name;
            newPhone.number = number;
            data[dataCount] = newPhone;
            dataCount++;
        }
    }
}
