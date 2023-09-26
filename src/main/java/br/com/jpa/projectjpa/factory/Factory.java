/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jpa.projectjpa.factory;

import br.com.jpa.projectjpa.entities.Funcionario;
import br.com.jpa.projectjpa.entities.Departmento;
import br.com.jpa.projectjpa.entities.Pessoa;
import br.com.jpa.projectjpa.entities.PessoaFisica;
import br.com.jpa.projectjpa.entities.PessoaJuridica;
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
        
        
        /* Consultando os produtos com as categorias
       manager.getTransaction().begin();
        
        Query query = manager.createQuery("SELECT p FROM Produto p JOIN FETCH p.categorias WHERE p IN p");
        
        List<Produto> produtos = query.getResultList();
        
        manager.getTransaction().commit();
        //manager.close();
        
        for (Produto p: produtos) {
            System.out.println("Nome: " + p.getName());
            System.out.println("Descrição: " + p.getDescription());
            System.out.println("Preço: " + p.getPrice());
            System.out.println("Categorias: " + p.getCategorias().toString());
            System.out.println();
        }*/
        /*
        Departmento d = new Departmento();
        d.setName("Financeiro");
        Departmento d2 = new Departmento();
        d2.setName("Recursos Humanos");
        
        Funcionario f = new Funcionario();
        f.setName("Fulano de Tal");
        f.setMatricula("123456-0");
        f.setCpf("001.002.003-00");
        d.getFuncionarios().add(f);
        
        Funcionario f2 = new Funcionario();
        f2.setName("Fulano de Tal");
        f2.setMatricula("123456-0");
        f2.setCpf("001.002.003-00");
        d.getFuncionarios().add(f2);
        
        Funcionario f3 = new Funcionario();
        f3.setName("Fulano de Tal");
        f3.setMatricula("123456-0");
        f3.setCpf("001.002.003-00");
        d2.getFuncionarios().add(f3);
       
        manager.getTransaction().begin();
        
        manager.persist(f);
        manager.persist(f2);
        manager.persist(f3);
        
        manager.persist(d);
        manager.persist(d2);
        
        manager.getTransaction().commit();
        manager.close();*/
        
        /*manager.getTransaction().begin();
        
        Long id = 4L;
        
        Query query = manager.createQuery("From Funcionario");
        
        Query query2 = manager.createQuery("From Funcionario f WHERE f.id = :id");
        query2.setParameter("id", id);
        
        List<Funcionario> funcionarios = query.getResultList();
        
        Funcionario fun = (Funcionario) query2.getSingleResult();
       
        
        manager.getTransaction().commit();
        manager.close();
        
        System.out.println();
        for (Funcionario f: funcionarios) {
            System.out.println("Nome: "+f.getName());
            System.out.println("Matricula: "+f.getMatricula() );
            System.out.println("CPF: " +f.getCpf());
            System.out.println();
        }
        System.out.println();
        System.out.println("Funcionário pesquisado: " + "["+fun.getName() + "]");*/
        
        //###########################################################################
        
        /*Departmento d = new Departmento();
        d.setName("Financeiro");
        Departmento d2 = new Departmento();
        d2.setName("Recursos Humanos");
        
        Funcionario f = new Funcionario();
        f.setName("Fulano de Tal");
        f.setMatricula("123456-0");
        f.setCpf("001.002.003-00");
        d.getFuncionarios().add(f);
        f.setDepartamento(d);
        
        Funcionario f2 = new Funcionario();
        f2.setName("Fulano de Tal");
        f2.setMatricula("123456-0");
        f2.setCpf("001.002.003-00");
        d.getFuncionarios().add(f2);
        f2.setDepartamento(d2);
        
        Funcionario f3 = new Funcionario();
        f3.setName("Fulano de Tal");
        f3.setMatricula("123456-0");
        f3.setCpf("001.002.003-00");
        d2.getFuncionarios().add(f3);
        f3.setDepartamento(d2);
       
        manager.getTransaction().begin();
        
        manager.persist(f);
        manager.persist(f2);
        manager.persist(f3);
        
        manager.persist(d);
        manager.persist(d2);
        
        manager.getTransaction().commit();
        manager.close();*/
        
        /*manager.getTransaction().begin();
        
        //Manipulação de funcionários
        Long id = 1L;
        String departamento = "Recursos Humanos";
        
        Query query = manager.createQuery("FROM Funcionario");
        List<Funcionario> list = query.getResultList();
                
        Query query2 = manager.createQuery("FROM Funcionario p WHERE p.id = :id");
        query2.setParameter("id", id);
        Funcionario funcionario = (Funcionario) query2.getSingleResult();
        
        Query query3 = manager.createQuery("FROM Funcionario f WHERE f.departamento.name = :departamento");
        query3.setParameter("departamento", departamento);
        List<Funcionario> list2 = query3.getResultList();
        
        //Manipulação de departamentos
        
        Query query4 = manager.createQuery("FROM Departmento");
        List<Departmento> list3 = query4.getResultList();
        
        Query query5 = manager.createQuery("SELECT d FROM Departmento d JOIN FETCH d.funcionarios WHERE d IN d");
        List<Departmento> list4 = query5.getResultList();
        
        //pegando um departamento com os seus funcionarios pela id
        Query query6 = manager.createQuery("SELECT d FROM Departmento d JOIN FETCH d.funcionarios WHERE d.id = 2");
        Departmento dep = (Departmento) query6.getSingleResult();
        //Ou usando o setParameter
        Long id = 2L
        Query query7 = manager.createQuery("SELECT d FROM Departmento d JOIN FETCH d.funcionarios WHERE d.id = :id");
        query7.setParameter("id", id);
        Departmento dep1 = (Departmento) query7.getSingleResult();
        
       
        manager.getTransaction().commit();
        //manager.close();
        /*System.out.println();
        System.out.println("Todos os funcionários");
        for (Funcionario f: list){
            System.out.println("Nome: " + f.getName());
            System.out.println("Matricula: " + f.getMatricula());
            System.out.println("CPF: " + f.getCpf());
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Apenas um funcionário");
        System.out.println("Nome: " + funcionario.getName());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("CPF: " + funcionario.getCpf());
        
        System.out.println();
        System.out.println();
        System.out.println("Todos os funcionários");
        for (Funcionario f2: list2){
            System.out.println("Nome: " + f2.getName());
            System.out.println("Matricula: " + f2.getMatricula());
            System.out.println("CPF: " + f2.getCpf());
            System.out.println("Departamento: " + f2.getDepartamento().getName());
            System.out.println();
        }*/
        
        
        /*System.out.println();
        System.out.println();
        System.out.println("TODOS OS DEPARTAMENTOS");
        for (Departmento d: list3){
            System.out.println("Nome: " + d.getName());
        }
        
        System.out.println();
        System.out.println("OS FUNCIONÁRIOS");
        for (Departmento d2: list4) {
            System.out.println("Categorias: " + d2.getFuncionarios().toString());
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println("UM DEPARTAMENTO");
        System.out.println();
        System.out.println("Nome departamento: " + dep.getName());
        for (Funcionario f: dep.getFuncionarios()){
            System.out.println("Nome funcionários: " + f.getName());
        }*/
        
        //Aqui observem no banco de dados que gera um tabelão com todas as colunas,
        //Mas a desvantagem disso é que muitas colunas ficaram nulas
        //Executem o codigo e analisem a tabela pessoa
        Pessoa p = new Pessoa();
        p.setNome("A Pessoa");
        p.setTipo("P");
        
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Ciclano de Fulano de Tal");
        pf.setCpf("001.002.003-00");
        pf.setTipo("F");
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa Tal");
        pj.setCnpj("00.0001.0003/0001-00");
        pj.setTipo("J");
        
        
        
        manager.getTransaction().begin();
        
        manager.persist(p);
        manager.persist(pf);
        manager.persist(pj);
        
        manager.getTransaction().commit();
        manager.close();
    }

}
