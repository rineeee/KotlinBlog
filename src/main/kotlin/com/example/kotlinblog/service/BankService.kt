package com.example.kotlinblog.service

import com.example.kotlinblog.datasource.BankDataSource
import com.example.kotlinblog.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}