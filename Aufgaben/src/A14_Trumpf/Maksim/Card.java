package A14_Trumpf.Maksim;

import java.util.Map;
import java.util.Set;

public class Card {
    private String name;
    private Map<String, Integer> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttribute(String key) {
        return attributes.get(key);
    }

    public Set<String> getCategories() {
        return attributes.keySet();
    }

    public void setAttributes(Map<String, Integer> attributes) {
        this.attributes = attributes;
    }

    public Card(String name, Map<String, Integer> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return name + " " + attributes.toString();
    }
}
