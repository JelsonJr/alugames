package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.DAO.AluguelDAO
import br.com.alura.alugames.dados.BancoDeDados
import br.com.alura.alugames.dados.DAO.GamersDAO
import br.com.alura.alugames.dados.DAO.JogosDAO
import br.com.alura.alugames.modelo.Periodo

fun main() {
    val manager = BancoDeDados.getEntityManager()
    val jogoDAO = JogosDAO(manager)
    val gamerDAO = GamersDAO(manager)
    val aluguelDAO = AluguelDAO(manager)

    val gamer = gamerDAO.recuperarPeloId(1)
    val jogo = jogoDAO.recuperarPeloId(1)
    val aluguel = gamer.alugaJogo(jogo, Periodo())

    aluguelDAO.adicionar(aluguel)

    val listaAluguel = aluguelDAO.getLista()
    println(listaAluguel)

    manager.close()
}