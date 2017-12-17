package Collection;

import java.util.ArrayList;
import java.util.Objects;

public class Cobrands implements Comparable<Cobrands>{

    private int cobId;
    private String appId;
    private ArrayList<Components> components;

    public Cobrands(int cobId, String appId) {
        this.cobId = cobId;
        this.appId = appId;
    }



    public int getCobId() {
        return cobId;
    }

    public void setCobId(int cobId) {
        this.cobId = cobId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ArrayList<Components> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Components> components) {
        this.components = components;
    }

    @Override
    public int compareTo(Cobrands o) {
        // For Integer compareTo method is already implemented in respective Wrapper Classes.
        // Use Java's default comparision technique and that is using " - ". Good..Good.Good.........
        return cobId-o.cobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cobrands cobrands = (Cobrands) o;
        return cobId == cobrands.cobId &&
                Objects.equals(appId, cobrands.appId) &&
                Objects.equals(components, cobrands.components);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cobId, appId, components);
    }



}
