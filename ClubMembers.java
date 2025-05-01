import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;
    /** Adds new club members to memberList, as described in part (a).
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear)
    { /* to be implemented in part (a) */
        for (String name: names) {
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }
    /** Removes members who have graduated and returns a list of members who have graduated
     * and are in good standing, as described in part (b).
     */
    public ArrayList<MemberInfo> removeMembers(int year)
    { /* to be implemented in part (b) */
        for (int i = memberList.size()-1; i >= 0; i--) {
            if (memberList.get(i).getGradYear() > year) {
                memberList.remove(i);
            }
        }
        ArrayList<MemberInfo> goodStandingMembers =  new ArrayList<MemberInfo>();
        for (int i = 0; i < memberList.size(); i++) {
            if (!memberList.get(i).inGoodStanding()) {
                goodStandingMembers.add(memberList.get(i));
            }
        }
        return goodStandingMembers;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
