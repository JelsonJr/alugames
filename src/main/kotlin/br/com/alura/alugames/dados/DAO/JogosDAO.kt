package br.com.alura.alugames.dados.DAO

import br.com.alura.alugames.dados.entidades.JogoEntity
import br.com.alura.alugames.modelo.Jogo
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class JogosDAO(manager: EntityManager) : DAO<Jogo, JogoEntity>(manager, JogoEntity::class.java) {

    override fun toEntity(objeto: Jogo) = objeto.toEntity()

    override fun toModel(entity: JogoEntity) = entity.toModel()
}
