package intro_classes;

public class Person {
    private String givenName;
    private String familyName;
    private String IDNumber;
    private int birthYear = 1900;

    private static final int VOTE_AGE = 18;
    private static final int SENIOR_CITIZEN = 65;

    //Constructors
    /**
    @param first the Given name
    @param family the family name
    @param ID the ID
    @param birth the birth year
     */

    public Person(String first, String family,String ID, int birth) {
        this.givenName = first;
        this.familyName = family;
        this.IDNumber = ID;
        this.birthYear = birth;

    }

    /**
    Construct a person with only the ID specified
    @param ID the ID number
     */
    public Person(String ID) {
        IDNumber = ID;
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

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
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

    public String getIDNumber() {
        return IDNumber;
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

    // Other Methods

    /**
     * Calculates a person's age at this year's birthday.
     *
     * @param year The current year
     * @return the year minus the birth year
     */

    public int age(int year) {
        return year - birthYear;
    }

    /**
     * Determines whether a person can vote.
     *
     * @param year The current year
     * @return true if the person's age is greater than or
     * equal to the voting age
     */

    public boolean canVote(int year) {
        int theAge = age(year);
        return theAge >=VOTE_AGE;
    }

    /**
     * Determines whether a person is a senior citizen.
     *
     * @param year the current year
     * @return true if person's age is greater than or
     * equal to the age at which a person is
     * considered to be a senior citizen
     */

    public boolean isSenior(int year) {
        return age(year) >= SENIOR_CITIZEN;
    }

    /**
     * Retrieves the information in a Person object.
     *
     * @return the object state as a string
     */

    public String toStrig() {
        return "Given name: " + givenName + "\n"
                + "Family name: " + familyName + "\n"
                + "ID number: " + IDNumber + "\n"
                + "Year of birth: " + birthYear + "\n";

    }

    /**
     * Compares two Person objects for equality.
     *
     * @param per The second Person object
     * @return true if the Person objects have same
     * ID number; false if they don't
     */

    public boolean equals(Person per) {
        if (per == null)
            return false;
        else
            return IDNumber.equals(per.IDNumber);
    }


}
