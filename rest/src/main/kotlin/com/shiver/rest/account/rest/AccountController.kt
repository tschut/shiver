package com.shiver.rest.account.rest

import com.shiver.rest.account.CreateAccountUseCase
import com.shiver.rest.account.dto.AccountDto
import com.shiver.rest.account.dto.toAccountDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/accounts")
class AccountController(
    private val createAccountUseCase: CreateAccountUseCase,
) {

    @PostMapping("/")
    suspend fun createAccount(): AccountDto {
        return createAccountUseCase.execute(Unit).toAccountDto()
    }
}