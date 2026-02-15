object Recursión extends App {

  //Una función recursiva es aquella que se llama o invoca a si misma, el cual hace un loop infinito

  def Exponencial(num: BigInt, exp: BigInt): BigInt = {
    if (exp >= 1) num * Exponencial(num, exp - 1)
    else 1
  }

  println(Exponencial(2,8))


  //Caso especial - Tail-recursion
  //println(Exponencial(2,8000))
  //Marca error, corrección:

//  @annotation.tailrec
//  def Exponencial(num: BigInt, exp: BigInt): BigInt = {
//    if (exp < 1) 1
//    else num * Exponencial(num, exp - 1)
//  }
//
//  println(Exponencial(2,8000))



  //Sigue marcando error, porque tenemos una operación en la ultima declaración
  @annotation.tailrec
  def Exponencial(num: BigInt, exp: BigInt, aux: BigInt=1): BigInt = {
    if (exp < 1) aux
    else Exponencial(num, exp - 1, num*aux)
  }

  println(Exponencial(2,1000))

}

//Muy util para iterar
