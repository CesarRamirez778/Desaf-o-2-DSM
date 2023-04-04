package com.example.desafiopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*Instanciamos la clase*/
        var estudiante:Estudiante= Estudiante()


        /*Capturamos valores*/
        var nombre = findViewById<EditText>(R.id.txtNombreEstudiante)
        var nota1 = findViewById<EditText>(R.id.txtNota1)
        var nota2 = findViewById<EditText>(R.id.txtNota2)
        var nota3 = findViewById<EditText>(R.id.txtNota3)
        var nota4 = findViewById<EditText>(R.id.txtNota4)
        var nota5 = findViewById<EditText>(R.id.txtNota5)

        var promedio = findViewById<TextView>(R.id.txtvResultado)

        var calcularPromedio = findViewById<Button>(R.id.btnCalcularPromedio)

        calcularPromedio.setOnClickListener{
            if(nombre.text.toString()=="" || nota1.text.toString()=="" || nota2.text.toString()=="" || nota3.text.toString()=="" || nota4.text.toString()=="" || nota5.text.toString()==""){
                Toast.makeText(this,"Campos vacios",Toast.LENGTH_LONG).show()
            }
            else if(nota1.text.toString().toDouble()<0 || nota1.text.toString().toDouble()>10 ||
                nota2.text.toString().toDouble()<0 || nota2.text.toString().toDouble()>10 ||
                nota3.text.toString().toDouble()<0 ||nota3.text.toString().toDouble()>10 ||
                nota4.text.toString().toDouble()<0 || nota4.text.toString().toDouble()>10 ||
                nota5.text.toString().toDouble()<0 || nota5.text.toString().toDouble()>10)
            {
                Toast.makeText(this,"Valores Invalidos",Toast.LENGTH_LONG).show()
            }
            else{

                estudiante.CalcularPromedio(nombre.text.toString(), nota1.text.toString().toDouble(),nota2.text.toString().toDouble(),nota3.text.toString().toDouble(),nota4.text.toString().toDouble(),nota5.text.toString().toDouble())

                if(estudiante.PROMEDIO>=5.96){
                    promedio.text = "Felicidades "+estudiante.Nombre+", Aprobaste con: "+estudiante.PROMEDIO.toString()
                }
                else {
                    promedio.text = "Lo sentimos "+estudiante.Nombre+" , Reprobaste con: " + estudiante.PROMEDIO.toString()
                }

            }



        }

    }
}

//===========/ *ENCAPSULAMOS LOS VALORES EN VARIABLES PARA ASIGNARLES UN VALOR ///===========/
class Estudiante{
    var Nombre:String=""
    var Apellido:String=""
    var NotaPromedio:Double=0.0
    var Estado:boolean=""

    var salarioNeto
    var salario

//===========/ *Enlistamos LOS datos EN VARIABLES PARA ASIGNARLES UN VALOR ///===========/
    fun EnlistarEmpleados(nombre:String,salario:int,Salneto:double){
       // validamos  si hay  valores asignados
    if(nombre,apellidom,notaPromedio,estado ==  ""){
        show.toast("No hay valores que mostrar")
    }
    //caso contrario tomamos los valores encapsulados y los mostramos en pantalla
    else{
        if(class.estudiantes.lenght)
        {
            Nombre = space.[opc]= nombre
            Apellido = space[opc]=apellido
            NotaPromedio = space[opc]=notapromedio
            Estado = space[opc]=estado

            salario=space[opc]=SALARIO
            Salneto=space[opc]=SalarioNeto

        }
    }

    }
        var promedio = (Nota1+Nota2+Nota3+Nota4+Nota5)/5

        PROMEDIO=promedio
        Nombre = nombre

    }


//===========/ *ENCAPSULAMOS LOS VALORES EN VARIABLES PARA ASIGNARLES UN VALOR ///===========/
GET Empleados{
    var Nombre:String=""
    var Apellido:String=""
    var NotaPromedio:Double=0.0
    var Estado:boolean=""
    //===========/ *ENCAPSULAMOS LOS VALORES EN VARIABLES PARA ASIGNARLES UN VALOR ///===========/
    fun EnlistarEstudiantes(nombre:String,nota1:Double,nota2:Double,nota3:Double,nota4:Double,nota5:Double){
        // validamos  si hay  valores asignados
        if(nombre,apellidom,notaPromedio,estado ==  ""){
            show.toast("No hay valores que mostrar")
        }
        //caso contrario tomamos los valores encapsulados y los mostramos en pantalla
        else{
            if(class.estudiantes.lenght)
            {
                Nombre = space.[opc]= nombre
                Apellido = space[opc]=apellido
                NotaPromedio = space[opc]=notapromedio
                Estado = space[opc]=estado
            }
        }

    }
    var promedio = (Nota1+Nota2+Nota3+Nota4+Nota5)/5

    PROMEDIO=promedio
    Nombre = nombre

}

//====/ *METODO que  Obtiene los valores encapsulados y elimina segun numero de correlativo del 1 al 10 ///===========/
public fun ELiminarEmpleado(nombre:String,salario:int,Salneto:double)
{
    if(class.empleados.ELiminarEmpleado == True)
    {
   // al capturar los datos a elimiar recorre un listado y los empuja a darles un valor nulo, para ser eliminados de la lista
        listOf(Nombre) nombre.toString[0]
        listOf(salario) salario.push.toInt[0]
        listOf(salneto) sneto.push.toDouble[0]
        //Recarga el listado
        listView(reloaded)
    //Al ser eliminado manda a la vista de eliminado exitosamente segun correlativo.
        this.show(views.Eliminado)
    }
    else(
        toast.show("No  se pudo eliminar el correlativo.")
         listView(reloaded)
    )

}
}


//====/ *METODO que  Obtiene los valores encapsulados y actualiza los datos segun el orden de ingrerso//===========/
public fun ObtenerDatosEmpleadosEditar(nombre:String,salario:int,Salneto:double)
{
    if(class.estudiantes.EliminarEstudiante==True)
    {
        // al capturar los datos los obtiene con GET desde el encapsulado
        GET listOf(Nombre) nombre.toString[0]
        GET  listOf(Apellido) apellido.push.toString[0]
        GET listOf(Promedio) promedio.push.toDouble[0]
        GET listOf(Estado) estado.push.to[empty]
        GET listView(reloaded)
        //Al ser eliminado manda a la vista de eliminado exitosamente segun correlativo.
        this.show(views.editar)
    }
public fun AsignarDatosEmpleadosEditar(nombre:get,salario:get,salneto:get)
    if()
    {
        // Asignamos nuevos Valores a los datos.
        SET listOf(Nombre) nombre.new[nombre]
        SET listOf(Salario) salario.new[apellido]
        SET listOf(salneto) SalarioNeto.new[salneto]
        //actualiza el listview
        SET listView(reloaded)

        //Al ser editado los datas nos  manda a la vista de editado exitosamente segun correlativo.
        this.show(views.editar)
    }
    //si el dato no exite
    else{
        if(nombre==empty,apellido==empty,promedio==empty,estado==empty)
         toast.show("No  se pudo Editar el correlativo.")
         listView(reloaded)
    )
    }
}
}











}