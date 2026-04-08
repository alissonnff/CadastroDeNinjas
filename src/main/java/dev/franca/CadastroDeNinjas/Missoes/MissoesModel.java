package dev.franca.CadastroDeNinjas.Missoes;


import dev.franca.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Character rank;
    private NinjaModel ninja;
    private String statusMissao;

    public MissoesModel() {
    }

    public MissoesModel(Long id, Long idNinja, String nome, Character rank) {
        this.id = id;
        this.getIdNinja();
        this.nome = nome;
        this.rank = rank;
        this.statusMissao = statusMissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdNinja() {
        return getIdNinja();
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRank() {
        return rank;
    }

    public void setRank(Character rank) {
        this.rank = rank;
    }
}
