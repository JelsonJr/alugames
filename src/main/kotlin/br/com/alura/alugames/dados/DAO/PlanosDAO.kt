package br.com.alura.alugames.dados.DAO

import br.com.alura.alugames.dados.entidades.plano.PlanoEntity
import br.com.alura.alugames.modelo.plano.Plano
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class PlanosDAO(manager: EntityManager): DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {
    override fun toEntity(objeto: Plano) = objeto.toEntity()

    override fun toModel(entity: PlanoEntity) = entity.toModel()
}
