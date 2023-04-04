/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 * 
 * DR - 1st kotling code ( online : https://play.kotlinlang.org/
 *                         args are to be set in the apropriate field on site)
 * 
 * From 1st "Simple example: Reachable Numbers problem" : A.kt file
 * https://kotlinlang.org/docs/competitive-programming.html
 **/

/* DR : Just... Readme 
    0. copy this code online
    1. set an integer in field form at https://play.kotlinlang.org/
    2. click Run... 
*/

tailrec fun removeZeroes(x: Int): Int =
    if (x % 10 == 0) removeZeroes(x / 10) else x

fun f(x: Int) = removeZeroes(x + 1)

fun main(args: Array<String>) {
    var n = args[0].toInt() // read integer from the input
    val reached = HashSet<Int>() // a mutable hash set
    while (reached.add(n)) { 
        println(n);                      //-/DR-addition for understanding
        n = f(n); // iterate function f
        println(n);                   //-/DR-addition for understanding
        println(reached.sorted()); }  //-/DR-addition 
                //-/ (sorted - HashSet sort/add/insert as text by default : 1 200 3 400 ...)
    
    println(reached.size) // print answer to the output
         //-/ Means => How many iterations of f() before reaching a previously reached integer
         //-/ Means => While HashSet.add() works fine ! (if same value to insert it won't ;)
}

