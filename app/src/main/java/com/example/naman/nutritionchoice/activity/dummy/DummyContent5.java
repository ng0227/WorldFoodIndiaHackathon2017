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
public class DummyContent5 {

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
        addItem(new DummyItem("1","Batata Vada","http://foodviva.com/snacks-recipes/batata-vada/"));
        addItem(new DummyItem("2","Pav Bhaji","http://www.indianfoodforever.com/snacks/pao-bhaji.html"));
        addItem(new DummyItem("3","Pooran Poli","http://www.indianfoodforever.com/maharashtrian/puran-poli.html"));
        addItem(new DummyItem("4","Misal Paav","https://indianhealthyrecipes.com/misal-pav-recipe/"));
        addItem(new DummyItem("5","Zunka Bhakri","http://food.ndtv.com/recipe-zunka-bhakri-366242"));


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
