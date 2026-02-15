object FuncionesParcialmenteAplicadas extends App {

  def ObtenerPrecioCafe(tamaño: String, cantidad: Int): Float = {
    tamaño match {
      case "chico" => 25 * cantidad
      case "mediano" => 25 * cantidad
      case "grande" => 25 * cantidad
    }
  }

  val ObtenerPrecioCafeChico = ObtenerPrecioCafe("chico",_: Int)

  println(ObtenerPrecioCafeChico(3))

}
