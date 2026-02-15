object FuncionesConParámetrosRepetidos extends App{

  //Scala también reconoce ArvArgs
  //El parámetro repetido debe estar al final, y debe ser del mismo tipo
  def suma(p1: Int, p2: Int): Int={
    p1 + p2
  }

  def suma2(parms: Int*): Int={
    var total=0
    for (i<-parms) total += i
    total
  }
  println(suma2(12,10,123,43,567,765))






}
