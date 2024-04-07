package br.com.alura.alugames.utilitario

import br.com.alura.alugames.dados.entidades.GamerEntity
import br.com.alura.alugames.modelo.Gamer
import br.com.alura.alugames.modelo.api.InfoGamerJson

fun InfoGamerJson.criaGamer() = Gamer(this.nome, this.email, this.dataNascimento, this.usuario)

fun Gamer.toEntity() =
    GamerEntity(this.id, this.nome, this.email, this.dataNascimento, this.usuario, this.plano.toEntity())

fun GamerEntity.toModel() = Gamer(this.nome, this.email, this.dataNascimento, this.usuario, this.id)
