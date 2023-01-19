package unit11.collections.day42.sortingListByComparable;

public class Member implements Comparable<Member> {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member's name='" + name;
    }

    @Override
    public int compareTo(Member that) {
        return this.name.compareTo(that.name);
    }
}
