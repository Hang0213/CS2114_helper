/**
 * 
 */
package binarySearchTree;

/**
 * @author hanglyu
 *
 */
public class Contact implements Comparable<Object>{
    private String firstName;
    private String lastName;
    private String number;
    
    public Contact(String fName, String lName, String phoneNum) {
        firstName = fName;
        lastName = lName;
        number = phoneNum;
    }

    @Override
    /**
    * Compares two contacts and returns how they relate to each other
    * It first compares the lastName field, then the firstName, and finally
    * the phoneNumber. 
    * @param o object to compare
    */
    public int compareTo(Object o) {
        Contact a = (Contact)o;
        if(this.lastName.compareTo(a.lastName) > 0) {
            return 1;
        }
        else if(this.lastName.compareTo(a.lastName) < 0) {
            return -1;
        }
        else {
            if(this.firstName.compareTo(a.firstName) > 0) {
                return 1;
            }
            else if(this.firstName.compareTo(a.firstName) < 0) {
                return -1;
            }
            else {
                return this.number.compareTo(a.number);
            }
        }
    }

}
