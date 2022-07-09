package com.martarello.teste.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Pedido implements Serializable {


    private static final long serialVersionUID = -8331273576686692174L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoid;
    private Instant datahora;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    public Pedido() {
    }

    public Pedido(Long pedidoid, Instant datahora, Usuario cliente) {
        this.pedidoid = pedidoid;
        this.datahora = datahora;
        this.cliente = cliente;
    }

    public Long getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(Long pedidoid) {
        this.pedidoid = pedidoid;
    }

    public Instant getDatahora() {
        return datahora;
    }

    public void setDatahora(Instant datahora) {
        this.datahora = datahora;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(pedidoid, pedido.pedidoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoid);
    }
}
