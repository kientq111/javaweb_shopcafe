/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Comment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KenKen
 */
public class CommentDAO extends DBContext {

    public ArrayList<Comment> getCommentbyID(int Article_ID) {
        ArrayList<Comment> cmtList = new ArrayList<>();
        try {
            String sql = "select * from Comment where CheckCmt = 1 AND Article_ID = '" + Article_ID + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Comment cmt = new Comment(rs.getInt("Article_ID"),
                        rs.getString("account_username"),
                        rs.getString("cmt"),
                        rs.getInt("CheckCmt"),
                        rs.getInt("CmtID"));
                cmtList.add(cmt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmtList;
    }

    public ArrayList<Comment> getCommentbyIDAdmin(int Article_ID) {
        ArrayList<Comment> cmtList = new ArrayList<>();
        try {
            String sql = "select * from Comment where CheckCmt = 0 AND Article_ID = '" + Article_ID + "'";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Comment cmt = new Comment(rs.getInt("Article_ID"),
                        rs.getString("account_username"),
                        rs.getString("cmt"),
                        rs.getInt("CheckCmt"),
                        rs.getInt("CmtID"));
                cmtList.add(cmt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cmtList;
    }

    public boolean updateCMT(int cmtID) {
        try {
            Statement stm = connection.createStatement();
            String strInsert = "update Comment set CheckCmt = 1 Where cmtID = '" + cmtID + "' ";
            stm.execute(strInsert);
            return true;
        } catch (Exception e) {
            System.out.println("Insert fail: " + e.getMessage());
            return false;
        }
    }

    public boolean addCmt(int Article_ID, String account_username, String cmt) {
        try {
            Statement stm = connection.createStatement();
            String strInsert = "insert into Comment values('" + Article_ID + "','" + account_username + "','" + cmt + "','" + 0 + "')";
            stm.execute(strInsert);
            return true;
        } catch (Exception e) {
            System.out.println("Insert fail: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteCMT(int cmtID) {
        try {
            Statement stm = connection.createStatement();
            String strInsert = "delete from Comment Where cmtID = '" + cmtID + "' ";
            stm.execute(strInsert);
            return true;
        } catch (Exception e) {
            System.out.println("Insert fail: " + e.getMessage());
            return false;
        }
    }
}
