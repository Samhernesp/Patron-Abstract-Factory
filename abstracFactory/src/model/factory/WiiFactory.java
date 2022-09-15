package model.factory;

import model.Wii.*;
import model.abstractModels.*;


public class WiiFactory implements AbstractFactory {

    @Override
    public Coin createCoin() {
        return new WiiCoin();
    }

    @Override
    public Goomba createGoomba() {
        return new WiiGoomba();
    }

    @Override
    public PowerUp createPowerUp() {
        return new WiiPowerUp();
    }

    @Override
    public QuestionBlock createQuestionBlock() {
        return new WiiQuestionBlock();
    }

    @Override
    public Yoshi createYoshi() {
        return new WiiYoshi();
    }
 
    @Override
    public String toString() {
        return "Instancias creadas con las clases abstractas de la plataforma Wii";
    }
}
