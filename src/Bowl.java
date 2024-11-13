public class Bowl {
    private int food;

    public Bowl(int food) {
        if (food>=0) {
            this.food = food;
        }
        else {
            this.food = 0;
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            System.out.println("Количество поедаемой еды должно быть больше нуля");
            return false;
        }
        if (food >= amount) {
            food -= amount;
            return true;
        }
        System.out.println("Недостаточно еды в миске. В миске " + food + " ед.");
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " ед. еды в миску");
        } else {
            System.out.println("Количество добавляемой еды должно быть больше нуля");
        }
    }

    public int getFood() {
        return food;
    }
}
