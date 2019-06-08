package com.neuroid.neuinterview.model


class Question {
    var qid: Int = 1
    var category:String? = null
    var question:String? =null
    var answer:String? = null

    constructor(id: Int, category: String, question:String, answer:String) {
        this.qid = id
        this.category = category
        this.question = question
        this.answer= answer
    }
}