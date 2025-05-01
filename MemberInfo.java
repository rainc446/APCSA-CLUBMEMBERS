public class MemberInfo
{
    /** Constructs a MemberInfo object for the club member with name name,
     * graduation year gradYear, and standing hasGoodStanding.
     */

    private int gradYear;
    private String memberName;
    private boolean standing;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    { /* implementation not shown */
        this.gradYear = gradYear;
        memberName = name;
        standing = hasGoodStanding;
    }
    /** Returns the graduation year of the club member. */
    public int getGradYear()
    { /* implementation not shown */
        return gradYear;
    }
    /** Returns true if the member is in good standing and false otherwise. */
    public boolean inGoodStanding()
    { /* implementation not shown */
        return standing;
    }
    public String toString() {
        return memberName + ", " + gradYear + ", " + standing;
    }


// There may be instance variables, constructors, and methods that are not shown.
}