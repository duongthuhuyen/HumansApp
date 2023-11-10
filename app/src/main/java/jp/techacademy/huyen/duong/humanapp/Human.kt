package jp.techacademy.huyen.duong.humanapp

import android.util.Log

class Human(var hobby: String, name: String, age: Int) : Animal(name, age), Thinkable {
    override fun say() {
        Log.d(MY_TAG, "私の名前は" + name + "です。年は" + age + "歳です。")
    }

    override fun think() {
        Log.d(MY_TAG, "「私は" + hobby + "について考える。」")
    }
}