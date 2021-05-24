package at.boxcarracer.lemonadetycoon.models;

public class GameState
{
    private int money;
    private int lemons;
    private int sugar;

    public GameState(int money, int lemons, int sugar)
    {
        this.money = money;
        this.lemons = lemons;
        this.sugar = sugar;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setLemons(int lemons) {
        this.lemons = lemons;
    }

    public int getLemons() {
        return lemons;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }
}
