package com.dev.sk.launchpad.domain.usecase

import com.dev.sk.launchpad.domain.base.UseCase
import kotlinx.coroutines.flow.Flow

class GetCurrenciesUseCase(): UseCase<Void, Flow<Map<String, String>?>> {
    override suspend fun execute(request: Void): Flow<Map<String, String>?> {

    }
}