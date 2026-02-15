object FuncionesParcialmenteAplicadas extends App {

  //Creamos una función genérica o general
  def ObtenerPrecioCafe(tamaño: String, cantidad: Int): Float = {
    tamaño match {
      case "chico" => 25 * cantidad
      case "mediano" => 25 * cantidad
      case "grande" => 25 * cantidad
    }
  }

  //Creamos una función especifica a partir de la misma función.
  val ObtenerPrecioCafeChico = ObtenerPrecioCafe("chico",_: Int)

  println(ObtenerPrecioCafeChico(3))

}
