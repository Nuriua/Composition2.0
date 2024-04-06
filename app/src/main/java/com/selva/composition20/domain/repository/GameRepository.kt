package com.selva.composition20.domain.repository

import com.selva.composition20.domain.entity.GameSettings
import com.selva.composition20.domain.entity.Level
import com.selva.composition20.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}