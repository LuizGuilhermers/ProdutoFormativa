package com.AvaliacaoFormativa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

	@Entity
	@Table(name = "produto")
	public class Produto {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@NotBlank
		@Column
		private String descricao;
		
		@NotNull
		@NotBlank
		@Column
		private String tipo;
		
		@NotNull
		@Column
		private double preco;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		

		

}
