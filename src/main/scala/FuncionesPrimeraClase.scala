package playground

object  FuncionesPrimeraClase extends App {

  // Funciones anónimas

  // List(1,2,3).map((x: Int) => x * x).foreach(println)

  // Funciones como valor

  val funcionCuadratica = (x: Int) => x * x
  List(1,2,3).map(funcionCuadratica(_)).foreach(println)


}