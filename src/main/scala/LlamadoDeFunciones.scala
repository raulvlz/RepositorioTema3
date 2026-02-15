object LlamadoDeFunciones extends App {

  //Llamado directo de la funcón
  def greet(prefix: String, name: String) = println(s"$prefix $name")

  greet("Hola","Raul")

  //Llamado
  greet(name="Raul", prefix="Hola")

}
