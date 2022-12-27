package com.example.kotlinblog.datasource

import com.example.kotlinblog.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}