package com.example.covidtracker

enum class Metric{
    NEGATIVE,POSITIVE,DEATH
}

enum class timeScale(val numDays:Int){
    WEEK(7),
    MONTH(30),
    MAX(-1)
}