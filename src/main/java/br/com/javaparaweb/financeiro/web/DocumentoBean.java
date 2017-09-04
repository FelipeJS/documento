package br.com.javaparaweb.financeiro.web;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.TreeNode;

import br.com.javaparaweb.financeiro.documento.Documento;
import br.com.javaparaweb.financeiro.documento.DocumentoBusiness;

@ManagedBean(name = "documentoBean")
@ViewScoped
public class DocumentoBean implements Serializable {
	private static final long serialVersionUID = -3089755655689809372L;

	private TreeNode raiz;
	private Documento documentoSelecionado;
	private String statusSelecionado;
	private Date dataAtual;

	@ManagedProperty("#{documentoBusiness}")
	private DocumentoBusiness documentoBusiness;

	@PostConstruct
	public void init() {
		raiz = documentoBusiness.createDocuments();
		dataAtual = new Date();
	}

	public String salvarPasta() {
		return null;
	}

	public String criar() {
		return null;
	}

	public String atualizar() {
		return null;
	}

	public String excluir() {
		return null;
	}

	public TreeNode getRaiz() {
		return raiz;
	}

	public void setDocumentoBusiness(DocumentoBusiness documentoBusiness) {
		this.documentoBusiness = documentoBusiness;
	}

	public Documento getDocumentoSelecionado() {
		return documentoSelecionado;
	}

	public void setDocumentoSelecionado(Documento documentoSelecionado) {
		this.documentoSelecionado = documentoSelecionado;
	}

	public String getStatusSelecionado() {
		return statusSelecionado;
	}

	public void setStatusSelecionado(String statusSelecionado) {
		this.statusSelecionado = statusSelecionado;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}
}