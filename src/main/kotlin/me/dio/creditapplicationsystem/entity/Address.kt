package me.dio.creditapplicationsystem.entity

import jakarta.persistence.Embeddable

@Embeddable
class Address {
    var zipCode: String = "";
    var street: String = "";
}
