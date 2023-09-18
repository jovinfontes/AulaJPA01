/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jpa.projectjpa.factory;

import br.com.jpa.projectjpa.entities.Categoria;
import br.com.jpa.projectjpa.entities.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author cfontes
 */
public class Factory {

    public static void main(String[] args) {
        //Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
        EntityManager manager = factory.createEntityManager();
        
        
        /* Criando os objetos
        Categoria c = new Categoria();
        c.setName("Jogos");
        Produto p = new Produto();
        p.setName("Notbook Gamer RTX 4060");
        p.setDescription("Bixinnn");
        p.setPrice(2500.0);*/
        
        //p.getCategorias().add(c);
        //c.getProdutos().add(p);
        
        /* Persistindo categoria e produtos
        manager.getTransaction().begin();
        manager.persist(c);
        manager.persist(p);
        manager.getTransaction().commit();
        manager.close();*/
        
        
        
        /* persistindo um novo produto na categoria 1
        manager.getTransaction().begin();
        
        Categoria c = manager.find(Categoria.class, 1L);
        manager.persist(p);
        p.getCategorias().add(c);
        manager.getTransaction().commit();
        manager.close();*/
        
       /* Listando um coleção de produtos
        manager.getTransaction().begin();
        
        Query query = manager.createQuery("FROM Produto");
        
        List<Produto> produtos = query.getResultList();
        
       
        manager.getTransaction().commit();
        manager.close();
        
        
        for (Produto p: produtos) {
            System.out.println("Nome: " + p.getName());
            System.out.println("Descrição: " + p.getDescription());
            System.out.println("Preço: " + p.getPrice());
            
            System.out.println();
        }*/
        
        
        manager.getTransaction().begin();
        
        Query query = manager.createQuery("SELECT p FROM Produto p JOIN p.categorias c WHERE c.id = p.categorias.id");
        
        List<Produto> produtos = query.getResultList();
        
        manager.getTransaction().commit();
        manager.close();
        
        for (Produto p: produtos) {
            System.out.println("Nome: " + p.getName());
            System.out.println("Descrição: " + p.getDescription());
            System.out.println("Preço: " + p.getPrice());
            System.out.println();
        }

    }

}
