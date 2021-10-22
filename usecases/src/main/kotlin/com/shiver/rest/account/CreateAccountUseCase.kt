package com.shiver.rest.account

import com.shiver.common.UseCase
import com.shiver.entities.Account
import org.springframework.stereotype.Component

@Component
class CreateAccountUseCase : UseCase<Unit, Account> {
    override fun execute(input: Unit): Account {
        TODO("Not yet implemented")
    }
}