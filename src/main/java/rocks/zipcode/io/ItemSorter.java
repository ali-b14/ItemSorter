package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter implements Comparable{
    public ItemSorter(Item[] items) {
    }

    public Item[] sort(Comparator<Item> comparator) {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
