package model.factory;

import model.WiiU.*;
import model.abstractModels.*;

public class WiiUFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new WiiUCoin();
    }

    @Override
    public Goomba createGoomba() {
        return new WiiUGoomba();
    }

    @Override
    public PowerUp createPowerUp() {
        return new WiiUPowerUp();
    }

    @Override
    public QuestionBlock createQuestionBlock() {
        return new WiiUQuestionBlock();
    }

    @Override
    public Yoshi createYoshi() {
        return new WiiUYoshi();
    }
    
    @Override
    public String toString() {
        return "Instancias creadas con las clases abstractas de la plataforma WiiU";
    }
}
