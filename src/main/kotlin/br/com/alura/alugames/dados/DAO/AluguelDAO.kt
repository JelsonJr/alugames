package br.com.alura.alugames.dados.DAO

import br.com.alura.alugames.dados.entidades.AluguelEntity
import br.com.alura.alugames.modelo.Aluguel
import br.com.alura.alugames.utilitario.toEntity
import br.com.alura.alugames.utilitario.toModel
import javax.persistence.EntityManager

class AluguelDAO(manager: EntityManager) : DAO<Aluguel, AluguelEntity>(manager, AluguelEntity::class.java) {
    override fun toEntity(objeto: Aluguel) =
        AluguelEntity(objeto.gamer.toEntity(), objeto.jogo.toEntity(), objeto.periodo)
            .apply {
                valorDoAluguel = objeto.valorDoAluguel
                id = objeto.id
            }

    override fun toModel(entity: AluguelEntity) =
        Aluguel(entity.gamer.toModel(), entity.jogo.toModel(), entity.periodo)
            .apply {
                id = entity.id
            }
}