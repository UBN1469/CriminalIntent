package com.bignerdranch.criminalintent

import java.util.*

//  это слой модель
data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(), // конструктор по умолчанию задаёт текущую дату
                 var isSolved : Boolean = false)
