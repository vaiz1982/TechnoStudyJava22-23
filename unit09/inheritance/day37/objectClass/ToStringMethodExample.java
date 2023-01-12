package unit09.inheritance.day37.objectClass;

import java.util.Objects;

public class ToStringMethodExample {
    private String someWords;

    public ToStringMethodExample() {
        someWords = "Hello World";
    }

    @Override
    public String toString() {
        return "ToStringMethodExample{" +
                "someWords='" + someWords + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ToStringMethodExample that = (ToStringMethodExample) o;
//        return someWords.equals(that.someWords);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(someWords);
    }
}
