package com.luiz.classeskotlin

fun main(){
    var moto = Moto()
    moto.model = "Harley"
    moto.writeScreen()

    var carro = Carro()
    carro.model = "Gol"
    carro.writeScreen()
}

interface Car{
    var velocity: Int
    var acceleration: Int
    var model: String

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

class Carro: Car{
    override var acceleration = 10
    override var model = ""
    override var velocity = 10

}
class Moto: Car{
    override var acceleration = 5
    override var model = ""
    override var velocity = 5

}