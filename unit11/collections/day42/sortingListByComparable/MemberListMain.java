package unit11.collections.day42.sortingListByComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MemberListMain {
    public static void main(String[] args) {
        List<Member> memberList
                = new ArrayList<>(List.of(new Member("John"), new Member("Kim")
                , new Member("Brad"), new Member("George")));

        System.out.println("Member List in insertion order");
        System.out.println(memberList);
        System.out.println("Member List sorted by Member's Name");
        memberList.sort(Comparator.naturalOrder());
        System.out.println(memberList);
    }
}
