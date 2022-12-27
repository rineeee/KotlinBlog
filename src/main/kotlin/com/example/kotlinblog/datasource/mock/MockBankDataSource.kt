package com.example.kotlinblog.datasource.mock

import com.example.kotlinblog.datasource.BankDataSource
import com.example.kotlinblog.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource{

    val banks = listOf(
        Bank("1234",3.14,17),
        Bank("124",3.14,17),
        Bank("123",3.14,17),
    )
    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank =
        banks.first { it.accountNumber == accountNumber }

}
