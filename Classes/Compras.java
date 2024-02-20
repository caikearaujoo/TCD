package tcd;

import java.util.ArrayList;
import java.util.List;

public class Compras {
    private String objeto;
    private double precoTotal;
    private List<Object> itens;
    private List<Integer> qtdItens;

    public Compras(String tipo) {
        this.objeto = tipo;
        this.precoTotal = 0.0;
        this.itens = new ArrayList<>();
        this.qtdItens = new ArrayList<>();
    }
    
    public void calcularPrecoTotal() {
        precoTotal = 0.0; //seta como 0 antes de fazer a soma dos preços
        
        for (int i = 0; i < itens.size(); i++) {
            Object item = itens.get(i);
            if (item instanceof Quarto) //se o item for da classe Quarto, faz X
            {
                precoTotal += ((Quarto) item).getDiariaCdesc();
            }
            else if (item instanceof Carros) 
            {
                precoTotal += ((Carros) item).getDiariaCdesc(); //se o item for da classe Carros, faz X
            } 
            else if (item instanceof Voos) 
            {
                precoTotal += ((Voos) item).getPreco(); //se o item for da classe Voos, faz X
            }
        }
    }
    
    public void adicionarItem(Object item) {
        itens.add(item); //adiciona no array
        
        int indice = itens.indexOf(item); //essa indexOf pega o indice do item que foi adicionado no array, p relacionar com o array de quantidade de itens
        
        if (indice < qtdItens.size()) {
            qtdItens.set(indice, qtdItens.get(indice) + 1);//+1 no indice de qnd toda vez que o array de itens for incrementado
        } else {
            qtdItens.add(1);
        }
    }

    public void removerItem(Object item) {
        int indice = itens.indexOf(item);
        
        if (indice>= 0) { //se o indice do item que deseja ser retirado for válido, remover o objeto do array de itens e o inteiro do valor de qtd itens
            itens.remove(indice);
            qtdItens.remove(indice);
        }
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String tipo) {
        this.objeto = tipo;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public List<Object> getItens() {
        return itens;
    }
    
}
