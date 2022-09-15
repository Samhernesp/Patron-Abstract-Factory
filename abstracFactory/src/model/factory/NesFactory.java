package model.factory;

import model.Nes.*;
import model.abstractModels.*;

public class NesFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new NesCoin();
    }

    @Override
    public Goomba createGoomba() {
        return new NesGoomba();
    }

    @Override
    public PowerUp createPowerUp() {
        return new NesPowerUp();
    }

    @Override
    public QuestionBlock createQuestionBlock() {
        return new NesQuestionBlock();
    }

    @Override
    public Yoshi createYoshi() {
        return new NesYoshi();
    }
    
    @Override
    public String toString() {
        return "Instancias creadas con las clases abstractas de la plataforma Nes";
    }
}
