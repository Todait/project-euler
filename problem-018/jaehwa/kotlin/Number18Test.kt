package lee.eulerproject

import lee.eulerproject.problem.getMaxSum
import lee.eulerproject.problem.getTriangleSum
import lee.eulerproject.problem.mergeArray
import lee.eulerproject.problem.triangleArray18
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals


class Number18Test : Spek({

    describe("18번의 정답을 구한다") {

        it("18번의 정답은 1078이다") {
            assertEquals(getTriangleSum(triangleArray18), 1074)
        }
    }

    describe("mergeArray가 동작을 하는지") {

        on("array1이 75이고, array2가 95,64를 원소로 가지고 있다면") {

            val array1: Array<Int> = arrayOf(75)
            val array2: Array<Int> = arrayOf(95, 64)

            it("mergeArray 는 170이 나와야 한다") {
                assertEquals(mergeArray(array2, array1).toMutableList(), mutableListOf(170))
            }
        }


        on("array1이 17, 47, 82 이고, array2가 18, 35, 87, 10를 원소로 가지고 있다면") {

            val array1: Array<Int> = arrayOf(17, 47, 82)
            val array2: Array<Int> = arrayOf(18, 35, 87, 10)

            it("mergeArray 는 52, 134, 169이 나와야 한다") {
                assertEquals(mergeArray(array2, array1).toMutableList(), mutableListOf(52, 134, 169))
            }
        }
    }

    describe("getMaxSum 잘 동작을 하는지") {

        it("bottomA : 18 , bottomB :35 , top: 17 이면 답은 52이다") {
            assertEquals(getMaxSum(18, 35, 17), 52)
        }

        it("bottomA : 4 , bottomB :62 , top: 63 이면 답은 52이다") {
            assertEquals(getMaxSum(4, 62, 63), 125)
        }
    }


    describe("getTriangleSum 잘 동작을 하는지") {


        on("18번 예제에 나온 삼각형에서") {

            val array1: Array<Int> = arrayOf(3)
            val array2: Array<Int> = arrayOf(7, 4)
            val array3: Array<Int> = arrayOf(2, 4, 6)
            val array4: Array<Int> = arrayOf(8, 5, 9, 3)

            val triangleArray: Array<Array<Int>> = arrayOf(array1, array2, array3, array4)

            it("큰 합을 갖는 경로는 23이다") {
                assertEquals(getTriangleSum(triangleArray), 23)
            }
        }
    }
})