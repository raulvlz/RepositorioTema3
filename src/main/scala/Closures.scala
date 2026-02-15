object Closures {

  //Funciones literales

  (x:Int) => {
    x+1  //bound variable
  }

  val more = 0
  (x: Int) => {
    x + more //variable libre
  }

  //Funciones como valor

  //término cerrado
  val funcion1 = (x: Int) => {
    x + 1 //bound variable
  }

  //término abierto
  //funcion2 => Closure
  val funcion2 = (x: Int) => {
    x + more
  }

}
