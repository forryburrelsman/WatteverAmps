package net.wattever.data;

import net.wattever.models.Subscription;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Flow;

public class subscriberData {

    private static Map<Integer, Subscription> subscribers = new HashMap<>();

    public static Collection<Subscription> getAll() {
        return subscribers.values();
    }

    public static void add(Subscription subscription) {
        subscribers.put(subscription.getId(), subscription);
    }

    public static Subscription getById(Integer id) {
        return subscribers.get(id);
    }

    public static void remove(Integer id) {
        if (subscribers.containsKey(id)) {
            subscribers.remove(id);
        }
    }


}
