package collection;

import java.util.Comparator;

public class CobComparator_AppId implements Comparator<Cobrands> {

    @Override
    public int compare(Cobrands o1, Cobrands o2) {

        return o1.getAppId().compareTo(o2.getAppId());

    }
}
