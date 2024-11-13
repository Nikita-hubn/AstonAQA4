public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бим");
        Dog dog2 = new Dog("Барбос");

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Боря");
        Cat cat3 = new Cat("Рыжик");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        dog1.run(300);
        dog1.swim(5);

        dog2.run(600);
        dog2.swim(15);

        cat1.run(150);
        cat1.swim(10);

        Bowl bowl = new Bowl(-5);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");

        bowl.addFood(15);
        System.out.println("Добавили еды. Теперь в миске: " + bowl.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");

        System.out.println("Фигуры");
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 7, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        System.out.println("Круг:");
        circle.printCharacteristics();

        System.out.println("\nПрямоугольник:");
        rectangle.printCharacteristics();

        System.out.println("\nТреугольник:");
        triangle.printCharacteristics();
    }

}