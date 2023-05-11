package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    public String name() {
        return "Delete Item";
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Введите id заявки, которую хотите удалить ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }

        return true;
    }
}
