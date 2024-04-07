package br.com.alura.alugames.dados.entidades.plano

import javax.persistence.DiscriminatorValue
import javax.persistence.Entity

@Entity
@DiscriminatorValue("Avulso")
class PlanoAvulsoEntity(tipo: String = "Plano Avulso", id: Int = 0) : PlanoEntity(tipo, id)