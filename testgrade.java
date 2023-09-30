  package testgrade.java;

/**
 *
 * @author test03
 */
class gradeexception extends Exception {
     public static final char[] VALID_GRADES = {'A', 'B', 'C', 'D', 'F', 'I'};

    public gradeexception(String message) {
        super(message);
}
}
