package ru.job4j.tracker;

public class EditItem implements UserAction {
    public String name() {
        return "Edit Item";
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Введите id заявки, которую хотите изменить ");
        String name = input.askStr("Введите новое имя для выбранной заявки ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }

        return true;
    }
}
