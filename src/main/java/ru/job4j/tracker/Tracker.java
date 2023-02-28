package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                rsl[i] = item;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (key.equals(name.getName())) {
                rsl[i] = name;
            }
        }
        Item[] rsl2 = new Item[size];
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            Item item = rsl[i];
            if (item != null) {
                rsl2[size2] = item;
                size2++;
            }
        }
        rsl = Arrays.copyOf(rsl2, size2);
        return rsl;
    }
}