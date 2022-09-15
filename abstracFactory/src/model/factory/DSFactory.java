package model.factory;

import model.DS.*;
import model.abstractModels.*;

public class DSFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new DSCoin();
    }

    @Override
    public Goomba createGoomba() {
        return new DSGoomba();
    }

    @Override
    public PowerUp createPowerUp() {
        return new DSPowerUp();
    }

    @Override
    public QuestionBlock createQuestionBlock() {
        return new DSQuestionBlock();
    }

    @Override
    public Yoshi createYoshi() {
        return new DSYoshi();
    }

    @Override
    public String toString() {
        return "Instancias creadas con las clases abstractas de la plataforma DS";
    }
}
