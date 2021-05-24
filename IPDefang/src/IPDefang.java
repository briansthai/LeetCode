package IPDefang.src;

/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * Constraints:
 * The given address is a valid IPv4 address.
 * 
 * Example:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
*/
public class IPDefang {
    public static void main(String[] args) throws Exception {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) 
    {
        return address.replace(".", "[.]");
        //We can also use a REGEX statement as shown below, however in this case it is slower
        //return address.replace("\\.", "[.]");
    }
}
