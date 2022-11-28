package br.com.company.models;

import br.com.company.enums.Area;
import br.com.company.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Colaborador {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "nome")
  @Size(min = 5, max = 35, message = "O nome deve conter no mínimo 5 caratcters")
  @NotBlank(message = "O nome não pode ser Vazio.")
  private String nome;

  @Column(name = "area")
  @Enumerated(EnumType.STRING)
  @NotNull(message = "O campo não pode ser Nulo.")
  private Area area;

  @Column(name = "matricula")
  @NotNull(message = "Clique no botão Gerar.")
  @Size(min = 3, message = "Clique no botão para gerar Automaticamente.")
  private String matricula;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  @NotNull(message = "O campo não pode ser Nulo.")
  private Status status;

  @NotBlank(message = "O campo não pode ser Vazio.")
  @Column(name = "turno")
  @Size(min = 4, message = "No minimo 4 caracteres. O Turno não pode ser vazio.")
  private String turno;

}
