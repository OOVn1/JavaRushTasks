package com.javarush.task.task23.task2312;


/**
 * Основной класс программы.
 */
public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {

    }

    /**
     * Выводим на экран текущее состояние игры
     */
    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
    }

    /**
     * Метод вызывается, когда мышь съели
     */
    public void eatMouse() {
        createMouse();
    }

    /**
     * Создает новую мышь
     */
    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }


    public static Room game;

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }


    /**
     * Программа делает паузу, длинна которой зависит от длинны змеи.
     */
    public void sleep() {
    }
}
