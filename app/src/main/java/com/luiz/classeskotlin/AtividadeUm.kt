package com.luiz.classeskotlin

fun main(){
    var veiculo = Moto()
    veiculo.model = "Harley"
    veiculo.writeScreen()
}

abstract class Car(){
    var velocity: Int
    abstract var acceleration: Int
    abstract var model: String

    init{
        this.velocity = 0
    }

    fun writeScreen(){
        println("Velocidade: $velocity, Aceleração: $acceleration, Modelo: $model")
    }

    fun Speed(move: Int){
        acceleration = acceleration + move
    }
    fun Slow(move: Int){
        acceleration = acceleration - move

        if (acceleration < 0){
            acceleration = 0
        }
    }

    fun NewVelocitySpeed(){
        velocity = velocity + acceleration
    }

    fun NewVelocitySlow(){
        velocity = acceleration

        if (velocity < 0){
            velocity = 0
        }
    }
}

class Moto: Car(){
    override var acceleration = 5
    override var model = ""
}