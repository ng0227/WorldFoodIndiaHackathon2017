package com.example.naman.nutritionchoice.activity.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent3 {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 5;

    static {
        addItem(new DummyItem("1","Singri Ki Sabzi","https://www.tarladalal.com/Ker-Sangri-3637r"));
        addItem(new DummyItem("2","Mithe Chawal","http://foodviva.com/rice-recipes/meethe-chawal/"));
        addItem(new DummyItem("3","Kheer","http://www.indianfoodforever.com/desserts/kheer.html"));
        addItem(new DummyItem("4","Boondi Ladoo","http://www.indianfoodforever.com/desserts/boondi-ka-laddoo.html"));
        addItem(new DummyItem("5","Baajre Ki Roti","http://www.vegrecipesofindia.com/bajra-roti-bajra-bhakri/"));


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
