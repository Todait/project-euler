import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader

/**
 * Created by Omjoon on 2017. 5. 25..
 */

fun main(args: Array<String>) {
    checkTime { order().answer() }
}

fun order() = numOfWords.filter(Int::isTriangleNum).size

val numOfWords: List<Int> get() = words.map { it.map(Char::Int).sum() }

val words: List<String> get() = text.run { substring(1, length.minus(1)).split("\",\"") }

val text: String
    get() =
    BufferedReader(FileReader(File("/Users/Omjoon/gitRepo/MashUpKotlin2/src/main/assets", "problem42.txt")))
            .use {
                try {
                    it.readText()
                } catch (e: FileNotFoundException) {
                    e.printStackTrace()
                    throw e
                }
            }

val Char.Int get() = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(this).plus(1)

val setOftriangleNum = hashSetOf<Int>()

val Int.isTriangleNum: Boolean
    get() =
    if (setOftriangleNum.contains(this))
        true
    else if (setOftriangleNum.max() ?: 0 > this)
        false
    else
        generateSequence(setOftriangleNum.size, { it.plus(1) })
                .map { it.triangleNum.apply { setOftriangleNum.add(this) } }
                .takeWhile { it < plus(1) }
                .find { equals(it) } != null


val Int.triangleNum: Int get() = div(2.0).toInt() * plus(1)