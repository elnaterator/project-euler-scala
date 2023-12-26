package nate.euler.problems

/**

<p>A unit fraction contains 1 in the numerator. The decimal representation 
of the unit fractions with denominators 2 to 10 are given:</p>

<pre>
1/2 = 0.5
1/3 = 0.(3)
1/4 = 0.25
1/5 = 0.2
1/6 = 0.1(6)
1/7 = 0.(142857)
1/8 = 0.125
1/9 = 0.(1)
1/10 = 0.1
</pre>

<p>Where 0.1(6) means 0.166666..., and has a 1-digit recurring 
cycle. It can be seen that 1/7 has a 6-digit recurring cycle.</p>

<p>Find the value of d < 1000 for which 1/d contains the 
longest recurring cycle in its decimal fraction part.</p>

*/
object Problem26 extends App {
    
    val ds = (1 to 1000).toList
    val numWithMaxCycle = 0
    val maxCycleLen = 0

    val cycles = ds.map { d =>
        1/d.toDouble
    }

    println(cycles)

}   