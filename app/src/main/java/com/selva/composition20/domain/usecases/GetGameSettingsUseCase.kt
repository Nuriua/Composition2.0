package com.selva.composition20.domain.usecases

import com.selva.composition20.domain.entity.GameSettings
import com.selva.composition20.domain.entity.Level
import com.selva.composition20.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}