package collection;

import java.util.Objects;

public class Components {

    private String compoName;
    private String compoId;

    public String getCompoName() {
        return compoName;
    }

    public void setCompoName(String compoName) {
        this.compoName = compoName;
    }

    public String getCompoId() {
        return compoId;
    }

    public void setCompoId(String compoId) {
        this.compoId = compoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Components)) return false;
        Components that = (Components) o;
        return Objects.equals(compoName, that.compoName) &&
                Objects.equals(compoId, that.compoId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(compoName, compoId);
    }



}
