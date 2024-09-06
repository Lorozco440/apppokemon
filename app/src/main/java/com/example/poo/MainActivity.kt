package com.example.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.jotajotavm.poo.R

class MainActivity : AppCompatActivity() {

    private lateinit var pok : Pokemon
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num: Int = 0
        var luis: Person = Person(name =  "Luis", passport =  "A8956565")
        var anonimo: Person = Person()
        println(luis.alive)
        luis.die()
        println(luis.alive)
        println(luis.name)
        println(luis.passport)

        anonimo.Person()
        anonimo.name = "Pablo"
        println(anonimo.alive)
        println(anonimo.name)
        println(anonimo.passport)

        var pele: Athlete = Athlete(name = "Pele", passport = "C456231", sport = "Futbol")

        println(pele.alive)
        println(pele.name)
        println(pele.passport)
        println(pele.sport)

        pele.die()
        println(pele.alive)

        var bicho: Pokemon = Pokemon()
        println(bicho.getName())
        println(bicho.getattackPower())
        bicho.setLife(30f)
        println(bicho.getlife())


    }
    fun createNewPokemon(v: View){
        val etName = findViewById<EditText>(R.id.etName)
        var etAttackPower = findViewById<EditText>(R.id.etAttackPower)

        pok = Pokemon()

        if (!etName.text.isNullOrEmpty() && !etAttackPower.text.isNullOrEmpty())
            pok.Pokemon(etName.text.toString(), etAttackPower.text.toString().toFloat())

        var ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
        ivPokemon.setImageResource(R.mipmap.pokemon)

        var tvPokemon = findViewById<TextView>(/* id = */ R.id.tvPokemon)
        LoadDataPokemon(tvPokemon, pok)
    }
    private fun LoadDataPokemon(tv: TextView, p: Pokemon){
        var description: String = ""
        description += p.getName() + "("
        description += "AP: " + p.getattackPower().toInt()
        description += " - L" + p.getlife().toInt() + ")"

        tv.text = description
    }

}