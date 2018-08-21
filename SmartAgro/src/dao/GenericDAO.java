package dao;

import apoio.HibernateUtil;
import apoio.Validacao;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericDAO<Object> {
    
    final static Logger LOGGER = LoggerFactory.getLogger(GenericDAO.class);

    public boolean salvar(Object o) {

        Boolean r = false;

        Session sessao = null;

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            sessao.save(o);

            t.commit();

            r = true;

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {

            sessao.close();
        }

        return r;

    }

    public ArrayList<Object> consultarTodos(String className) {

        ArrayList resultado = null;

        Session sessao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from " + className);

            resultado = (ArrayList) q.list();

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }

        return resultado;

    }

    public boolean atualizar(Object o) {

        Boolean r = false;

        Session sessao = null;

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            sessao.update(o);

            t.commit();

            r = true;

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return r;
    }

    public boolean deletar(Object o) {

        Boolean r = false;

        Session sessao = null;

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            sessao.delete(o);

            t.commit();

            r = true;

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return r;
    }

    public Object consultarPorId(int id, String className) {
        Object o = null;
        Session sessao = null;

        try {

            sessao = HibernateUtil.getSessionFactory().openSession();

            sessao.beginTransaction();

            org.hibernate.Query q = sessao.createQuery("from " + className + " where id = :idParam");

            q.setInteger("idParam", id);

            o = (Object) q.uniqueResult();

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }

        return o;
    }

    public ArrayList<Object> consultarComCriterio(String className, String criterio, String valor) {

        return realizaConsulta(false, className, criterio, valor);
    }

    public ArrayList<Object> consultarComCriterioIgualA(String className, String criterio, String valor) {

        return realizaConsulta(true, className, criterio, valor);
    }

    private ArrayList<Object> realizaConsulta(boolean valorExato, String className, String criterio, String valor) {
        ArrayList resultado = null;

        Session sessao = null;
        try {

            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            String sql = "from " + className;

            // Verifica se o critério é um numero, se for, não usa o upper
            if (Validacao.isNumeric(valor)) {
                sql = sql + " where " + criterio + " = :criterio";
            } else {
                sql = sql + " where upper(" + criterio + ") like upper(:criterio)";
            }

            org.hibernate.Query q = sessao.createQuery(sql);

            if (Validacao.isNumeric(valor)) {
                q.setInteger("criterio", Integer.parseInt(valor));
            } else {
                if (valorExato) {
                    q.setString("criterio", valor);
                } else {
                    q.setString("criterio", "%" + valor + "%");
                }
            }

            resultado = (ArrayList) q.list();

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }

        return resultado;
    }

    public boolean existeRegistro(String className, String criterio, String valor) {

        ArrayList resultado = consultarComCriterioIgualA(className, criterio, valor);

        return (resultado.size() > 0);

    }

}
