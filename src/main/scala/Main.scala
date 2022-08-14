object Main {
  def main(args: Array[String]): Unit = {
    println("Recursive Functions")

    def suc(n: Int): Int = n + 1

    def pred(n: Int): Int = n - 1

    /*
    Exercise 1
     */
    def pow(x : Int, n : Int) : Int = {
      if (n == 0) 1 else x*pow(x,pred(n))
    }

    /*
    Exercise 2
      */
    def factorial(n: Int) : Int = {
      if(n == 0) 1 else n*factorial(pred(n))
    }

    /*
    Exercise 3
      */
    def rSum(n: Int): Int = {
      if (n == 0) n else n + rSum(pred(n))
    }

    /*
    Exercise 4
      */
    def suma(x : Int, y : Int): Int = {
      if(x == 0) y else suc(suma(pred(x),y))
    }

    /*
    Exercise 5
      */
    def dif(x: Int, y : Int): Int = {
      if(y == 0) x else dif(x,pred(y))-1
    }

    /*
    Exercise 6
      */

    def prod(x: Int, y: Int): Int = {
      if(x == 0) 0 else{
        if(x == 1) 1 else {
          suma(y,prod(pred(x),y))
        }
      }
    }

    /*
    Exercise 7
      */
    def exercise(x: Int, y : Int): Double = {
      1
    }
    /*
    Exercise 8
      */

    def modulo(m : Int, n : Int): Int = {
      if(m<n) m else modulo(dif(m,n),n)
    }

  }


}