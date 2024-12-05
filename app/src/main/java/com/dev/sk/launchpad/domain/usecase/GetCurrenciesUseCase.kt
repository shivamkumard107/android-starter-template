package com.dev.sk.launchpad.domain.usecase

import com.dev.sk.launchpad.domain.base.UseCase

class GetCurrenciesUseCase(): UseCase<Void, Map<String, String>?> {
    override suspend fun execute(request: Void): Map<String, String>? {

    }
}