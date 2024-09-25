package br.com.kmz;
import br.com.kmz.domin.Produto;

import java.util.List;

public interface daoServiceProduct {
    Integer cadastrar(Produto produto) throws Exception;
    Integer atualizar(Produto produto) throws Exception;
    Produto buscar(String codigo) throws Exception;
    List<Produto> buscaTodos() throws Exception;
    Integer excluir(Produto produto) throws Exception;
}
