package playground

object  FuncionesPrimeraClase extends App {

  // Funciones anónimas

  // List(1,2,3).map((x: Int) => x * x).foreach(println)

  // Funciones como valor

  //val funcionCuadratica = (x: Int) => x * x
  //List(1,2,3).map(funcionCuadratica(_)).foreach(println)

  //Funciones que reciben otras funciones
  //List(1,2,3).filter((x: Int) => x>1).foreach(println)

  //Funciones que retornan otras funciones
  def saludar(prefix: String) = {
    (name: String) => println(s"$prefix $name")
  }

  println(saludar("Hola"))
  saludar("Hola")("Silvia")

  val Buenos_dias = saludar("Buenos_dias")
  Buenos_dias("Gabriel")

}