package ru.geekbrains.lesson;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия
// будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

public class Cat extends Animal {
    private static final int RUN_LIMIT = 200;
    private static int counter = 0;
    private final String name;

    public Cat (String name) {
        counter++;
        this.name = name;
    }
    @Override
    void run(int lenght) {
        if ((lenght > 0) && (lenght <= RUN_LIMIT)) {
            System.out.printf("Кот %s пробежал %dM.\n", name, lenght);
        } else {
            System.out.printf("Кот может пробежать только %dM.\n)", RUN_LIMIT;
        }
    }
    void swim(int lenght) {
        System.out.println("Кот не умеет плавать");
    }

    public static void getCount() {
        System.out.printf("Создано котов: %d\n, counter");
    }
}
