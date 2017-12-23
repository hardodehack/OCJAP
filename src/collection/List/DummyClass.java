package collection.List;

import java.util.Objects;

public class DummyClass {

    private int a;
    private String b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }



    public DummyClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "DummyClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DummyClass)) return false;
        DummyClass that = (DummyClass) o;
        return a == that.a &&
                Objects.equals(b, that.b);
    }


    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }


}
