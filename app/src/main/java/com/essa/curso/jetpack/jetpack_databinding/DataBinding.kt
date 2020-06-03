package com.essa.curso.jetpack.jetpack_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.essa.curso.jetpack.jetpack_databinding.databinding.ActivityDataBindingBinding
import com.essa.curso.jetpack.jetpack_databinding.modelo.Usuario

class DataBinding : AppCompatActivity() {

    //SE CREA UN ARRAYLIST PARA ALMACENAR USUARIOS
    private lateinit var mListaNombre: ArrayList<Usuario>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)

        //SE REALIZA EL ENLACE ENTRE EL ACTIVITY DATA BINDINGBINDING QUE SE CREA POR DEBAJO Y EL XML Y SE REA UNA REFERENCIA
        var binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)

        //SE CREA UN USUARIO Y SE LE ASIGANA A LA VARIABLE USUARIO CREADA EN EL XML DENTRO DE DATA
        var usuarioCodigo = Usuario("Sergio", "Rodriguez")
        binding.usuario = usuarioCodigo

        mListaNombre = ArrayList()
        for(count in 1..5){
            val usuario = Usuario("Sergio-"+count, "Rodriguez-$count")
            mListaNombre.add(usuario);
        }

        binding.listaUsuario = mListaNombre

        //Ejemplo acceso a recursos
        val textoGrande = false
        binding.textoGrande = textoGrande

    }
}
