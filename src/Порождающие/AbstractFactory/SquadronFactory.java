package Порождающие.AbstractFactory;

abstract class SquadronFactory {
    abstract Mage createMage();
    abstract Archer createArcher();
    abstract Warrior createWarrior();
}
