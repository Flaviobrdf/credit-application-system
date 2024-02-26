package me.dio.creditapplicationsystem.entity

import jakarta.persistence.*

@Entity
@Table (name = "Cliente")
class Customer {
    @Column(nullable = false) val firstName: String ="";
    @Column(nullable = false) val lastName: String ="";
    @Column(nullable = false, unique = true) val cpf: String = "";
    @Column(nullable = false, unique = true) val email: String = "";
    @Column(nullable = false) val password:String = "";
    @Column(nullable = false) @Embedded val address: Address = Address();
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY,
        cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST),
        mappedBy = "customer")
    val credits: List<Credit> = mutableListOf();
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id:Long? = null;
}