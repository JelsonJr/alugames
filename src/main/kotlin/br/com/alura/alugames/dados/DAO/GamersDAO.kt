package br.com.alura.alugames.dados.DAO

import br.com.alura.alugames.dados.entidades.GamerEntity
import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class GamersDAO(manager: EntityManager) : DAO<Gamer, GamerEntity>(manager, GamerEntity::class.java) {

    override fun toEntity(objeto: Gamer) = objeto.toEntity()

    override fun toModel(entity: GamerEntity) = entity.toModel().apply { plano = entity.plano.toModel() }
}
