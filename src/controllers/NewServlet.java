package controllers;

import java.io.IOException;
import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Task;
import utils.DBUtil;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/new")
public class NewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();
        em.getTransaction().begin();

        //Taskのインスタンスを生成
        Task m = new Task();

        // mの各プロパティ
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        m.setCreated_at(currentTime);
        m.setUpdated_at(currentTime);

        String content = "programing";
        m.setContent(content);

        //データベースに保存
        em.persist(m);
        // データの新規登録を確定させる。
        em.getTransaction().commit();

        //プリント内容を取得し、戻す
        response.getWriter().append(Integer.valueOf(m.getId()).toString());

        em.close();
    }

}
