package com.luiz.classeskotlin

fun main() {
    val factory = VeiculoFactory()
    val veiculoList: MutableList<Veiculo> = mutableListOf()

    for (i in 1..10) {
        val veiculo = factory.createVeiculo(i % 2, i)
        veiculoList.add(veiculo)
    }

    veiculoList.forEach { veiculo ->
        veiculo.acelerar()
        println(veiculo)
    }
}

class VeiculoFactory {
    fun createVeiculo(type: Int, id: Int): Veiculo {
        return if (type == 1) Carro(id) else Moto(id)
    }
}

abstract class Veiculo(val id: Int) {
    var velocity: Int = 0
    abstract val acceleration: Int
    abstract val model: String

    abstract fun acelerar()

    override fun toString() = "ID: $id Modelo: $model Velocidade: $velocity Aceleração: $acceleration"
}

class Carro(id: Int) : Veiculo(id) {
    override val model = "Carro"
    override var acceleration = 10

    override fun acelerar() {
        acceleration = acceleration + 10
        velocity = velocity + acceleration
    }
}

class Moto(id: Int) : Veiculo(id) {
    override val model = "Moto"
    override var acceleration = 5

    override fun acelerar() {
        acceleration = acceleration + 10
        velocity = velocity + acceleration
    }
}
