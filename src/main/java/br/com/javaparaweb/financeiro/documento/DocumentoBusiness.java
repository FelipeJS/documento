package br.com.javaparaweb.financeiro.documento;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name = "documentoBusiness")
@ApplicationScoped
public class DocumentoBusiness {
	public TreeNode createDocuments() {
        TreeNode raiz = new DefaultTreeNode(new Documento("OF3040", "Contribuição SMS", "A SMS enviou a constribuição", new Date(), "30 KB", "Pasta"), null);
         
        TreeNode documentos = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos1 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos1 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos2 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos2 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos3 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos3 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos4 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos4 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos5 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos5 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos6 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos6 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos7 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode foto7 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode documentos8 = new DefaultTreeNode(new Documento("OF3041", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), raiz);
        TreeNode fotos8 = new DefaultTreeNode(new Documento("OF3042", "Restituicao SMS", "Assunto da restituição", new Date(), "30 KB", "Pasta"), raiz);
         
        TreeNode arquivosRecebidos = new DefaultTreeNode(new Documento("OF3043", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), documentos);
        TreeNode arquivosEnviados = new DefaultTreeNode(new Documento("OF3044", "Renovação", "Assunto da renovação", new Date(), "30 KB", "Pasta"), documentos);
         
        //Documents
        TreeNode expenses = new DefaultTreeNode("document", new Documento("", "NomeArquivo.doc", "Primeiro Doc assunto", new Date(), "30 KB", "Word Document"), arquivosRecebidos);
        TreeNode resume = new DefaultTreeNode("document", new Documento("", "NomeAssunto.pdf", "Primeiro Doc assunto", new Date(), "60 KB", "PDF"), arquivosRecebidos);
        TreeNode refdoc = new DefaultTreeNode("document", new Documento("", "Slides.ppt", "PPT recebido", new Date(), "40 KB", "PPT"), arquivosEnviados);
         
        //Pictures
        TreeNode barca = new DefaultTreeNode("picture", new Documento("", "Imagem1.png", "Primeiro Doc assunto", new Date(), "150 KB", "PNG Image"), fotos);
        TreeNode primelogo = new DefaultTreeNode("picture", new Documento("", "Imagem2.png", "Primeiro Doc assunto", new Date(), "96 KB", "PNG Image"), fotos);
         
        return raiz;
    }
}