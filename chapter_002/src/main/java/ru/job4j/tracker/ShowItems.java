package ru.job4j.tracker;

import java.util.List;

/**
 * Наследование
 */

public class ShowItems extends BaseAction {
    public ShowItems(String key, String name) {
        super(key, name);
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск всех заявок --------------");
        List<Item> items = tracker.findAll();
        if (items.size() != 0) {
            for (Item it : items) {
                System.out.println("------------ Найдена заявка с именем : " + it.getName() + "-----------");
                System.out.println("------------ описание заявки :" + it.getDesc() + "-----------");
            }
        } else System.out.println("------------ Нет заявок" + "-----------");
    }
}