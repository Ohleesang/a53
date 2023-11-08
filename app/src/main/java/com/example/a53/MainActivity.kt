package com.example.a53

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(k: Int, score: IntArray): IntArray {
                var answer: IntArray = intArrayOf()
                //k : 명예의전당 목록의 점수의 개수
                //1~마지막날 가수들의 점수 score
                var rank = mutableListOf<Int>()
                var out = mutableListOf<Int>()

                for(index in 0 until score.size){

                    rank.add(score[index])
                    rank.sortDescending()
                    if(rank.size==k+1) rank.removeLast()

                    out.add(rank.last())

                }
                answer= out.toIntArray()
                return answer
            }
        }
        var a =Solution()
        a.solution(3,intArrayOf(10, 100, 20, 150, 1, 100, 200))
        a.solution(4,intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000))

    }
}