import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        MemberInfo x = new MemberInfo("GARCIA, MARIA", 2020, true);
        System.out.println(x);

        MemberInfo[] membersOne = {
                new MemberInfo("SMITH JANE", 2019, false),
                new MemberInfo("FOX STEVE", 2018, true),
                new MemberInfo("XIN, MICHAEL", 2017, false),
                new MemberInfo("GARCIA, MARIA", 2020, true),
        };
        ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
        ClubMembers one = new ClubMembers();
        for (MemberInfo m : membersOne) {
            list.add(m);
        }
        one.addMembers(list);

        System.out.println(one.removeMembers(2018));
        System.out.println(one.getMemberList());

    }
}
