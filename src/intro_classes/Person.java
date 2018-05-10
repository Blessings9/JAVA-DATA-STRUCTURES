package intro_classes;

public class Person {
    private String givenName;
    private String familyName;
    private String IDnumber;
    private int birthYear = 1900;

    private static final int VOTE_AGE = 18;
    private static final int SENIOR_CITIZEN = 65;

    //Constructors
    /*
    @param first the Given name
    @param family the family name
    @param ID the ID
    @param birth the birth year
     */

    public Person(String first, String family,String ID, int birth) {
        this.givenName = first;
        this.familyName = family;
        this.IDnumber = ID;
        this.birthYear = birth;

    }

    /*
    Construct a person with only the ID specified
    @param ID the ID number
     */
    public Person(String ID) {
        IDnumber = ID;
    }
    /*
    Setter methods for the class properties
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    /*
    Getter methods for the class properties
     */

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static int getVoteAge() {
        return VOTE_AGE;
    }

    public static int getSeniorCitizen() {
        return SENIOR_CITIZEN;
    }
}
