package com.shiver.account.rest

import com.shiver.account.CreateAccountUseCase
import com.shiver.account.dto.AccountDto
import com.shiver.account.dto.toAccountDto
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