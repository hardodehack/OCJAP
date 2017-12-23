package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SynchronizedUnmodifiable {

    public static void main(String[] args) {

        // Use of Synchronized collection ( Thread Safe Methods...)
        Collections.synchronizedCollection(new ArrayList<String>());

        // Use of Immutable collection
        Collections.unmodifiableMap(new HashMap<String,String>());



    }

}
