object LlamadoDeFunciones extends App {

  //Llamado directo de la funcón
  def greet(prefix: String, name: String) = println(s"$prefix $name")

  greet("Hola", "Raul")

  //Llamado por caracteristicas
  greet(name = "Raul", prefix = "Hola")




  //Overloading
  def greet2(prefix: String, name: String): String = s"$prefix $name"
  def greet2(name: String): String = {
    greet2("Hola", name)
  }

  println(greet2("Hola","Kevin"))








}
