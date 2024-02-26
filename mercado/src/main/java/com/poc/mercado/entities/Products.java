package com.poc.mercado.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 60)
    private String categoria;
    @Column(nullable = false)
    private Integer quantidade_disponivel;
    @Column(nullable = false, length = 180)
    private String nome;
    @Column(nullable = false)
    private Double valor_unidade;
    @Column(nullable = false)
    private String url_Image;

    public Products(Long id, String categoria, Integer quantidade_disponivel, String nome, Double valor_unidade, String url_Image) {
        super();
        this.id = id;
        this.categoria = categoria;
        this.quantidade_disponivel = quantidade_disponivel;
        this.nome = nome;
        this.valor_unidade = valor_unidade;
        this.url_Image = url_Image;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantidade_disponivel() {
        return quantidade_disponivel;
    }

    public void setQuantidade_disponivel(Integer quantidade_disponivel) {
        this.quantidade_disponivel = quantidade_disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor_unidade() {
        return valor_unidade;
    }

    public void setValor_unidade(Double valor_unidade) {
        this.valor_unidade = valor_unidade;
    }

    public String getUrl_Image() {
        return url_Image;
    }

    public void setUrl_Image(String url_Image) {
        this.url_Image = url_Image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
