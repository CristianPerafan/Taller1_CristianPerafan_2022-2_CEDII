object Main {
  def main(args: Array[String]): Unit = {
    println("Recursive Functions")

    def suc(n : Int): Int = n+1
    def pred(n : Int): Int = n-1


    /*
    Exercise 1
     */
    def pow(x : Int, n : Int) : Int = {
      if (n == 0) 1 else x*pow(x,pred(n))
    }

    /*
    Exercise 2
      */








  }


}