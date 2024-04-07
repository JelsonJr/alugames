package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.BancoDeDados
import br.com.alura.alugames.dados.DAO.GamersDAO
import br.com.alura.alugames.dados.DAO.PlanosDAO
import br.com.alura.alugames.modelo.Gamer

fun main(){
    val gamer = Gamer("Monica", "monica@email.com", "15/03/1995", "moni")

    val manager = BancoDeDados.getEntityManager()
    val gamerDAO = GamersDAO(manager)
    val planosDAO = PlanosDAO(manager)

    gamer.plano = planosDAO.recuperarPeloId(3)

    gamerDAO.adicionar(gamer)

    val listaGamersBanco = gamerDAO.getLista()
    println(listaGamersBanco)

    manager.close()
}