package br.com.alura.alugames.utilitario

import br.com.alura.alugames.dados.entidades.JogoEntity
import br.com.alura.alugames.modelo.api.InfoJogoJson
import br.com.alura.alugames.modelo.Jogo

fun InfoJogoJson.criaJogo() = Jogo(this.titulo, this.capa, this.preco, this.descricao)

fun Jogo.toEntity() = JogoEntity(this.titulo, this.capa, this.preco, this.descricao, this.id)

fun JogoEntity.toModel() = Jogo(this.titulo, this.capa, this.preco, this.descricao, this.id)
