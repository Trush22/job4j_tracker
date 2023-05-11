package ru.job4j.tracker;

public class FindById implements UserAction {
    public String name() {
        return "Find item by ID";
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Введите id заявки, которую хотите найти ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }

        return true;
    }
}
