public class Main {
    public static void main (String[] args) {
        MemberInfo[] membersOne = {
                new MemberInfo("SMITH JANE", 2019, false),
                new MemberInfo("FOX STEVE", 2018, true),
                new MemberInfo("XIN, MICHAEL", 2017, false),
                new MemberInfo("GARCIA, MARIA", 2018, true),
        };
        ClubMembers one = new ClubMembers();
        one.addMembers(membersOne);

    }
}
