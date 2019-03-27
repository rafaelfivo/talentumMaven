/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Entity;

import javax.annotation.PostConstruct;
import model.DAO.CapacidadeDAO;
import model.DAO.ConFinalDAO;
import model.DAO.CursoDAO;
import model.DAO.EleCompetenciasDAO;
import model.DAO.ObjConhecimentoDAO;
import model.DAO.UniCompetenciasDAO;

/**
 *
 * @author oem
 */
public class PosConstruct {

    CapacidadeDAO capacidadeDAO = new CapacidadeDAO();//x
    ConFinalDAO conFinalDAO = new ConFinalDAO();//x
    CursoDAO cursoDAO = new CursoDAO();//x
    EleCompetenciasDAO eleCompetenciasDAO = new EleCompetenciasDAO();//x
    ObjConhecimentoDAO conhecimentoDAO = new ObjConhecimentoDAO();//x
    UniCompetenciasDAO uniCompetenciasDAO = new UniCompetenciasDAO(); //x

    UniCopetencias uniCopetencias = new UniCopetencias();
    EleCompetencias eleCompetencias = new EleCompetencias();
    Curso curso = new Curso();
    Capacidade capacidade = new Capacidade();
    ObjConhecimento obj = new ObjConhecimento();
    ConFinal cf = new ConFinal();

    @PostConstruct
    public void create() {

        curso.setHoras(23);
        curso.setDescricao("test");
        curso.setNome("test");
        cursoDAO.save(curso);

        uniCopetencias.setDescricao("test");
        uniCopetencias.setCurso(curso);
        uniCompetenciasDAO.save(uniCopetencias);

        eleCompetencias.setDescricao("test");
        eleCompetencias.setUniCopetencias(uniCopetencias);
        eleCompetenciasDAO.save(eleCompetencias);
                    
        capacidade.setDescricao("testcap");
        capacidade.setTipo(1);
        capacidade.setCurso(curso);
        capacidadeDAO.save(capacidade);
        
        obj.setDescricao("testeobj");
        obj.setCurso(curso);
        conhecimentoDAO.save(obj);
        
        cf.setListObj("teste");
        cf.setComp(eleCompetencias);
        cf.setUni(uniCopetencias);
        conFinalDAO.save(cf);
    }

}
