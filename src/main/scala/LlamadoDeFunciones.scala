object LlamadoDeFunciones extends App {

  //Llamado directo de la función
  def greet(prefix: String, name: String) = println(s"$prefix $name")

  greet("Hola", "Raul")

  //Llamado por parámetros
  greet(name = "Silvia", prefix = "Hola")




  //Overloading
  def greet2(prefix: String, name: String): String = s"$prefix $name"
  def greet2(name: String): String = {
    greet2("Hola", name)
  }
  println(greet2("Hola","Kevin"))





  //Funciones con argumentos por defecto
  def greet3(prefix: String = "Hola", name: String): String = s"$prefix $name"
  println(greet3(name="Brayan"))
  println(greet3("Hi",name="Kike"))







}
