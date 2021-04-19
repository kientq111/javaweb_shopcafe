/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Article;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.Article;
import java.sql.Statement;

/**
 *
 * @author KenKen
 */
public class ArticleDAO extends DBContext {

    public ArrayList<Article> getAllArticle() {
        ArrayList<Article> ars = new ArrayList<>();
        try {
            String sql = "select * from Article";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Article a = new Article(rs.getInt("id"),
                        rs.getString("tittle"),
                        rs.getString("detail"),
                        rs.getString("img"),
                        rs.getInt("catID"));
                ars.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ars;
    }

    public ArrayList<Article> getArticleList(int cID) {
        ArrayList<Article> ars = new ArrayList<>();
        try {
            String sql = "select * from Article  WHERE catID ='" + cID + "' ORDER BY id DESC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Article a = new Article(rs.getInt("id"),
                        rs.getString("tittle"),
                        rs.getString("detail"),
                        rs.getString("img"),
                        rs.getInt("catID"));
                ars.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ars;
    }

    public ArrayList<Article> getArticleListByTitle(String value) {
        ArrayList<Article> ars = new ArrayList<>();
        try {
            String sql = "select * from Article";
            if (!value.trim().isEmpty()) {
                sql += " where tittle like '%" + value + "%'";
            }
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Article a = new Article(rs.getInt("id"),
                        rs.getString("tittle"),
                        rs.getString("detail"),
                        rs.getString("img"),
                        rs.getInt("catID"));
                ars.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ars;
    }

    public ArrayList<Article> getArticleDetail(int id) {
        ArrayList<Article> ars = new ArrayList<>();
        try {
            String sql = "select * from Article WHERE id ='" + id + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Article a = new Article(rs.getInt("id"),
                        rs.getString("tittle"),
                        rs.getString("detail"),
                        rs.getString("img"),
                        rs.getInt("catID"));
                ars.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ars;
    }

    public Article getArticlebyid(int id) {

        try {
            String sql = "select * from Article WHERE id = '" + id + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Article a = new Article(rs.getInt("id"),
                        rs.getString("tittle"),
                        rs.getString("detail"),
                        rs.getString("img"),
                        rs.getInt("catID"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean addArticle(String tittle, String detail, String img, int catID) {
        try {
            Statement stm = connection.createStatement();
            String strInsert = "insert into Article values('" + tittle + "','" + detail + "','" + img + "','" + catID + "')";
            stm.execute(strInsert);
            return true;
        } catch (Exception e) {
            System.out.println("Insert fail: " + e.getMessage());
            return false;
        }
    }

    public boolean updateArticle(int id, String tittle, String detail, String img, int catID) {
        try {
            Statement stm = connection.createStatement();
            String update = "UPDATE Article SET tittle='" + tittle + "',detail='" + detail + "',img='" + img + "',catID='" + catID + "' WHERE id='" + id + "' ";
            stm.execute(update);
            return true;
        } catch (Exception e) {
            System.out.println("Update fail: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteArticle(int id) {
        try {
            Statement stm = connection.createStatement();
            String del = "DELETE FROM Article WHERE id='" + id + "' ";
            stm.execute(del);
            return true;
        } catch (Exception e) {
            System.out.println("Delete fail: " + e.getMessage());
            return false;
        }
    }

}
