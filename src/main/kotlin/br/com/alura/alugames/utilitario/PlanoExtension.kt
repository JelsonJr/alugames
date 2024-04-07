package br.com.alura.alugames.utilitario

import br.com.alura.alugames.dados.entidades.plano.PlanoAssinaturaEntity
import br.com.alura.alugames.dados.entidades.plano.PlanoAvulsoEntity
import br.com.alura.alugames.dados.entidades.plano.PlanoEntity
import br.com.alura.alugames.modelo.plano.Plano
import br.com.alura.alugames.modelo.plano.PlanoAssinatura
import br.com.alura.alugames.modelo.plano.PlanoAvulso

fun Plano.toEntity(): PlanoEntity {
    return if (this is PlanoAssinatura) {
        PlanoAssinaturaEntity(this.tipo, this.mensalidade, this.jogosIncluidos, this.percentualDescontoReputacao, this.id)
    } else {
        PlanoAvulsoEntity(this.tipo, this.id)
    }
}

fun PlanoEntity.toModel(): Plano {
    return if (this is PlanoAssinaturaEntity) {
        PlanoAssinatura(this.tipo, this.mensalidade, this.jogosIncluidos, this.percentualDescontoReputacao, this.id)
    } else {
        PlanoAvulso(this.tipo, this.id)
    }
}