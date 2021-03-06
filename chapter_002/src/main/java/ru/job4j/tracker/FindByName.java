package ru.job4j.tracker;

import java.util.List;

/**
 * Наследование
 */

public class FindByName extends BaseAction {
    public FindByName(String key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск по имени заявки --------------");
        String name = input.ask("Введите имя заявки :");
        List<Item> items = tracker.findByName(name);
        if (items.size() != 0) {
            for (Item it : items) {
                System.out.println("------------ Найдена заявка с именем : " + it.getName() + "-----------");
                System.out.println("------------ описание заявки :" + it.getDesc() + "-----------");
            }
        }
    }
}