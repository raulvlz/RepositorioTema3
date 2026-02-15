object FuncionesOrdenSuperior extends App {

  //Funciones con un bloque de expresión
  //Función con un solo parámetro, con llaves o paréntesis.
  def format(number: Double) = f"$number%.2f"

  format(3.422343) //Tradicional
  format{val constante = 10; 123.2334 * constante} //Bloque de expresión

  //Funciones de orden superior, reciben o devuelven funciones como resultado

  def safeStringOps(s: String, f: String => String) = { //f recibe una función como parámetro
    if (s != null) f(s) else s     //Si s no es nulo, aplica la función f a s, de lo contrario simplemente devuelve s
  }

  val id = java.util.UUID.randomUUID().toString
  val timeId = safeStringOps(id, {s =>
    val now = System.currentTimeMillis()
    val timed = s.take(24) + now
    timed.toUpperCase()
  })

  //función anónima
  //obtiene el tiempo en milisegundos
  //toma los primeros 24 caracteres y los concatena.
  //Devuelve todo en mayúsculas

}
