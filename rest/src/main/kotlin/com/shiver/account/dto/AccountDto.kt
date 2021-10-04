package com.shiver.account.dto

import com.shiver.entities.Account
import java.util.*

data class AccountDto(val id: UUID) {
    fun toAccount() = Account(id)
}

fun Account.toAccountDto() = AccountDto(id)