package me.dio.creditapplicationsystem.service.impl

import me.dio.creditapplicationsystem.entity.Credit
import me.dio.creditapplicationsystem.repository.CreditRepository
import me.dio.creditapplicationsystem.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException


@Service
abstract class CreditService (
    private val creditRepository: CreditRepository): ICreditService {
     override fun save(credit: Credit): Credit {
        return this.creditRepository.save(credit)
    }

     override fun findAllByCustomer(customerId: Long): List<Credit> {
        TODO("Not yet implemented")
    }

    fun findByCreditCode(customerId: Long, creditCode: UUID) {
        val credit = this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException ("Creditcode $creditCode not found")
    }


}