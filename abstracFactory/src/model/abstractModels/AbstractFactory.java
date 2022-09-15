package model.abstractModels;

public interface AbstractFactory {
    Coin createCoin();
    Goomba createGoomba();
    PowerUp createPowerUp();
    QuestionBlock createQuestionBlock();
    Yoshi createYoshi();
    default String createAnPrintAllObjects() {
        Coin coin = createCoin();
        Goomba goomba = createGoomba();
        PowerUp powerUp = createPowerUp();
        QuestionBlock questionBlock = createQuestionBlock();
        Yoshi yoshi = createYoshi();
        String s = this.toString() + "\n" + coin.toString() + "\n" + goomba.toString() + "\n" + 
        powerUp.toString() + "\n" + questionBlock.toString() +"\n" + 
        yoshi.toString();
        return s;
    }
}