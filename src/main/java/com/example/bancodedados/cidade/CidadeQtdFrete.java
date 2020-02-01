package com.example.bancodedados.cidade;

import com.example.bancodedados.cidade.Cidade;

public class CidadeQtdFrete {
    Cidade cidade;
    Long QTDFRete;

    public CidadeQtdFrete(Cidade cidade, Long QTDFRete) {
        this.cidade = cidade;
        this.QTDFRete = QTDFRete;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Long getQTDFRete() {
        return QTDFRete;
    }
}
