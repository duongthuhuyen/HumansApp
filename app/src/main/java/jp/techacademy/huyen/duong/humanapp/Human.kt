package jp.techacademy.huyen.duong.humanapp

import android.util.Log

class Human : Animal, Thinkable {
    var hobby: String

    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d(MY_TAG, "私の名前は" + name + "です。年は" + age + "歳です。")
    }

    override fun think() {
        Log.d(MY_TAG, "「私は" + hobby + "について考える。」")
    }
}